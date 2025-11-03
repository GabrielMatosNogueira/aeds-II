import java.util.Scanner;

public class LabArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        // Pesquisa
        arvoreBinaria.pesquisar(10);

        // Insercao
        arvoreBinaria.inserir(50);
        arvoreBinaria.inserir(30);
        arvoreBinaria.inserir(70);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(40);
        arvoreBinaria.inserir(60);
        arvoreBinaria.inserir(80);

        // Pesquisa
        arvoreBinaria.pesquisar(60);
        arvoreBinaria.pesquisar(25);

        // Caminhar Pre
        arvoreBinaria.caminharPre();

        // arvoreBinaria.em();
        arvoreBinaria.caminharPos();
        arvoreBinaria.inserir(25);
        // arvoreBinaria.em();
        arvoreBinaria.pesquisar(25);
    }

    public static void seletorMetodo(String linha) {
        Scanner sc = new Scanner(System.in);
        char tmp = 'z';
        //tmp = sc.next.charAt();

        if (linha.charAt(0) == 'P') {
            //pesquisar();
        }

        if (linha.charAt(0) == 'I') {

        }

        if (linha.equals("PRE")) {

        }

        if (linha.equals("POS")) {

        }

        if (linha.equals("EM")) {

        }
    }
}

class No {
    public int elemento;
    public No esq;
    public No dir;

    public No(int elemento) {
        this(elemento, null, null);
    }

    public No(int elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public boolean pesquisar(int x) {
        return pesquisar(x, raiz);
    }

    public boolean pesquisar(int x, No i) {
        boolean resultado = false;

        if (i != null) {
            if (x > i.elemento) {
                resultado = pesquisar(x, i.dir);
            }

            else if (x < i.elemento) {
                resultado = pesquisar(x, i.esq);
            }

            else {
                resultado = true;
            }
        } else {
            System.out.println("Celula vazia");
        }

        return resultado;
    }

    public void inserir(int x){
        raiz = inserir(x, raiz);
    }

    private No inserir(int x, No i){
        if(i!=null){
            if(x < i.elemento){
                i.esq = inserir(x, i);
            }
            else if(x > i.elemento){
                i.dir = inserir(x, i);
            }

        }else{
            System.out.println("Celula vazia");
        }

        return i;
    }

    public void caminharPre(){
        caminharPre(raiz);
    }

	private void caminharPre(No i){
		if (i != null) {
			System.out.print(i.elemento + " ");
			caminharPre(i.esq);
			caminharPre(i.dir);
		}
	}

    public void caminharPos(){

    }

    public void caminharPos(No i){

    }

    public void caminharEm(ArvoreBinaria arvoreBinaria){
        if(arvoreBinaria.raiz != null){
            
        } else
        {
            System.out.println("V"); // Arvore vazia
        }
    }
}
