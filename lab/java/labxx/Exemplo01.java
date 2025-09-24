import java.util.Scanner;

class Exemplo01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;

        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}