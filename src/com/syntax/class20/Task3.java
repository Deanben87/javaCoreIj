package com.syntax.class20;

public class Task3 {
    /*Write a Java program called Teacher.
     Identify features and behaviour of that Class.
     Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Dean";
        chemistryTeacher.favoriteChemSubject="Organic";
        chemistryTeacher.teachesChemistry();
    }




}
class Teacher{
    String name;
    String typeOfTeacher;
   public void teach(){
        System.out.println(name+" Teaches "+typeOfTeacher);
    }

}
class MathTeacher extends Teacher{
    String favoriteMathSubject;
    public void teachesMath() {
        System.out.println(name + " " + " Teaches Math and his favorite math subject is " + favoriteMathSubject);
    }
}
class ChemistryTeacher extends Teacher{
    String  favoriteChemSubject;
    public void teachesChemistry(){
        System.out.println(name + " " + " Teaches Chemistry and his favorite Chem subject is " + favoriteChemSubject);
    }

        }
        class PianoTeacher extends Teacher{
    String favoriteModelOfPiano;
    public void teachPiano(){
        System.out.println(name + " " + " Teaches Chemistry and his favorite piano subject is " + favoriteModelOfPiano);
    }
        }