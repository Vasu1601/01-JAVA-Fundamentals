import java.util.*;

class java1{
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Vasu");
        sb1 = sb1.append(" Mehta");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.deleteCharAt(2));

        String str = sb1.toString();
        System.out.println(str);

    }
}

/*
================================================Notes===============================================
    As the name Suggest StringBuffer will provide extra length to your string to remove that memory
    reallocation problem and by default it's 16. You can check capacity of StringBuffer by using
    .capacaity() method.

    Remeber that capacity and length are to different things.

    You cannot set the StringBuffer value to String directly, you need to use .toString() method to 
    do that. 

    When you append something to StringBuffer and the print it's capacity it will be same because it 
    will adjust it in the already provided extra 16 bit capacity.

    You can insert at specific index using .insert() method

    You can even delete character at specific index using .deleteCharAt() method.

    String buffer also supports many methods such as substring etc you can read about them from the
    internet, this can be very useful in production and live projects.

    Important - StringBuffer and StringBuilder are almost same but only important difference is that
    StringBuffer is Thread safe and StringBuilder is not. 
====================================================================================================
*/