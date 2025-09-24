import java.util.Scanner;
import java.util.Random;

public class QuickSort 
{
    //public static void 

    public static void swap(int[] array, int i, int j)
    {
        int temp=0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void quickSortFirstPivot(int[] array, int left, int right) 
    {
        int piv01 = array[left];
        int i=left;
        int j=right;

        while(i<=j)
        {
            while(array[i] < piv01)
            {
                i++;
            }
            while(array[j] > piv01)
            {
                j--;
            }
            if (i <= j)
            {
                swap(array, i, j);
                i=i+1;
                j=j-1;
            }
        }
        if(left<j)
        {
            quickSortFirstPivot(array, left, j);
        }
        if(i < right)
        {
            quickSortFirstPivot(array, i, right);
        }
    }

    /**public static void quickSortLastPivot(int[] array, int left, int right) 
    {
        int piv02 = 0;
    }

    public static void quickSortRandomPivot(int[] array, int left, int right) 
    {

    }

    public static void quickSortMedianOfThree(int[] array, int left, int right) 
    {

    }*/

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] array01 = new int[10];
        //int[] array02 = new int[100];
        //int[] array03 = new int[1000];
        //int[] array04 = new int[10000];

        for(int i=0; i<array01.length; i=i+1)
        {
            array01[i] = aleatorio.nextInt(10);
        }
        for(int i=0; i<array01.length; i=i+1)
        {
            System.out.println(array01[i]);
        }

        System.out.println(" ");
        System.out.println("---------------------------------------");

        quickSortFirstPivot(array01, 0, array01.length-1);
        System.out.println(" ");
        
        for(int i=0; i<10; i=i+1)
        {
            System.out.print(array01[i] + " ");
        }

        sc.close();
    }
}