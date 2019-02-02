package com.yankovich;

/**
 * Created by vyankovich on 2019-02-01
 */
public class Challenge9 {
    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(() -> tutor.studyTime());

        Thread studentThread = new Thread(() -> student.handInAssignment());

        tutorThread.start();
        studentThread.start();
    }
}

class NewTutor {
    private NewStudent student;

    public void setStudent(NewStudent student) {
        this.student = student;
    }

    public void studyTime() {
        synchronized (this) {
            System.out.println("Tutor has arrived");
            try {
                // wait for student to arrive and hand in assignment
                this.wait();
            } catch (InterruptedException e) {
                //
            }
            student.startStudy();
            System.out.println("Tutor is studying with student");
        }
    }

    public void getProgressReport() {
        // something
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {
    private NewTutor tutor;

    public NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (tutor) {
            tutor.getProgressReport();
            System.out.println("Student handed in assignment");
            tutor.notifyAll();

        }
    }
}
