package quickSort_assignment;
import java.util.Scanner;
import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {
        selectorMenuEntrance();
    }

    public static int[] selectorArrayEntrance(Scanner sc, int[] array, int size) {
        Random rand = new Random();
        boolean randArary = false;
        System.out.println("\nPreencher array com numeros aleatorios?\ntrue\nfalse");
        randArary = sc.nextBoolean();
        System.out.println("");

        if (randArary) {
            for (int i = 0; i < array.length; i = i + 1) {
                array[i] = rand.nextInt(101);
            }
        } else {
            System.out.println("Digite os elementos (Recomenda-se arquivo pub.in):");
            for (int i = 0; i < array.length; i = i + 1) {
                array[i] = sc.nextInt();
            }
        }
        return array;
    }

    public static void selectorMenuEntrance() {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        int arraySize = 0;
        int opcaoArray = -1;
        int opcaoPivo = -1;

        System.out.println("MENU DE OPCOES\n");

        do {
            opcaoArray = 0;
            opcaoPivo = 0;
            System.out.println("100 - Array de 100");
            System.out.println("1000 - Array de 1.000");
            System.out.println("10000 - Array de 10.000");
            System.out.print("Escolha uma opcao: ");
            opcaoArray = sc.nextInt();
            System.out.println("");
            int[] array = new int[opcaoArray];

            switch (opcaoArray) {
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

            System.out.println("Escolha um pivo:");
            System.out.println("1 - Primeiro elemento");
            System.out.println("2 - Ultimo elemento");
            System.out.println("3 - Pivo aleatorio");
            System.out.println("4 - Mediana de tres elementos (Inicio, mediana e fim)");
            System.out.print("Escolha uma opcao: ");
            opcaoPivo = sc.nextInt();

            switch (opcaoPivo) {
                case 1:
                    quickSortFirstPivot(array, 0, array.length - 1);
                    System.out.println("\nArray ordenado (primeiro elemento como pivo):");
                    printArray(array);
                    System.out.println();
                    break;

                case 2:
                    quickSortLastPivot(array, 0, array.length - 1);
                    System.out.println("\nArray ordenado (último elemento como pivo):");
                    printArray(array);
                    System.out.println();
                    break;

                case 3:
                    quickSortRandomPivot(array, 0, array.length - 1);
                    System.out.println("\nArray ordenado (pivo aleatório):");
                    printArray(array);
                    System.out.println();
                    break;

                case 4:
                    quickSortMedianOfThree(array, 0, array.length - 1);
                    System.out.println("\nArray ordenado (mediana de tres):");
                    printArray(array);
                    System.out.println();
                    break;
            }
            System.out.println("Deseja encerrar o programa?");
            System.out.println("true\nfalse");
            stop = sc.nextBoolean();
            
        } while (stop != true);

        sc.close();
    }

    public static void quickSortFirstPivot(int[] array, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int pivo = array[left];

            while (i <= j) {
                // CORREÇÃO: Garante que 'i' não ultrapasse 'right'
                while (i <= right && array[i] < pivo) {
                    i++;
                }
                // CORREÇÃO: Garante que 'j' não ultrapasse 'left'
                while (j >= left && array[j] > pivo) {
                    j--;
                }

                if (i <= j) {
                    // Troca os elementos e avança os ponteiros
                    swap(array, i, j);
                    i++;
                    j--;
                }
            }

            // Chamadas recursivas
            // A verificação 'j > left' evita recursão infinita se a partição for desbalanceada
            if (left < j) {
                quickSortFirstPivot(array, left, j);
            }
            // A verificação 'i < right' evita recursão infinita
            if (i < right) {
                quickSortFirstPivot(array, i, right);
            }
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
        if (left + 1 >= right) {
            if (left < right && array[left] > array[right]) {
                swap(array, left, right);
            }
            return;
        }

        int mid = left + (right - left) / 2;

        if (array[left] > array[mid]) swap(array, left, mid);
        if (array[left] > array[right]) swap(array, left, right);
        if (array[mid] > array[right]) swap(array, mid, right);

        swap(array, mid, right - 1);
        int pivo = array[right - 1];

        int i = left;
        int j = right - 1;

        // ALTERAÇÃO: O laço 'while(true)' com 'break' foi substituído
        // por um laço com a condição de parada explícita (i < j).
        while (i < j) {
            // Avança 'i' enquanto os elementos forem menores que o pivô
            while (i < right && array[++i] < pivo) {}

            // Recua 'j' enquanto os elementos forem maiores que o pivô
            while (j > left && array[--j] > pivo) {}

            // Se os ponteiros não se cruzaram, troca os elementos
            if (i < j) {
                swap(array, i, j);
            }
        }

        // Restaura o pivô para sua posição final correta
        swap(array, i, right - 1);

        // Chamada recursiva para as duas metades
        quickSortMedianOfThree(array, left, i - 1);
        quickSortMedianOfThree(array, i + 1, right);
    }

    // Função auxiliar de troca
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.print("[ " + array[i] + " ]" + " ");
        }
    }
}