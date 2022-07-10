package com.syntax.class25;

public interface IP65 {
     //private String make = "LG";interface can only have public fields
    //protected String make="LG";interface can only have public fields

    //public static final String make="LG";no need to write public static final because all the fields
    //String make="Samsung";
    void wash();


interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}
class S21Ultra implements IP65,FastChargeAble,FiveG {


    @Override
    public void wash() {
        System.out.println("You guys can wash me easily ezi pizi no issue");
    }

    @Override
    public void charging() {
        System.out.println(" isupport fast charging npw because i have implemented this requirement ");
    }

    @Override
    public void speed() {
        System.out.println("you can download things super fast because now i also implanted this ");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra();
        ip65.wash();
    }

}
}
