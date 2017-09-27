package com.example;

public class Main {

    //Create a singleton class which is thread safe

    public static void main(String[] args) {

        MySingleTon st = MySingleTon.getInstance();
        st.getSomething();

    }
}
