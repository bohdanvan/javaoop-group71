package com.bvan.javaoop.lessons1_2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p = new ProcPerson();
        p.name = "Taras";
        p.age = 25;

        String info = getPersonInfo(p);

        System.out.println(info);
    }

    private static String getPersonInfo(ProcPerson p1) {
        return "Hello, I'm " + p1.name + ", "
                + p1.age + " years old";
    }
}
