package domain;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Integer legajo;
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        // en el constructor podria poner que la Facultad (objeto) le proporcione un nro de legajo al alumno
        // para simplificar las cosas, lo paso como parametro
        this.legajo = legajo;
        this.materiasAprobadas = new HashSet<Materia>();
    }
    // podria hacer un set de nombre y apellido pero lo haria privado, solo el mismo alumno va a poder cambiar su nombre/apellido
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public boolean tieneAprobadas(Set<Materia> materias) {
        return materiasAprobadas.containsAll(materias);
    }
}
