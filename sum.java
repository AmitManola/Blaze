import java.util.*;
class sum
{
    int sum=0;
    int a[]=new int[5];
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // int a[]= new int[5];
        int i;
        System.out.println("Enter the number:");
        sum obj = new sum();
        for(i=0;i<5;i++)
        {
            obj.a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            obj.sum=obj.sum+obj.a[i];
        }
        System.out.println("Sum="+obj.sum);
        sc.close();
    }
}
