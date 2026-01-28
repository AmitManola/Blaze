import java.util.*;
class Duplicate
{
    int a[]=new int[10];
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       Duplicate obj = new Duplicate();
       int i,j;
       System.out.println("Enter the numbers:");
       for(i=0;i<10;i++)
        {
            obj.a[i]=sc.nextInt();
        } 
        for(i=0;i<10;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(obj.a[i]==obj.a[j])
                {
                    System.out.println("Duplicate");
                    break;
                }
            }
        }
         System.out.println("Not Duplicate10");
         sc.close();
    }
}