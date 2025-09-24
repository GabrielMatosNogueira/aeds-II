#include <stdio.h>
int main(void)
{
    int n=0;
    int auxiliar=0;
    int maior_Valor=0;
    int i=0;

    scanf("%d", &n);
    getchar();
    scanf("%d", &auxiliar);
    getchar();

    for(i=0; i<n-1; i=i+1)
    {
        scanf("%d", &maior_Valor);
        getchar();
        if(maior_Valor>auxiliar)
        {
            auxiliar=maior_Valor;
        }
    }
    
    printf("Maior valor dentro dos numeros lidos e': %d\n", maior_Valor);
    return 0;
}