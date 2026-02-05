class Subject
{
    int sum(int a, int b)
    {
        return a+b;
    }
}
class SubSubject extends Subject
{
    
    @Override
    int sum(int a, int b) {
        return super.sum(a, b) * 2; // Example of overriding sum method
    }
}
class Polymorphism
{
    public static void main(String[] args) {
        Subject obj = new Subject();
        int result = obj.sum(5, 10);
        System.out.println("The sum is: " + result);
        SubSubject subObj = new SubSubject();
        int subResult = subObj.sum(5, 10);
        System.out.println("The overridden sum is: " + subResult);
    }
}
