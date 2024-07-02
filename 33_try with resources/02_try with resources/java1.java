import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class java1{
    public static void main(String[] args) throws IOException{

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = br.readLine();
   
            System.out.println("Hello, " + name + "!");
        }  

    }
}

/*
================================================Notes=================================================================================
1. In later version of java a new concept try with resources was introduces where you don't have to close the resource but it 
   automatically closes the resource.

try with resource 
try-with-resources statement, we can simplify this code and avoid the need for a finally block:

e.g
BufferedReader br = null;
           try(br = new BufferedReader(new InputStreamReader(System.in))) {
               System.out.println("Enter your name:");
               // read a line of text from the BufferedReader
               String name = br.readLine();
   
               System.out.println("Hello, " + name + "!");
           }  
    catch(IOException e){
        // write code that you need
    }
        
}

it is for those who are curious to learn more about exception handling
2. try with with multiple resource 
-- In Java, you can use the try-with-resources statement to close multiple resources automatically. 
   The try-with-resources statement is a feature introduced in Java 7 that allows you to declare resources 
   within a try block and ensure that they are closed automatically when the block is exited, whether normally 
   or due to an exception.

e.g
try (Resource1 res1 = new Resource1();
     Resource2 res2 = new Resource2()) {
    // code that uses the resources
} catch (Exception e) {
    // exception handling code
}

-- Resource1 and Resource2 are classes that implement the AutoCloseable interface, 
which allows them to be used in the try-with-resources statement. 

-- The code within the try block uses these resources, and they are automatically closed when the block is exited, 
either normally or due to an exception. If an exception is thrown, the catch block can handle it as necessary.

-- Resource1 and Resource2 are declared and instantiated within the try-with-resources statement. If the resources are 
already instantiated before the try block, we can simply pass them as arguments to the statement.

-- the resources are closed automatically when the try block is exited, 
and there's no need to explicitly call their close() methods.

In multiple statement inside try, order of closing resources:
-- Resources declared within a try-with-resources statement are closed in 
the reverse order of their declaration, from right to left. 


-- Resource1 is declared first, followed by Resource2, and then Resource3. 
When the try block is exited, the resources will be closed in the following order:

Resource3
Resource2
Resource1

-- order is reversed from the order of declaration, with the resource declared last (Resource3) being closed first, 
and the resource declared first (Resource1) being closed last.

Important: 
It's important to note that the order of resource declaration matters when using try-with-resources, 
especially if the resources are dependent on each other. For example, if Resource2 depends on Resource1 and 
Resource3 depends on both Resource1 and Resource2, then they should be declared in the correct order to avoid any 
potential issues during closing.

======================================================================================================================================          
*/