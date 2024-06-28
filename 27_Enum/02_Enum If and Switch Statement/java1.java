enum Status{
    Running, Failed, Pending, Success;
}

class java1{
    public static void main(String[] args){
        
        Status s = Status.Pending;

        switch(s){
            case Running:
                System.out.println("All good");
                break;
            
            case Failed:
                System.out.println("Something went wrong");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Task Completed");
        }

        if(s == Status.Running){
            System.out.println("All good");
        }
        else if(s == Status.Failed){
            System.out.println("Something went wrong");
        }
        else if(s == Status.Pending){
             System.out.println("Please wait");
        }
        else if(s == Status.Success){
             System.out.println("Task Completed");
        }
        
    }
}

/*
================================================Notes=================================================================================
    1. - We can compare the status or values of an enum by using the if- else condition.
       - Switch supports string, integer etc, and it also support enum.
       - In switch() you need to pass an object reference variable as a parameter.

    2. -  In switch case, we do not have to pass the object refernce variable again and again. We have to only pass the constant
          itself.
======================================================================================================================================          
*/