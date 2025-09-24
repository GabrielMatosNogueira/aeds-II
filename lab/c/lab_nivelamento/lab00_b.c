#include <stdio.h>

int main(void)
{
    // Declaracoes de variaveis
    int n=0;
    int numero=0;
    int maior=0;
    int i=0;

    // Leitura de dados e 
    scanf("%d", &n);
    getchar();

    int array[n];

    for(i=0; i<n; i=i+1)
    {
        scanf("%d", &array[i]);
        getchar();
    }

    maior=array[0];

    for(i=1; i<n; i=i+1)
    {
        if(array[i]>maior)
        {
            maior=array[i];
        }
    }

    printf("Maior numero dentro do array: %d\n", maior);
    return 0;
}