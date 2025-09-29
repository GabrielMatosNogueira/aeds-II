import java.util.Scanner;
public class ParesImpares
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int impares = 0;
        int pares = 0;
        int i = 0;
        int temp = 0;

        n = sc.nextInt();

        int[] ArrayNumeros = new int[n];

        while(i < n)
        {
            ArrayNumeros[i] = sc.nextInt();
            i = i+1;
        }

        while(i < n)
        {
            if(ArrayNumeros[i] % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares++;
            }
        }
        
        int[] ArrayPares = new int[pares];
        int[] ArrayImpares = new int[impares];

        while(i < n)
        {
            if(ArrayNumeros[i] % 2 == 0)
            {
                ArrayPares[i] = ArrayNumeros[i];
            }
            else
            {
                ArrayImpares[i] = ArrayNumeros[i];
            }
            i = i+1;
        }

        while(i < pares)
        {
            while(i < pares - 1)
            {
                if(ArrayPares[i] < ArrayPares[i+1])
                {
                    temp = ArrayPares[i];
                    ArrayPares[i] = ArrayPares[i+1];
                    ArrayPares[i+1] = temp;
                    i=i+1;
                }
            }
        }

        while(i < impares)
        {
            while(i < impares - 1)
            {
                if(ArrayImpares[i] > ArrayImpares[i+1])
                {
                    temp = ArrayImpares[i];
                    ArrayImpares[i] = ArrayImpares[i+1];
                    ArrayImpares[i+1] = temp;
                    i=i+1;
                }
            }
        }

        while(i < pares)
        {
            System.out.println(ArrayPares[i]);
            i=i+1;
        }

        while(i < impares)
        {
            System.out.println(ArrayImpares[i]);
            i=i+1;
        }

        sc.close();
    }
}
