class Human{

    private int age;
    private String Name;

    //The current code works fine with Java's default no-arg constructor.DOnt need to make a constructor here
    // But we can make a parameterised constructor if we want to initialise the variables in the constructor.
    // It will make object creation easier... Human obj = new Human(19, "Rajveer");
    /*
    public Human(int age, String name) {
    if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
    this.age = age;
    this.Name = name;
}

Constructor with validation (even better encapsulation)
     */

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }
}

public class Encapsulation {

    public static void main( String [] args){

//        Human obj = new Human();
//        obj.setAge(19,obj);
//        obj.setName("Rajveer");
//
//        Human obj1 = new Human();
//        obj1.setAge(14,obj1);
//        obj1.setName("Taranveer");

        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Rajveer");

        Human obj1 = new Human();
        obj1.setAge(14);
        obj1.setName("Taranveer");



        System.out.println(obj.getName() + " : "+ obj.getAge());
        System.out.println(obj1.getName() + " : "+ obj1.getAge());

    }
}
