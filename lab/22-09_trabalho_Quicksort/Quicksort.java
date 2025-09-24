import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Quicksort
{
    public static void main(String[] args)
    {
        int[] array01 = new int[100];
        Random gerador = new Random();

        for(int i=0; i<100; i=i+1)
        {
            array01[i]=gerador.nextInt(101);
        }
        
        for(int i=0; i<100; i=i+1)
        {
            System.out.print(array01[i] + " ");
        }
    }


}