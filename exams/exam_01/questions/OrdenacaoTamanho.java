import java.util.Scanner;

public class OrdenacaoTamanho {

    public static void imprimir(String[] palavras) {
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }
        System.out.println();
    }

    public static void ordenar(String[] palavras) {
        int n = palavras.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (palavras[j].length() < palavras[j + 1].length()) {
                    swap(palavras, j, j + 1);
                }
            }
        }
    }

    public static void swap(String[] palavras, int i, int j) {
        String tmp = palavras[i];
        palavras[i] = palavras[j];
        palavras[j] = tmp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int n = sc.nextInt();
            String[] palavras = new String[n];

            for (int j = 0; j < n; j++) {
                palavras[j] = sc.next();
            }

            ordenar(palavras);
            imprimir(palavras);
        }

        sc.close();
    }
}