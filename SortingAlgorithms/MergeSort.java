import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int start , int mid , int end , int arr[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=start ; i<=mid ; i++)
        {
            a.add(arr[i]);
        }
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=mid+1 ; i<=end ; i++)
        {
            b.add(arr[i]);
        }
        int i=0;
        int j=0;
        ArrayList<Integer> c = new ArrayList<>();
        while(i<a.size() && j<b.size())
        {
            if(a.get(i)<=b.get(j))
            {
                c.add(a.get(i));
                i++;
            }
            else{
                c.add(b.get(j));
                j++;
            }
        }
        while(i<a.size())
        {
            c.add(a.get(i));
            i++;
        }
        while(j<b.size())
        {
            c.add(b.get(j));
            j++;
        }

        int v=start;
        for(int k=0 ; k<c.size() ; k++)
        {
            arr[v]=c.get(k);
            v++;
        }
    }
    public static void mergeSort(int start , int end , int arr[])
    {
        if(start==end)
        {
            return;
        }
        int mid=(start+end)/2;
        mergeSort(start, mid, arr);
        mergeSort(mid+1 , end, arr);
        merge(start,mid,end,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(0,n-1,arr);
        for(int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
