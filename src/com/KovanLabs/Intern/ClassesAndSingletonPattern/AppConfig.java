package com.KovanLabs.Intern.ClassesAndSingletonPattern;

public class AppConfig {
    public static void main(String[]args)
    {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        System.out.println(obj1==obj2);
    }
    private static AppConfig instance;
    private AppConfig()
    {
        System.out.println("Instance created");
    }
    public static AppConfig getInstance()
    {
        if(instance==null)
        {
            instance = new AppConfig();
        }
        return instance;
    }
}
