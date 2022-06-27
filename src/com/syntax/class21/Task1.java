package com.syntax.class21;

public class Task1 {
    /*
Write program: userClass  that has a constructor that
initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable
and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */
}
class userClass{
    String name;
    String mobileNumber;

    public userClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends userClass{
    String userAdress;
    public UserInfo(String name, String mobileNumber,String userAdress) {
        //this.userAdress =userAdress;// we can`t write any line before the super () line.
        super(name, mobileNumber);
        this.userAdress=userAdress;
    }
    void prinInfo(){
        System.out.println("Name "+name+" Mobile Number "+mobileNumber+" User adress "+userAdress);
    }
}
