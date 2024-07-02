import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class java1{
    public static void main(String[] args) throws NumberFormatException, IOException{

        int num = 0;
        BufferedReader br = null;

        try{

            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);

            System.out.print("Please enter the number -> ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}


/*
================================================Notes=================================================================================
-- try statement can be used along with the finally clause to ensure that a resource is properly closed or released, 
regardless of whether an exception is thrown or not.

BufferedReader br = null;
           try {
               // create a new InputStreamReader to read from System.in
               InputStreamReader isr = new InputStreamReader(System.in);
               // create a new BufferedReader to read from the InputStreamReader
               br = new BufferedReader(isr);
   
               System.out.println("Enter your name:");
               // read a line of text from the BufferedReader
               String name = br.readLine();
   
               System.out.println("Hello, " + name + "!");
           }  
        finally{  
            if(br!=null)
             br.close();   //finally used to close the resources  regardless Excpetion occur or not  
}
Note : finally always execute either exception occured or not  so that it is  used to close the resources.
======================================================================================================================================          
*/