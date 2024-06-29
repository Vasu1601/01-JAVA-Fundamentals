@FunctionalInterface
interface A{
    void show(int i);
}

class java1{

    public static void main(String[] args){

        A obj = (int i) ->
        {
            System.out.println("In show " + i);
        };

        obj.show(5);

        //you can also do this in case you have only one Parameter
        A obj1 = i -> System.out.println("In Another Show " + i);
        obj1.show(10);
    }

}