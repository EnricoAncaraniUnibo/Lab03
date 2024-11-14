package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxsStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor profetssor;
    private final ExamRoom room;
    private final Student[] students;

    public Exam(final int id, final int max, final String course, final Professor prof, final ExamRoom room) {
        this.registeredStudents = 0;
        this.id = id;
        this.maxsStudents = max;
        this.courseName = course;
        this.profetssor = prof;
        this.room = room;
        this.students = new Student[max];
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxsStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourse() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.profetssor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setRegisteredStudents(int reg) {
        this.registeredStudents = reg;
    }

    public void registerStudent(final Student student) {
        if(this.getRegisteredStudents()+1<this.getMaxStudents()) {
            this.students[this.getRegisteredStudents()] = student;
            this.setRegisteredStudents(this.getRegisteredStudents()+1);
        }
    }

    public String toString() {
        return this.getId() + " " + this.getCourse() + " " + this.getProfessor().getUsername() + " " + this.getRoom().getDescription() + " " + Arrays.toString(this.getStudents());
    }
}
