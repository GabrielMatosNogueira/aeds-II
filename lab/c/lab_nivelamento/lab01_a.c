/**
 * @brief Inclusao de bibliotecas
 */
#include <stdio.h>

/**
 * @brief Question 01
 * @details Crie um metodo iterativo em C que receba como parametro uma string
 *          e retorne o numero de caracteres maisculos.
 * @param  quantidade_Maisculos (poderia ter sido declarado dentro do bloco de contagem_Maisculos)
 * @param  linha                (a funcao frase e todos seus caracteres em cada respectiva funcao)
 * @return quantidade de letras maisculas daquela devida entrada
 */
int contagem_Maisculos(int quantidade_Maisculos, char linha[])
{
    int i=0;
    do
    {
        if(linha[i]>='A' && linha[i]<'Z')
        {
            quantidade_Maisculos=quantidade_Maisculos+1;
        }
        i=i+1;
    } while (linha[i]!='\0');
    return quantidade_Maisculos;
}

/**
 * @brief Main Function
 * @details Funcao principal com a chamada das funcoes contagem_Maisculos e loop iterativo para
 *          leitura de diferentes entradas cuja condicao de parada e' "FIM".
 */
int main(void)
{
    char linha[100]="\0";
    int quantidade_Maisculos=0;
    do
    {
        quantidade_Maisculos=0;
        scanf(" %[^\n]", linha);
        //getchar();
        quantidade_Maisculos=contagem_Maisculos(quantidade_Maisculos, linha);

        printf("%d\n", quantidade_Maisculos);
    } while (linha[0]!='F' && linha[1]!='I' && linha[2]!='M' && linha[3]!='\0');

    return 0;
}