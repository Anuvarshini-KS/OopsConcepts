package com.KovanLabs.Intern.InheritanceAndPolymorphism;
import java.util.*;
public class EmployeeTest {
    public static void main(String[]args)
    {
        Employee emp1 = new Employee(01,"Aash",45008.89);

        System.out.println("Employee id : "+emp1.getId());
        System.out.println("Employee name :"+emp1.getName());
        System.out.println("Employee Salary : "+emp1.getSalary());
    }
}
class Employee
{
    private final int id;
    private final String name;
    private final double salary;

    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
}
