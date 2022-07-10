package com.syntax.class25;

public class Task1 {
   /*
Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
 */
   public static void main(String[] args) {


       File[] files = {new JavaFile(), new PdfFile(), new WordFile()};
       for (File file : files) {
            file.open();       }
       //new JavaFile().open();


   }
}
abstract class File{

    private String name;
    //File(String name){
       // this.name=name;}

   abstract void open();

   void edit(){
       System.out.println("Editing the file");
   }
   void close(){
       System.out.println("Closing the file");
   }
}
class JavaFile extends File{



    @Override
    void open() {
        System.out.println("Use Intellij to open Java file");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("Use Microsoft word to open the word file");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("Use Adobe reader to open the pdf file");
    }
}