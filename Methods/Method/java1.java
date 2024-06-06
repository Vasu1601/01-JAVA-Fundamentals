//Basic methods in java

import java.util.*;

class Computer{

    public void playMusic(){
        System.out.println("Playing Music.....");
    }

    public String pen(int cost){
        if(cost>=10){
            return "Pen";
        }
        else{
            return "Nothing";
        }

    }
}

class java1{

    public static void main(String[] args){

        Computer obj = new Computer();
        obj.playMusic();

        String result = obj.pen(9);

        System.out.println(result);
    }
}