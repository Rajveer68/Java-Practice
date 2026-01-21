
class Car1{
    String Company;
    String model;
    static String ProductType;
    // Static keyword means that you are making something as a class member, not an object member.
    int MnfYear;

    static {
        ProductType = "Car";
        System.out.println("This is a static block");
    }
// Static block will always be called before the main method, when we are loading the class. Irrespective of the fact if we need the static declared variables or not.
    public Car1(String Company,String model,int MnfYear){
        this.Company=Company;
        this.model=model;
//        Car.ProductType =ProductType;
        this.MnfYear=MnfYear;
    }

    /*  We should not write the static variables in the constructor because
     * A constructor runs every time you create a new object. Because a static
     * variable is shared by all objects, every time you create a new Mobile,
     * you will overwrite the value for all previous ones.
     *
     * */

    public void display(){
        System.out.println(ProductType + ": " + Company + " " + model + " " + MnfYear);
    }

    public static void show(){
        System.out.println("This is a static method");
    }

    // We can only use static variables inside static methods.
    //But there's a indirect way to use non-static variables with static methods i.e by passing objects as a patameters

    public static void show1(Car1 c){
        // Correct: Accessing static directly, instance via the parameter 'c'
        System.out.println(ProductType + ": " + c.Company + " " + c.model + " " + c.MnfYear);
    }

    // Its because the static belongs to the class and these non static variables belongs to the object.
    // because of which it does not knows which object to refer to until we pass it as a parameter.


}

public class staticMethods{


    public static void main() {

//        Car1.ProductType = " Car";

        /* When you define a variable inside a class with the static keyword,
        Java allocates memory for that variable once per class, not per object.

            Location: It lives in a special area of memory called the Metaspace
            (or Method Area) associated with the Car class.

            Access: Because you wrote Car.ProductType = "Car";, you are telling Java:
            "Go to the Car class and update its shared ProductType variable."
*/
        Car1 c1 = new Car1("BMW","320i",2010);
        c1.display();

        Car1 c2 = new Car1("BMW","M5",2025);
        c2.display();

        Car1.show();
        Car1.show1(c1);
        Car1.show1(c2);


    }

}

