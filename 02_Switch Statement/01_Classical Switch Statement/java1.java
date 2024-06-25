import java.util.*;

class java1{

    public static void main(String[] args){

    //  classical switch statement
    String day = "sunday";

    switch(day){
        case "saturday","sunday":
            System.out.println("6am");
            break;
        
        case "monday":
            System.out.println("8am");
            break;

        default:
            System.out.println("7am");
    }

    }

}