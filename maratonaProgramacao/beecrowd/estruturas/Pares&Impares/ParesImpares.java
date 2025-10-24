import java.lang.reflect.Array;
import java.util.Scanner;

public class ParesImpares
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int [] numeros = new int[quantidade];
        int i = 0;

        numeros = arrayReader(sc, numeros, quantidade);

        // int [] pares = new int[];
    }

    public static int[] arrayReader(Scanner sc, int[] numeros, int quantidade)
    {

        for(int i = 0; i<quantidade; i=i+1)
        {
            numeros[i] = sc.nextInt();
        }

        return numeros;
    }

    public int paresCounter(Array[] numeros)
    {
        int counter = 0;
        int i = 0;

        while(i < numeros.length)
        {
            if(numeros[i] % 2 == 0){counter++;}
            i=i+1;
        }

        return counter;
    }

    public int imparesCounter(Array[] numeros)
    {
        int counter = 0;
        int i = 0;

        while(i < numeros.length)
        {
            if(numeros[i] % 2 != 0){counter++;}
            i=i+1;
        }
        return counter;
    }

}