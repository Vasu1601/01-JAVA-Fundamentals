class Titan{

}

class java1{
    public static void main(String[] args){
        var i = 10;
        String var = "Vasu";
        var arr = new int[5];
        var obj = new Titan();

        System.out.println(i);
    }
}

/*
================================================Notes=======================================================================================
In Java, the var keyword is used for local variable type inference. This means that the type of the variable is inferred by the compiler 
based on the value it is initialized with. The var keyword was introduced in Java 10.

1. The var keyword can only be used for local variables, i.e., variables declared inside methods, constructors, or initialization blocks.
2. The variable must be initialized at the point of declaration when using var.
3. The var keyword cannot be used for method parameters, return types, or fields (class-level variables).
4. Using var can make code more readable by reducing verbosity, but it should be used judiciously to avoid confusion and maintain code clarity.
=============================================================================================================================================         
*/