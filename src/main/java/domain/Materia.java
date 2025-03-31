package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<>();
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarMateriaCorrelativa(Materia materiaCorrelativa) {
        this.materiasCorrelativas.add(materiaCorrelativa);
    }
}
