package com.syntax.Hw;

public abstract class file {

   abstract void open();

    void edit(){
        System.out.println("edit the file ");
    }

    void close(){
        System.out.println("close the file");
    }
}
class JavaFile extends file{

    @Override
    void open() {
        System.out.println("to open the java file we need notepad++");
    }
}
class WordFile extends file{

    @Override
    void open() {
        System.out.println("to open word file we need microsoft office ");
    }
}
class Pdf extends file{

    @Override
    void open() {
        System.out.println("to open pdf file we need adobe reader");
    }
    }


