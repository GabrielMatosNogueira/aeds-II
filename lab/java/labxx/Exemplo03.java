import java.util.Scanner;

public class Exemplo03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] array=new int[5];

        for(int i=0; i<array.length; i=i+1)
        {
            array[i]= sc.nextInt();
        }

        for(int i=0; i<array.length; i=i+1)
        {
            System.out.print("" + array[i]);
        }
        sc.close();
    }
}
