package com.KovanLabs.Intern.InterfaceAndAbstraction;

interface Camera{
    default void start()
    {
        System.out.println("Camera is starting");
    }
    void takePhoto();
}
interface MusicPlayer
{
    default void start()
    {
        System.out.println("MusicPlayer is starting");
    }
    void playMusic();
}
interface Phone
{
    void call(String number);
}
public class SmartPhone implements Camera,MusicPlayer,Phone
{
    public void start()
    {
        System.out.println("SmartPhone is starting");
        Camera.super.start();
    }

    @Override
    public void takePhoto() {
        System.out.println("Take photo now");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music now");
    }

    @Override
    public void call(String number) {
        System.out.println("Call : "+number);
    }
    public static void main(String[]args)
    {
        SmartPhone sp = new SmartPhone();
        sp.start();
        sp.takePhoto();
        sp.playMusic();
        sp.call("7658932456");
    }
}
