sealed class A permits B,C{

}

final class B extends A{

}

final class C extends A{

}

// class D extends A{
    //This class will give error
// }

class java1{
    public static void main(String[] args){

    }
}

/*
================================================Notes=======================================================================================
Now we do have a final keyword which permits the inheritance of particular class by other classes but what if we want that only the limited 
classes that we want can extends the particular class ->

1. For this we got a new feature in Java 17 known as sealed classes or sealed keyword using which we can permit only the classes we wanted to
   inherit the class.

2. Condition being that classes which inherit the sealed class should be either sealed, non-sealed or final.

3. Now if you want that your child class can be further inherited by other classes you can make it non-sealed.

4. sealed can be used with interfaces as well
=============================================================================================================================================         
*/