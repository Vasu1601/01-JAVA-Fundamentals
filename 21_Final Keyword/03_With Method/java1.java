class Calc{

    public final void show(){
        System.out.println("In Calc");
    }
}

class AdvCalc extends Calc{
    public void show(){
        System.out.println("In AdvCalc");
    }
}

class java1{
    public static void main(String[] args){
        AdvCalc obj = new AdvCalc();
        obj.show();
    }
}

/*
================================================Notes=================================================================================
    The final keyword in case of methods is used to stop the method overriding by the child class
======================================================================================================================================
*/