import java.util.*;

class java3{
    public static void main(String[] args){

        // if you need to return the value and store it in the variavle

        String day = "monday";
        
        String result = switch(day){
            case "saturday","sunday" -> "6am";
            case "monday" -> "8am";
            default -> "7am";
        };
        
        System.out.println(result);
    }
}