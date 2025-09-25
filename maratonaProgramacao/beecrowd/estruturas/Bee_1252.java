import java.util.Scanner;
public class Bee_1252
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int mod=0;
        int temp=0;

        int []array = new int[n];

        do
        {
            n=sc.nextInt();
            mod=sc.nextInt();

            array = new int[n];

            for(int i=0; i<n; i=i+1)
            {
                array[i]=sc.nextInt();
            }

            System.out.println(n + " " + mod);

            for(int i=0; i<n-1; i=i+1)
            {
                for(int j=1; j< n - i - 1; j=j+1)
                {
                    if(array[j] % mod < array[j+1] % mod)
                    {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    
                        if(array[j] % mod == array[j+1] % mod)
                        {
                            if(array[j]%2!=0)
                            {
                                temp=array[j];
                                array[j]=array[j+1];
                                array[j+1]=temp;
                            }
                        }
                    }
                    System.out.println(array[i]);
                }
            }
        } while(n!=0 && mod!=0);
    }
}