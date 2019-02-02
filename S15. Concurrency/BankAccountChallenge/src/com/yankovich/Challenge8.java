package com.yankovich;

/**
 * Created by vyankovich on 2019-02-01
 */
public class Challenge8 {
    public static void main(String[] args) {
        final Tutor tutor = new Tutor();
        final Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(() -> tutor.studyTime());

        Thread studentThread = new Thread(() -> student.handInAssignment());

        tutorThread.start();
        studentThread.start();
    }
}

class Tutor {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive and hand in assignment
            Thread.sleep(300);
        } catch (InterruptedException e) {
            //
        }
        student.startStudy();
        System.out.println("Tutor is studying with student");
    }

    public void getProgressReport() {
        // something
        System.out.println("Tutor gave progress report");
    }
}

class Student {
    private Tutor tutor;

    public Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }
}
