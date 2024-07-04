record PersonRecord(String firstName, String lastName, int age) {}

class PersonClass {
    private final String firstName;
    private final String lastName;
    private final int age;

    public PersonClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}


class java1 {
    public static void main(String[] args) {
        // Using the record class
        PersonRecord p1 = new PersonRecord("John", "Doe", 30);
        System.out.println("First Name (record): " + p1.firstName());
        System.out.println("Last Name (record): " + p1.lastName());
        System.out.println("Age (record): " + p1.age());
        System.out.println("Person (record): " + p1);
        PersonRecord anotherPersonRecord = new PersonRecord("John", "Doe", 30);
        System.out.println("Is same person (record): " + p1.equals(anotherPersonRecord));

        // Using the normal class
        /*
        PersonClass p1 = new PersonClass("John", "Doe", 30);
        System.out.println("First Name (class): " + p1.getFirstName());
        System.out.println("Last Name (class): " + p1.getLastName());
        System.out.println("Age (class): " + p1.getAge());
        System.out.println("Person (class): " + p1);
        PersonClass anotherPersonClass = new PersonClass("John", "Doe", 30);
        System.out.println("Is same person (class): " + p1.equals(anotherPersonClass));
        */
    }
}

/*
================================================Notes========================================================================================
1. Record classes, introduced in Java 14 and finalized in Java 16, simplify creating data-storing classes. They reduce boilerplate code, 
automatically generating constructors, getter methods, equals(), hashCode(), and toString() methods. This means you only need to define the 
data you want to store, and the rest is handled for you.

2. For example, record PersonRecord(String firstName, String lastName, int age) {} creates a complete data class in one line. In a regular class,
you would need multiple lines to define private fields, a constructor, getter methods, and override equals(), hashCode(), and toString() methods.

3. Record classes are inherently immutable. Fields in a record are final by default, meaning once a record is created, its state cannot be changed. 
This immutability ensures data consistency and thread safety.

4. Using record classes improves code readability and maintainability. With less boilerplate code, you can focus on the logic and functionality 
of your application. This results in cleaner, more concise code that is easier to understand and maintain.

5. Overall, record classes make creating data carrier classes quicker and easier, leading to shorter, more readable, and less error-prone code.
=============================================================================================================================================         
*/