import java.util.*;
class frequency
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int visitedArr[] = new int[n]; 
        int visited = -1;
        System.out.println("Enter the Element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
            {
            int count = 1;
            if (visitedArr[i] != visited) // -1 means counted and 0 means not counted
                { 
                for (int j = i + 1; j < n; j++) 
                    {
                    if (arr[i] == arr[j]) 
                        {
                        count++;
                        visitedArr[j] = visited; 
                    }
                }
                System.out.println(arr[i]+" Is Present"+" "+count+" "+"Times");
            }
        }
    }
}
// This code takes an array input from the user and counts the frequency of each element in the array.
// It uses a secondary array to keep track of which elements have already been counted to avoid duplicate counts.

