package domain;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class inscripcionTest {

    @Test
    public void incripcionSinCorrelativas() {
        Alumno unAlumno = new Alumno("Victoria", "Massaini", 1781080);

        Materia unaMateria = new Materia("quimica");

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMateria(unaMateria);

        Assert.assertTrue(unaInscripcion.aprobada());

    }
    @Test
    public void incripcionConCorrelativasAprobadas() {
        Alumno unAlumno = new Alumno("Juan", "Chiabrando", 1781081);

        Materia unaMateria = new Materia("analisisMatematicoI");
        Materia otraMateria = new Materia("analisisMatematicoII");
        otraMateria.agregarMateriaCorrelativa(unaMateria);

        unAlumno.agregarMateriaAprobada(unaMateria);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMateria(otraMateria);

        Assert.assertTrue(unaInscripcion.aprobada());

    }
    @Test
    public void incripcionConCorrelativasDesaprobadas() {
        Alumno unAlumno = new Alumno("Esteban", "Martinez", 1781082);

        Materia unaMateria = new Materia("fisicaI");
        Materia otraMateria = new Materia("fisicaII");
        otraMateria.agregarMateriaCorrelativa(unaMateria);

        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.agregarMateria(otraMateria);

        Assert.assertFalse(unaInscripcion.aprobada());

    }
}
