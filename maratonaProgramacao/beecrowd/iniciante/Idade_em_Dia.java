import java.util.Scanner;

public class Idade_em_Dia
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int dias = 0;
        dias = lerIdadeEmDias(sc, dias);

        conversao(dias);
    }

    public static int lerIdadeEmDias(Scanner sc, int dias)
    {
        dias = sc.nextInt();
        return dias;
    }

    public static void conversao(int a)
    {
        int anos = 0;
        int meses= 0;
        int dias = 0;
        int rest = 0;

        anos = a/365;
        rest = a%365;

        meses = rest/30;
        rest = meses%30;

        dias = rest;

        mostrarConversao(anos, meses, dias);
    }

    public static void mostrarConversao(int anos, int meses, int dias)
    {
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}