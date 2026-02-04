package com.KovanLabs.Intern;

public class SingletonPractice {
    private static SingletonPractice instance = new SingletonPractice();
    private SingletonPractice()
    {
        System.out.println("String Instance created");
    }
    public static SingletonPractice getInstance()
    {
//        if(instance==null)
//        {
//           String instance = new String();
//        }
        return instance;
    }
    public static void main(String[]args)
    {
       SingletonPractice s1 = SingletonPractice.getInstance();
       SingletonPractice s2 = SingletonPractice.getInstance();
        System.out.println(s1==s2);
    }
}