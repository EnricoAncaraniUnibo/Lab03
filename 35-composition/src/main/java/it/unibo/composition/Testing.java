package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student s1 = new Student(1, "Enrico", "Ancarani", "banana", 2023);
        Student s2 = new Student(2, "Alessio", "Minniti", "banana", 2023);
        Student s3 = new Student(3, "Francesco", "Meloni", "banana", 2023);
        // 2)Creare 2 docenti a piacere
        String[] array = new String[]{"latino","greco"}; 
        Professor p1 = new Professor(100, "Paolo", "gigio", "banana",array);
        Professor p2 = new Professor(101, "Andrea", "gigio", "asda",array);
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom er1 = new ExamRoom(100, "aula 1", false, false);
        ExamRoom er2 = new ExamRoom(80, "aula 2", false, false);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam e1 = new Exam(200, 10, "latino", p1, er1);
        Exam e2 = new Exam(201, 2, "latino", p2, er2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        e1.registerStudent(s1);
        e1.registerStudent(s2);
        e1.registerStudent(s3);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
