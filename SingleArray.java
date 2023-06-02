import java.util.Scanner;
import java.util.Arrays;
interface Array
{
    public void insert();
    public void delete();
    public void sort();
    public void bsearch();
}

class SingleArray implements Array
{
    int[] arr;
    static void print(String s)
    {
        System.out.print(s);
    }
    static void println(String s)
    {
        System.out.println(s);
    }

    SingleArray()
    {
        Scanner scn = new Scanner(System.in);
        print("Enter number of elements: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
    }
    public void insert()
    {
        Scanner scn = new Scanner(System.in);
        println("Enter the data:");
        for (int i = 0 ; i < this.arr.length-1 ; i++)
        {
            arr[i] = scn.nextInt();
        }
        show(arr);
    }
    public void delete()
    {
        Scanner scn = new Scanner(System.in);
        print("Enter an index you want to delete: ");
        int t = scn.nextInt();
        for(int i = t ; i < this.arr.length-1 ; i++)
            arr[i] = arr[i+1];
        int size = arr.length-1;
        print("The array is: ");
        show(arr);
    }
    public void sort()
    {
        Arrays.sort(arr);
        print("The sorted array is: ");
        show(arr);
    }
    public void bsearch()
    {
        Scanner scn = new Scanner(System.in);
        print("Enter a number you want to search: ");
        int key = scn.nextInt();
        println("The value is: " + Arrays.binarySearch(arr,key));
    }
    void show(int[] arr)
    {
//        print("The array is: ");
        for(int i = 0 ; i < arr.length-1 ; i++)
            print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        Array a = new SingleArray();
        a.insert();
        a.delete();
        a.sort();
        a.bsearch();
    }
}