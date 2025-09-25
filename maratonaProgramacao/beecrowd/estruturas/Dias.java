import java.util.Scanner;

public class Dias 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int dias = 0;
        int meses = 0;
        int anos = 0;

        dias = sc.nextInt();

        while(sc.hasNextInt())
        {
            if(dias > 30)
            {
                meses = dias / 30;
                dias = dias % 30;
            }
            if(meses > 12)
            {
                anos = meses / 12;
                meses = meses % 12;
            }

            System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)\n");
            dias = sc.nextInt();
        }
        sc.close();
    }    
}
