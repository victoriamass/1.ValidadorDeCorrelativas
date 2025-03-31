package domain;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    @org.testng.annotations.Test
    public void incripcionConCorrelativas() {
        Alumno unAlumno = new Alumno(Victoria, Massaini, 1781080);

        Materia unaMateria = new Materia(fisica);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMateria(unaMateria);
        Ass

    }
}
