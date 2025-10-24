import java.util.Scanner;

class No
{
    private int elemento;
    private No noesq;
    private No nodir;

    // Construtores
    public No()
    {
        elemento=0;
        noesq=null;
        nodir=null;
    }

    public No(int elemento, No dir, No esq)
    {
        this.elemento = elemento;
        this.nodir = dir;
        this.noesq = esq;
    }

    public No(int elemento)
    {
        this.elemento = elemento;
    }
}

public class Arvore 
{
    private No Raiz;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Raiz();
        sc.close();
    }

    /**
     * @param ArrayNos
     */
    public void InserirArvore(int[] arrayNos)
    {

    }

    // Metodo recursivo aparentemente é mais fácil
    public void MostrarArvore()
    {
        
    }
    
    public int[] PreencherArray(Scanner sc)
    {
        int [] elemento = new int[10];          // Arvore pré-definida com 10 elementos

        for(int i=0; i<10; i=i+1)
        {
            elemento[i] = sc.nextInt();
        }

        return elemento;
    }
}