import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine() == true)
        {
            String input01 = sc.nextLine();
            int[] pilha = new int[input01.length()];
            boolean verify = true;
            int size = 0;
            int i = 0;
            int j = 0;

            for (i = 0; i < input01.length(); i++) 
            {
                if(input01.charAt(i) == '('){pilha[j] = input01.charAt(i);j++;}
                if(input01.charAt(i) == ')'){pilha[j] = input01.charAt(i); j++;}
            }

            size = j - 1;

            while(verify && size > 0)
            {
                if(!(pilha[size] == ')' && pilha[size-1] == '('))
                {
                    verify = false;
                }
                size = size - 2;
                System.out.println((char)pilha[size]);
                size=size-1;
            }


            if(verify){System.out.println("correct");}
            else{System.out.println("incorrect");}
        }
        sc.close();
    }
}
// )3+b*(2-c)( 
// O parenteses deve abrir antes de fechar
// Solucao: construir uma pilha e desempilhar comparando se possuem a mesma quantidade e estão abertos e fechados