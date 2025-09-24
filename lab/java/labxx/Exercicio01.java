import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // Criacao da variavel do tipo scanner e demais variaveis
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        int contador = 0;
        int i = 0;

        // Estrutura para leitura de frase, verificacao e acumulador de soma para
        // caracteres MAISCULOS
        while (!(frase.length() == 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M')) 
        {
            contador = 0;
            i = 0;

            while (i < frase.length()) 
            {
                if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') 
                {
                    contador = contador + 1;
                }

                i = i + 1;
            }

            // Exibicao da frase lida e quantidade de caracteres maiúsculos nela
            System.out.println("Quantidade de caracteres MAIÚSCULOS da frase '" + frase + "': " + contador);

            frase = sc.nextLine();
        }
        
        // Fechamento da variavel scanner
        sc.close();
    }
}
