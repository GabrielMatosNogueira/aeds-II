import java.util.*;

public class ViagemCalculoLitros 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double litrosGasolina = (velocidadeMedia * time) / 12.0; // 12: Autonomia do carro 

        System.out.printf("%.3f\n", litrosGasolina);
    }
}
