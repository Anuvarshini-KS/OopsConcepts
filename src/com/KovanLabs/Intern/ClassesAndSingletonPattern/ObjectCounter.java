package com.KovanLabs.Intern.ClassesAndSingletonPattern;

public class ObjectCounter {
    private static int count = 0;
    private  ObjectCounter()
    {
        count++;
    }
    public static int getCount()
    {
//        if(count==0) {
//            count++;
//        }
        return count;
    }
    public static void main(String[]args)
    {
        ObjectCounter count1 =  new ObjectCounter();
        ObjectCounter count2 = new ObjectCounter();
        ObjectCounter count3 = new ObjectCounter();
        ObjectCounter count4 = new ObjectCounter();
        System.out.println("The total count : "+ObjectCounter.getCount());
       /*  System.out.println(count1==count2);
        System.out.println(count3==count4);
        System.out.println(count1==count3);
        System.out.println(count4==count1);
        System.out.println(count2==count4); */
    }
}
