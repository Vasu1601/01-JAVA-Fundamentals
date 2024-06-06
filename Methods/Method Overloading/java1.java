//Method overloading means that same function name but with different parameters

import java.util.*;

class Calculator{

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }
}

class java1{
    public static void main(String[] args){

        Calculator obj = new Calculator();
        int result1 = obj.add(1,2,3);
        int result2 = obj.add(1,2);
        double result3 = obj.add(1.5,1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}