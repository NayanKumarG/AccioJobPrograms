import java.util.*;
public class QuickSort {
    public static int partition(int start,int end,int arr[])
    {
        int pivot=arr[end];
        int i=start;
        for(int j=start ; j<end ;j++)
        {
            if(arr[j]<pivot)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[end];
        arr[end] = tmp;
        return i;
    }
    public static void quickSort(int start , int end , int []arr)
    {
        if(start>end)
        {
            return;
        }
        int indexOfPivot=partition(start,end,arr);
        quickSort(start, indexOfPivot-1, arr);
        quickSort(indexOfPivot+1 , end, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        quickSort(0,n-1,arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
