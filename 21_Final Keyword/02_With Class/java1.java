final class Calc{
    public void show(){
        System.out.println("This is Calc");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc{

}

class java1{
    public static void main(String[] args){

        AdvCalc obj = new AdvCalc();
        obj.add(5,6);
    }
}

/*
================================================Notes=================================================================================
    The final keyword in case of class is basically used to stop the inheritance and if you make any class final and then try to 
    extends the class then it will give an error.
======================================================================================================================================
*/