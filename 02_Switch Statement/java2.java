import java.util.*;

class java2{

    public static void main(String[] args){
      
    //   New syntax where you don't need to put break
    String day = "monday";

    switch(day){
        case "sunday","saturday" -> System.out.println("6am");
        case "monday" -> System.out.println("8am");
        default -> System.out.println("7am");
    }

    }

}