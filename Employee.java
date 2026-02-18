 public class Employee {
    String name;
    int age;
    float salary;
    Employee(String name, int age, float salary) {

        if (name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("Name should not exceed 20 characters.");
            this.name = name.substring(0, 20);
        }

        if (age > 5) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 5.");
            this.age = 6; // default value
        }

        if (salary > 100000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 1,00,000.");
            this.salary = 100001; // default value
        }
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

 class Main 
 {
    public static void main(String[] args) 
    {

        Employee e1 = new Employee("Amit Manola", 20, 150000);

        e1.display();
    }
}
