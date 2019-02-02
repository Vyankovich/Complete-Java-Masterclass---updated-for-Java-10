package com.yankovich;

/**
 * created by vyankovich on 01.02.2019
 */
public class DeadlockFix {

    public static void main(String[] args) {
        final NewPolitePerson jane = new NewPolitePerson("Jane");
        final NewPolitePerson john = new NewPolitePerson("John");

        new Thread(() -> jane.sayHello(john)).start();

        new Thread(() -> john.sayHello(jane)).start();
    }

    static class NewPolitePerson {
        private final String name;

        public NewPolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void sayHello(NewPolitePerson person) {
            synchronized (this) {
            System.out.format(ThreadColor.ANSI_CYAN + "%s: %s" + " has said hello to me!(%s)%n", this.name, person.getName(),
                    Thread.currentThread().getName());

                person.sayHelloBack(this);
            }
        }

        public void sayHelloBack(NewPolitePerson person) {
            System.out.format(ThreadColor.ANSI_PURPLE + "%s: %s" + " has said hello back to me!(%s)%n", this.name, person.getName(),
                    Thread.currentThread().getName());
        }
    }

}