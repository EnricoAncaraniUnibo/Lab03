package it.unibo.composition;

public class Student implements User {

    private static final String DOT = ".";
    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;
    private final String password;

    public Student(
        final int id,
        final String name,
        final String surname,
        final String password,
        final int matriculationYear
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public int getMatriculationYear() {
        return this.matriculationYear;
    }

    public String toString() {
        return "Student ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", matriculationYear=" + this.matriculationYear
            + "]";
    }

    @Override
    public String getUsername() {
        return this.name + Student.DOT + this.surname;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
