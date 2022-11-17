import java.util.Scanner;
class Sorting{
    public static void selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            int minimumElement = arr[i];
            int indexOfMinimumElement = i;
            for(int j=i+1 ; j<n ; j++)
            {
                if(arr[j]<minimumElement)
                {
                    minimumElement = arr[j];
                    indexOfMinimumElement = j;
                }
            }
            if(i!=indexOfMinimumElement)
            {
                int tmp=arr[i];
                arr[i] = arr[indexOfMinimumElement];
                arr[indexOfMinimumElement] = tmp;
            }
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Sorting.selectionSort(arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }  
}
