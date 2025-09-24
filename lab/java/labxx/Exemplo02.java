import java.util.Scanner;

public class Exemplo02 
{
    public static void main(String arcs[])
    {
        Scanner sc= new Scanner(System.in);
        String s1 = "Ola alunos de AEDS 2!";
        
        System.out.println(s1);
        System.out.print("Digite seu nome: ");
        String nomeAluno= sc.nextLine();
        System.out.println("O nome do aluno e' " + nomeAluno);

        // ERRADO: Comparacao de endereco de ponteiros
        System.out.println("O nome do aluno foi 'Gabriel Matos Nogueira'? " + (nomeAluno=="Gabriel Matos Nogueira"));

        // CORRETO: Como funcoes com nomes maisculos sao ponteiros pertencentes a uma classe, devemos chamar as funcoes dessas classes
        // Exemplo das esturutras: String, array, poteiro
        System.out.println("O nome do aluno foi 'Gabriel Matos Nogueira'? " + (nomeAluno.equals("Gabriel Matos Nogueira")));

        sc.close();
    }
}
