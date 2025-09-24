/**
 * @brief Recursao da questao lab01_a
 * @details refazer a questao de leitura de string e contagem de caracteres maisculos de maneira recursiva
 */
#include <stdio.h>

/**
 * @brief Caracteres maisculos
 * @details Contagem de caracteres maisculos de maneira recursiva (ler um char por vez)
 */
int contagem_Caracteres_Maisculos(char frase[],int indice)
{
    int contagem=0;
    if(frase!=NULL)
    {
        if(frase[indice]>='A' && frase[frase[indice]<='Z'] && frase[indice]!='\0')
        {
            indice= indice+1;
            contagem=contagem+1;
            contagem_Caracteres_Maisculos(frase, indice);
            
        }
    }
    return contagem;
}
/**
 * @brief Funcao principal
 * @details Funcao a qual chama a funcao contagem de caracteres maisculos ("contagem_Caracteres_Maisculos")
 */
int main(void)
{
    char frase[100]="\0";
    int indice=0;
    int contador=0;
    int i=0;

    do
    {
        printf("\nPor favor, digite uma frase: ");
        scanf(" %[^\n]", frase);

        contador=contagem_Caracteres_Maisculos(frase, indice);
        
        printf("%d", contador);
        i=i+1;
    }while(frase[0]!='F' && frase[1]!= 'I' && frase[2]!= 'M' && frase[3]!='\0');
    
    return 0;
}