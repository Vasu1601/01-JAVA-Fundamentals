//Classes and objects basics
import java.util.*;

class Calculator{
    int a =5;//This is instance variable and remember all the instance variables are stored in heap memory

    public int add(int num1,int num2){//Here num1 and num2 are parameters
        int r = num1 + num2;//num1 and num2 are the local variable and they are stored in stack memory
        return r;
    }
}


class java1{
    public static void main(String[] args){
      int n1 = 4;
      int n2 = 5;

      Calculator c1 = new Calculator();//c1 is a reference variable not an object, always remember that
      Calculator c2 = new Calculator();

      int result = c1.add(n1,n2);

    //   System.out.print(result);
      c1.a = 8;
      System.out.println(c1.a);
      System.out.println(c2.a);

    }
}


//To understand more about the stack and heap memory watch the below video
//https://www.youtube.com/watch?v=_GK3WoFFKUE&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=28