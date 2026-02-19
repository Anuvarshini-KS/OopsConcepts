package com.KovanLabs.Intern.RpgBattleSystem;

import java.io.CharConversionException;

abstract class Character
{
    String name;
    int strength,health;
    Character(String name, int health, int strength )
    {
        this.name=name;
        this.health=health;
        this.strength=strength;
    }
    abstract void attack(Character enemy);
    boolean isAlive() {
        return health>0;
    }

    public void attal() {
    }
}
class Warrior extends Character
{
    Warrior(String name)
    {
        super(name,120,15);
    }
    public void attack(Character enemy)
    {
        int damage = strength+(int)(Math.random()*10);
        enemy.health-=damage;
        System.out.println(name+" attacks and the damage is "+damage);
    }
}
class Mage extends Character
{
    Mage(String name)
    {
        super(name,80,25);
    }
    public void attack(Character enemy)
    {
        int damage = strength+(int)(Math.random()*5);
        enemy.health-=damage;
        System.out.println(name+" attacks and the damage is "+damage);
    }
}
class Rouge extends Character
{
    Rouge(String name)
    {
        super(name,100,18);
    }
    public void attack(Character enemy)
    {
        if(Math.random() < 0.3)
        {
            System.out.println(name + " avoided the attack");
            return;
        }
        int damage = strength+(int)(Math.random()*5);
        enemy.health-=damage;
        System.out.println(name+" attacks and the damage is "+damage);
    }
}
public class BattleArena {
    public static void main(String[]args)
    {
        Character p1 = new Warrior("warrior");
        Character p2 = new Mage("mage");
        System.out.println("The battle started!");
        while(p1.isAlive() && p2.isAlive())
        {
            p1.attack(p2);
            if(!p2.isAlive()) break;
            p2.attack(p1);
            System.out.println(p1.name+ "'s health is "+p1.health);
            System.out.println(p2.name+"'s health is "+p2.health);
            System.out.println("------------------------");
        }
        if(p1.isAlive())
        {
            System.out.println(p1.name+" wins the battle!");
        }
        else
        {
            System.out.println(p2.name+" wins the battle!");
        }
    }

}
