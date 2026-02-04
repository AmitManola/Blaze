class Grandparent {
    void printMessage() {
        System.out.println("Message from Grandparent");
    }
}
class Parent extends Grandparent 
{
    @Override
    void printMessage() {
        System.out.println("Message from Parent");
    }
}
class Child extends Parent 
{
    @Override
    void printMessage() {
        System.out.println("Message from Child");
        System.out.print("Calling super.printMessage(): ");
        super.printMessage();
    }
}
public class C04_02 
{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printMessage();
    }
}