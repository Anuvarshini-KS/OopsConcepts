package com.KovanLabs.Intern.CompositionAndDependencyInjection;

class Processor
{
    private String brand;
    private int speed;
    Processor(String brand,int speed)
    {
        this.brand = brand;
        this.speed = speed;
    }
    void showDetails()
    {
        System.out.println("Processor "+brand+" with Speed "+speed+"GHZ");
    }
}
class Ram
{
    private int size;
    Ram(int size)
    {
        this.size=size;
    }
    int getSize()
    {
        return size;
    }
    void showDetails()
    {
        System.out.println("Ram has "+size+"GB size");
    }
}
class Storage
{
    private String type;
    private int capacity;
    Storage(String type,int capacity)
    {
        this.type=type;
        this.capacity=capacity;
    }
    void showDetails()
    {
        System.out.println("Storage "+type+" has "+capacity+" GB");
    }
}
class Computer
{
    Processor processor;
    Ram ram;
    Storage storage;
    Computer(Processor processor,Ram ram,Storage storage)
    {
        this.processor=processor;
        this.ram=ram;
        this.storage=storage;
    }
    void showConfiguration()
    {
        System.out.println("--Computer Configutation--");
        processor.showDetails();
        ram.showDetails();
        storage.showDetails();
    }

    // Task 2

    void upgradeRam(Ram newRam)
    {
        if(newRam.getSize() > ram.getSize())
        {
            this.ram=newRam;
            System.out.println("Upgrade Successfull");
        }
        else
        {
            System.out.println("upgrade failed");
        }
        ram.showDetails();
    }
}
public class ComputerTest {
    public static void main(String[]args)
    {
        Processor processor = new Processor("Intel i5",4);
        Ram ram = new Ram(8);
        Storage storage = new Storage("SSD",520);
        Computer computer = new Computer(processor,ram,storage);
        computer.showConfiguration();

        //task 2

        Ram newRam = new Ram(16);
        computer.upgradeRam(newRam);
    }
}
