import java.util.Scanner;
class Sorting{
    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for(int i=1 ; i<n ; i++)
        {
            int currentElement = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentElement)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
        }
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Sorting.insertionSort(arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }  
}
