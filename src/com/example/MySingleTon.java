package com.example;

public class MySingleTon {
    private static MySingleTon myObj;

    private MySingleTon(){

    }

    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }

    public void getSomething(){
        System.out.println("I am in the getSomething method!! ");
    }

}
