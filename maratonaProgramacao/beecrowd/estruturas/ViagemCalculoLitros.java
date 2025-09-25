import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) 
        {
            int time = sc.nextInt();
            int velocidadeMedia = sc.nextInt();

            double litrosGasolina = (velocidadeMedia * time) / 12.0; // 12: Autonomia do carro

            System.out.printf("%.3f\n", litrosGasolina);
        }

        sc.close();
    }
}
