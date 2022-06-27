package com.syntax.Hw;
public class Teacher {
    String name;
    String lang;
    int age;
    public void print() {
        System.out.println("Teacher name is " + name + " speak " + lang + " her age is " + age);
    }
}
    class MathTeacher extends Teacher {
        MathTeacher(String name, String lang, int age) {
            this.name = name;
            this.lang = lang;
            this.age = age;
        }
    }
        class ChemistryTeacher extends Teacher {
            ChemistryTeacher(String name, String lang, int age) {
                this.name = name;
                this.lang = lang;
                this.age = age;
            }
        }
        class PianoTeacher extends Teacher {
                PianoTeacher(String name, String lang, int age) {
                    this.name = name;
                    this.lang = lang;
                    this.age = age;
                }
                public static void main(String[] args) {
                    MathTeacher m1=new MathTeacher("Amine","English,Arabic",35);
                            m1.print();
                    ChemistryTeacher c1=new ChemistryTeacher("Salim","English,Spanish",33);
                    c1.print();
                    PianoTeacher p1=new PianoTeacher("Mahmoud ","English,Urdu ",31);
                    p1.print();





                }
            }






