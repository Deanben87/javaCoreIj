package com.syntax.class17;

public class TeacherClass {

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Harvard";
        teacher.printInfo();

        /*
        Because printInfo is piblic we can all
        it in other classes and because its the
        part of Teacher class it can access the
        private fields which in turn let us access
        those fields
         */
    }

}
