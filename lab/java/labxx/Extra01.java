import java.util.Scanner;

public class Extra01 
{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o valor que deseja procurar dentro do intervalo de numeros: ");
      int valorProcurado = scanner.nextInt();

      System.out.println("\nAgora escreva quantos numeros deseja armazenar na estrutura para procurar o numero digitado anteriormente: ");
      int quantidade = scanner.nextInt();
      int[] numeros = new int[quantidade];

      for (int i = 0; i < quantidade; i++) 
      {
         System.out.println("Digite um numero para a posicao: " + i);
         numeros[i] = scanner.nextInt();
      }

      System.out.print("\nNumeros armazenados: ");
      for (int num : numeros) 
      {
         System.out.print("[" + num + "] ");
      }
      System.out.println();

      boolean encontrado = false;
      for (int num : numeros) {
         if (num == valorProcurado) {
            encontrado = true;
            break;
         }
      }

      System.out.println();
      if (encontrado) {
         System.out.println("O numero " + valorProcurado + " foi encontrado na estrutura");
      } else {
         System.out.println("O numero " + valorProcurado + " nao foi encontrado na estrutura");
      }

      scanner.close();
   }
}
