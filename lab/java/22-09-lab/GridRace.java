import java.util.Scanner;

public class GridRace
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] ordemSaida;
        int [] ordemChegada;
        boolean condicaoExistencia=false;
        int quantidadeCompetidores=0;
        int i=0;
        int j=0;

        // Leitura de quantidade de competidores
        quantidadeCompetidores =  sc.nextInt();

        while(condicaoExistencia== sc.hasNext())
        {
            ordemSaida = new int[quantidadeCompetidores];

            for(i=0; i<quantidadeCompetidores; i=i+1)
            {
                ordemSaida[i]=sc.nextInt();
            }
    
    
            ordemChegada = new int[quantidadeCompetidores];
    
            for(i=0; i<quantidadeCompetidores; i=i+1)
            {
                ordemChegada[i]=sc.nextInt();
            }
    
            sortCount(ordemSaida, ordemChegada);
            quantidadeCompetidores =  sc.nextInt();
            j=j+1;
        }

        sc.close();
    }

    public static void sortCount (int []ordemSaida, int []ordemChegada)
    {
        int quantidadeMovimentacoes=0;
        int temp=0;

        for(int i=0; i<ordemChegada.length; i=i+1)
        {
            if(ordemChegada[i]!=ordemSaida[i])
            {
                temp=ordemChegada[i];
                ordemChegada[i]=ordemChegada[i+1];
                ordemChegada[i+1]=temp;

                quantidadeMovimentacoes++;
            }
        }
        System.out.println(quantidadeMovimentacoes);
    }
}
