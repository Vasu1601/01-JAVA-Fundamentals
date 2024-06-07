import java.util.*;

class Students{
    String name;
    int rollno;
    int marks;
}

class java1{
    public static void main(String[] args){
        
        Students s1 = new Students();
        s1.name = "John";
        s1.rollno = 1;
        s1.marks = 89;

        Students s2 = new Students();
        s2.name = "Maria";
        s2.rollno = 2;
        s2.marks = 90;

        Students s3 = new Students();
        s3.name = "Ronnie";
        s3.rollno = 7;
        s3.marks = 100;

        Students[] student = new Students[3];//Now here you may think that we created three objects but here we created array of length 3 that can hold 3 references of the object
        //now we need to assign the objects to the array, this process help us while printing the valued

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i = 0; i<student.length; i++){
            System.out.println(student[i].name+" : "+student[i].marks);
        }

    }
}