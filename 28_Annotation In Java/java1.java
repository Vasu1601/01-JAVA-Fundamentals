class A{
    public void showThisToTheUser(){
        System.out.println("In A Show");
    }
}

class B extends A{
    @Override
    public void showThisToTheUser(){
        System.out.println("In B Show");
    }
}

class java1{
    public static void main(String[] args){
        B obj = new B();
        obj.showThisToTheUser();
    }
}

/*
================================================Notes=================================================================================
    1. What is Annotations?
       -- annotation is type of comment which is used to provide meta data to the compiler and JVM about the program.

       Basic difference between comment and annotations
       -- annotation is used to provide meta data to the compiler and JVM about the program but comment is used to provide information 
          to the programmer.

    2. What does annotations provide to program and what does for program?
       -- Annotations are used to provide supplemental information about a program. 
       -- Annotations start with ‘@’.
       -- Annotations do not change the action of a compiled program.
       -- Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods,
          classes, etc.
       -- Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for 
          example.
        
    3. How annotation prevent us from logical error?
       class A{
               public void show(){
                   System.out.println("In A");
               }
       
               public void display(){
                   System.out.println("In A");
               }
         }
       
         class B extends A{
               @Override
               public void show(){
                   System.out.println("In B");
               }
             /*   @Override
               public void displayData(){
                   System.out.println("In B");
               }
         

           //here you get error because you are not overriding the method of parent class but you are using @Override annotation 
          // if you are thinking I can override display() method but you should defined new method but whenever you mention @override compiler throw error that you are not override the parent class method 
           //it helps to avoid the logical error in the program because logical error is more difficult to find when you use annotation it helps to find the logical error
           //because solving problem at compile time error  is easy than solving problem at runtime 

 
         }
======================================================================================================================================          
*/