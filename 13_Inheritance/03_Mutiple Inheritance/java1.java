/*
================================================Notes=================================================================================
    1. Multiple inheritance
       If a particular class inheriting multiple class then this type of inheritance is called multiple inheritance.
       like c++ language there are multiple inheritance like that :
       class A
       { 
       ... .. ... 
       };
       class B
       {
       ... .. ...
       };
       class C: public A,public B
       {
       ... ... ...
       }; 

       But Java not allowed  we have alternate option for that is implementing multiple interface not we will discussing in 
       upcoming lecture.

    2. why java not support multiple inheritance?
       =Because of the Ambiguity problem, Java does not support multiple inheritances directly.

    3. Why it is ambiguous?
        suppose we have some class A, B and c
        class A
        { 
        ... .. ... 
        show(){

        }
        };
        class B
        {
        ... .. ...
        show(){

        }
        };
        class  C extends A,B //assume for some instance java support multiple inheritence
        {
        ... ... ...
        show(); 
        //here we get ambiguity since if we allowed multiple inheritance and same two property or method belong to class A and Class B 
        //then how C class use show() method there is ambiguity of choice...
        //that’s why java exclude the concept of multiple inheritance

        }; 
======================================================================================================================================
*/