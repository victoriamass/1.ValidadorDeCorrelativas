package domain;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasSolicitadas;
    private Alumno alumnoSolicitante;

    // hago un constructor
    public Inscripcion(Alumno alumno) {
        this.alumnoSolicitante = alumno;
        this.materiasSolicitadas = new HashSet<Materia>();
    }

    // solo voy a crear getter
    public Set<Materia> getMateriasSolicitadas() {
        return materiasSolicitadas;
    }
    public Alumno getAlumnoSolicitante() {
        return alumnoSolicitante;
    }
    //

    public void agregarMateria(Materia materiaNueva){
        this.materiasSolicitadas.add(materiaNueva);
    }

    public boolean aprobada(){
        return materiasSolicitadas.stream()
                .allMatch(materia -> alumnoSolicitante.tieneAprobadas(materia.getMateriasCorrelativas()));
    }
}
