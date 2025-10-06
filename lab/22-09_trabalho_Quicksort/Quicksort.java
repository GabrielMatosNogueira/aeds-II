import java.util.Scanner;
import java.util.Random;
public class Quicksort 
{
    public static void main(String[] args) {
        selectorMenuEntrance();
    }

    public static int[] selectorArrayEntrance(Scanner sc, int[] array,int size)
    {
        Random rand = new Random();
        boolean randArary = false;
        System.out.println("\nPreencher array com numeros aleatorios?\ntrue\nfalse");
        randArary = sc.nextBoolean();

        if(randArary)
        {
            for(int i=0; i < array.length; i = i + 1)
            {
                array[i] = rand.nextInt(101);
            }
        }
        else
        {
            System.out.println("Digite os elementos (Recomenda-se arquivo pub.in):");
            for(int i=0; i < array.length; i = i + 1)
            {
                array[i] = sc.nextInt();
            }
        }
        return array;
    }
    public static void selectorMenuEntrance() {
        Scanner sc = new Scanner(System.in);
        int arraySize = 0;
        int opcaoArray = -1;
        int opcaoPivo = -1;

        System.out.println("MENU DE OPCOES\n");

        do 
        {
            System.out.println("0 - Sair");
            System.out.println("100 - Array de 100");
            System.out.println("1000 - Array de 1.000");
            System.out.println("10000 - Array de 10.000");
            System.out.print("Escolha uma opcao: ");
            opcaoArray = sc.nextInt();
            int[] array = new int[opcaoArray];

            switch (opcaoArray) 
            {
                case 0:
                    System.out.println("Saindo ...");
                    break;

                case 100:
                    array = selectorArrayEntrance(sc, array, arraySize);
                    break;

                case 1000:
                    array = selectorArrayEntrance(sc, array, arraySize);
                    break;

                case 10000:
                    array = selectorArrayEntrance(sc, array, arraySize);
                    break;
            }

            System.out.println("1 - Primeiro elemento");
            System.out.println("2 - Ultimo elemento");
            System.out.println("3 - Pivo aleatorio");
            System.out.println("4 - Mediana de tres elementos (Inicio, mediana e fim)");
            System.out.print("Escolha uma opcao: ");
            opcaoPivo = sc.nextInt();

            switch (opcaoPivo) {
                case 1:
                    quickSortFirstPivot(array, 0, array.length - 1);
                    break;

                case 2:
                    quickSortLastPivot(array, 0, array.length - 1);
                    break;

                case 3:
                    quickSortRandomPivot(array, 0, array.length - 1);
                    break;

                case 4:
                    quickSortMedianOfThree(array, 0, array.length - 1);
                    break;
            }
            
        } while (opcaoArray != 0);

        sc.close();
    }
    
    public static void quickSortFirstPivot(int[] array, int left, int right) {
        if (left < right) {
            int i = left + 1;
            int j = right;
            int pivo = array[left]; // pivô é o primeiro elemento

            while (i <= j) {
                // Avança i até achar elemento maior que o pivô
                while (i <= right && array[i] <= pivo) {
                    i++;
                }
                // Recua j até achar elemento menor que o pivô
                while (j >= left && array[j] > pivo) {
                    j--;
                }
                // Se i ainda não passou de j, troca
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // Coloca o pivô na posição correta
            int temp = array[left];
            array[left] = array[j];
            array[j] = temp;

            // Chama recursivamente para as duas metades
            quickSortFirstPivot(array, left, j - 1);
            quickSortFirstPivot(array, j + 1, right);
        }
    }


    public static void quickSortLastPivot(int[] array, int left, int right) {
        if (left < right) {
            int pivo = array[right]; // pivô é o último elemento
            int i = left - 1;

            // Particiona o vetor
            for (int j = left; j < right; j++) {
                if (array[j] <= pivo) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // Coloca o pivô na posição correta (depois dos menores)
            int temp = array[i + 1];
            array[i + 1] = array[right];
            array[right] = temp;

            int p = i + 1; // índice final do pivô

            // Chama recursivamente para as duas metades
            quickSortLastPivot(array, left, p - 1);
            quickSortLastPivot(array, p + 1, right);
        }
    }


    public static void quickSortRandomPivot(int[] array, int left, int right) {
        if (left < right) {
            // Escolhe um índice aleatório entre left e right
            Random rand = new Random();
            int randomIndex = rand.nextInt(right - left + 1) + left;

            // Troca o pivô aleatório com o último elemento
            int temp = array[randomIndex];
            array[randomIndex] = array[right];
            array[right] = temp;

            // Agora faz a partição normalmente (como no pivô final)
            int pivo = array[right];
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (array[j] <= pivo) {
                    i++;
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }

            // Coloca o pivô na posição correta
            int t = array[i + 1];
            array[i + 1] = array[right];
            array[right] = t;

            int p = i + 1; // posição final do pivô

            // Chama recursivamente para as duas metades
            quickSortRandomPivot(array, left, p - 1);
            quickSortRandomPivot(array, p + 1, right);
        }
    }

    public static void quickSortMedianOfThree(int[] array, int left, int right) {
        if (left < right) {
            // Escolhe o pivô pela mediana de três
            int mid = (left + right) / 2;

            // Ordena os três valores (left, mid, right)
            if (array[left] > array[mid]) swap(array, left, mid);
            if (array[left] > array[right]) swap(array, left, right);
            if (array[mid] > array[right]) swap(array, mid, right);

            // Coloca o pivô (a mediana) no penúltimo lugar
            swap(array, mid, right - 1);
            int pivo = array[right - 1];

            // Particiona o vetor
            int i = left;
            int j = right - 1;
            while (true) {
                while (array[++i] < pivo) {}
                while (array[--j] > pivo) {}
                if (i >= j) break;
                swap(array, i, j);
            }

            // Coloca o pivô na posição correta
            swap(array, i, right - 1);

            // Chamada recursiva para as duas metades
            quickSortMedianOfThree(array, left, i - 1);
            quickSortMedianOfThree(array, i + 1, right);
        }
    }

    // Função auxiliar de troca
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array)
    {
        for(int i=0; i< array.length; i=i+1)
        {
            System.out.print(array[i] + " ");
        }
    }
}