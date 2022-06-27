package com.syntax.Hw;

public class fileTester {
    public static void main(String[] args) {

    file [] files={new JavaFile(),new WordFile(),new Pdf()};

    for(file f:files){
        f.open();
        f.edit();
        f.close();
    }
    }
}
