import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [Age =" + age + ", Name = " + name +"]";
    }

    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }

}

class java1{
    public static void main(String[] args){

        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.age > j.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(21, "Jimmy"));
        studs.add(new Student(15, "Alex"));
        studs.add(new Student(18, "Steven"));
        studs.add(new Student(39, "Marie"));

        Collections.sort(studs, com);

        for(Student s : studs){
            System.out.println(s);
        }
    }
}

/*
================================================Notes=================================================================================
#1
- Integer class implements a Comparable interface. So by default, sort works for Integer.
- If you want to do natural sorting on any other non-defined class, you can implement something called the Comparable.
- Comparable is present in the lang package.
- Comparable has a method known as compareTo(). 
- You have to define the method comapreTo() in a class, that is implementing Comparable.
 class Student implements Comparable Student
 {
  public int compareTo( Student that){
   statements;
  }
 }
Here, that is a variable.
- We can also override the logic by using Comparator even if we have implements the Comparable interface.
- Lambda expression can also be used with Comparator as it is a functional interface.

 #2
Difference between Comparable & Comparator:
- Comparable provides a single sorting sequence while the Comparator provides multiple sorting sequences.
- In Comparable, actual gets modified while in Comparator, the original class does not get affected.
- Comparable gives the compareTo() method for sorting while Comparator gives the compare() method to sort elements.
======================================================================================================================================          
*/