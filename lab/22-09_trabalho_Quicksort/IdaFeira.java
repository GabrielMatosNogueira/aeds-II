import java.util.Scanner;
public class IdaFeira 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        int quantidadeProdutos = 0;
        int quantidadeIdasCompra = 0;
        int i = 0;
        int j = 0;

        n = sc.nextInt();
        quantidadeProdutos = sc.nextInt();

        String[] input01 = new String[quantidadeProdutos];
        String[] aux02   = new String[quantidadeIdasCompra]
        double[] arrayPrecos = new double[quantidadeProdutos];

        for(i=0; i<quantidadeProdutos; i=i+1)
        {
            input01[i] = sc.nextLine();
        }
        
        for(i = 0; i < quantidadeProdutos; i = i + 1)
        {
            String produto = input01[i];
            if (produto.length() >= 3) 
            {
                String ultimasTres = produto.substring(produto.length() - 3);
                arrayPrecos[i] = Double.parseDouble(ultimasTres);
            } 
            else 
            {
                arrayPrecos[i] = Double.parseDouble(produto);
            }
        }

        quantidadeIdasCompra = sc.nextInt();

        for(i = 0; i<quantidadeIdasCompra; i++)
        {

        }

        int[] array01 = new int[n];
    
        for(i=0; i<10; i++)
        {
            array01[i] = 0;
        }  

        sc.close();
    }
}
