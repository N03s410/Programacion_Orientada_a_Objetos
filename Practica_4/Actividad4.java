package actividad.pkg4;

import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;
    private int numeroNominas;
    private float sueldoPorHora;
    private String materia;

    // Constructor por defecto
    public Profesor() {}

    // Constructor con parámetros
    public Profesor(String nombre, int numeroNominas, float sueldoPorHora, String materia) {
        this.nombre = nombre;
        this.numeroNominas = numeroNominas;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = materia;
    }

    // Constructor de copia
    public Profesor(Profesor profesor) {
        this.nombre = profesor.nombre;
        this.numeroNominas = profesor.numeroNominas;
        this.sueldoPorHora = profesor.sueldoPorHora;
        this.materia = profesor.materia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroNominas() {
        return numeroNominas;
    }

    public void setNumeroNominas(int numeroNominas) {
        this.numeroNominas = numeroNominas;
    }

    public float getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(float sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Método para calcular el sueldo semanal
    public float calcularSueldoSemanal(int horasSemanales) {
        return sueldoPorHora * horasSemanales;
    }
}

class Alumno {
    private int matricula;
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Alumno() {}

    // Constructor con parámetros
    public Alumno(int matricula, String nombre, int edad, String curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    // Constructor de copia
    public Alumno(Alumno alumno) {
        this.matricula = alumno.matricula;
        this.nombre = alumno.nombre;
        this.edad = alumno.edad;
        this.curso = alumno.curso;
    }

    // Getters y setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

class ClasesYCursos {
    private List<String> materias;
    private List<String> cursos;

    // Constructor por defecto
    public ClasesYCursos() {
        this.materias = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Constructor con parámetros
    public ClasesYCursos(List<String> materias, List<String> cursos) {
        this.materias = materias;
        this.cursos = cursos;
    }

    // Constructor de copia
    public ClasesYCursos(ClasesYCursos clasesYCursos) {
        this.materias = clasesYCursos.materias;
        this.cursos = clasesYCursos.cursos;
    }

    // Getters y setters
    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    // Método para agregar materia
    public void agregarMateria(String materia) {
        this.materias.add(materia);
    }

    // Método para eliminar materia
    public void eliminarMateria(String materia) {
        this.materias.remove(materia);
    }

    // Método para agregar curso
    public void agregarCurso(String curso) {
        this.cursos.add(curso);
    }

    // Método para eliminar curso
    public void eliminarCurso(String curso) {
        this.cursos.remove(curso);
    }

    // Método para mostrar materias y cursos
    public void mostrarMateriasYCursos() {
        System.out.println("Materias: " + materias);
        System.out.println("Cursos: " + cursos);
    }
}

public class Actividad4 {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Profesor profesor = new Profesor("Juan", 1, 50.0f, "Matemáticas");
        Alumno alumno = new Alumno(1, "Pedro", 15, "Primero");
        ClasesYCursos clasesYCursos = new ClasesYCursos();

        // Agregar materias y cursos a la clase ClasesYCursos
        clasesYCursos.agregarMateria("Matematicas");
        clasesYCursos.agregarMateria("Ciencias");
        clasesYCursos.agregarCurso("Primero");
        clasesYCursos.agregarCurso("Segundo");

        // Mostrar materias y cursos
        clasesYCursos.mostrarMateriasYCursos();

        // Calcular sueldo semanal del profesor
        float sueldoSemanal = profesor.calcularSueldoSemanal(20);
        System.out.println("Sueldo semanal del profesor: " + sueldoSemanal);

        // Mostrar información del alumno
        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Edad del alumno: " + alumno.getEdad());
        System.out.println("Curso del alumno: " + alumno.getCurso());
    }
}