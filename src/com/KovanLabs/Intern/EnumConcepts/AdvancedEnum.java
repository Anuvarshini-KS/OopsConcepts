package com.KovanLabs.Intern.EnumConcepts;

enum Operation
{
    ADD{
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT{
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    },
    MULTIPLY{
        @Override
        double apply(double x, double y) {
            return x*y;
        }
    };
    abstract double apply(double x,double y);
}
public class AdvancedEnum {
    public static void main(String[] args)
    {
        Operation op = Operation.ADD;
        double result = op.apply(10,5);
        System.out.println("The result is : "+result);
    }
}
