package it.unibo.composition;

public class Professor implements User{

    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, final String password, final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    @Override
    public String getUsername() {
        return this.name + "." + this.surname;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getDescription() {
       return this.toString();
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

    public String[] getCourses() {
        return this.courses;
    }

    public void replaceCourse(final String corso, final int index) {
        this.courses[index] = corso;
    }

    public void replaceAllCourses(final String[] corsi) {
        this.courses = corsi;
    }
}
