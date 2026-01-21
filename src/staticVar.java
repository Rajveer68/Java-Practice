
class Car{
    String Company;
    String model;
    static String ProductType;
    // Static keyword means that you are making something as a class member, not an object member.
    int MnfYear;

     public Car(String Company,String model,int MnfYear){
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

    void display(){
        System.out.println(ProductType + ": " + Company + " " + model + " " + MnfYear);
    }
}
public class staticVar {



    void main() {

        Car.ProductType = " Car";

        /* When you define a variable inside a class with the static keyword,
        Java allocates memory for that variable once per class, not per object.

            Location: It lives in a special area of memory called the Metaspace
            (or Method Area) associated with the Car class.

            Access: Because you wrote Car.ProductType = "Car";, you are telling Java:
            "Go to the Car class and update its shared ProductType variable."
*/
        Car c1 = new Car("BMW","320i",2010);
        c1.display();

        Car c2 = new Car("BMW","M5",2025);
        c2.display();



    }

}

