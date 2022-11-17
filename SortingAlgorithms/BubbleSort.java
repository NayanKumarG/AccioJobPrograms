import java.util.Scanner;

class Sorting{
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            boolean flag = false;
            for(int j=0 ; j<n-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Sorting.bubbleSort(arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
