import java.util.*;
class sumOfArray
{
    public static void main(String[] args) 
    {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the numbers:");
        for(i=0;i<5;i++)
            {
                a[i]=sc.nextInt();
            }   
        for(i=0;i<5;i++)
            {
                sum=sum+a[i];
            }
        System.out.println("Sum="+sum);
        sc.close();
    }
}