import java.util.Scanner;

public class Diamantes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int quantidadeTestes = 0;
        char peneira = '\0';
        String linha = "";

        quantidadeTestes = sc.nextInt();
        Pilha pilha = new Pilha();
        sc.nextLine();

        for (int i = 0; i < quantidadeTestes; i++)
        {
            linha = sc.nextLine();
            for (int j = 0; j < linha.length(); j++)
            {
                peneira = linha.charAt(j);
                pilha.inserir(peneira);
            }
        }

        pilha.mostrarPilha();

        sc.close();
    }
}

class Celula
{
    public char caractere;
    public Celula next;

    Celula(char c)
    {
        this.caractere = c;
    }
}

class Pilha
{
    public Celula topo;

    Pilha()
    {
        this.topo = null;
    }

    /*
    public void inserir()
    {
        this(0);
    }
    */

    public void inserir(char c)
    {
        Celula tmp = new Celula(c);
        tmp.next = topo;;
        topo = tmp;
    }

    public void mostrarPilha()
    {
        for(Celula i = topo.next; i!=null; i = topo.next)
        {
            System.out.print(" " + i.caractere);
        }
    }


}
