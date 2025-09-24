/**
 * @brief  Algoritmo de ordenação binária (Bubble Sort)
 * @author @GabrielMatosNogueira
 * @version v0.0.2
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * @brief Leitura e preenchimento de Arranjo
 * 
 * @details A função realiza a leitura de um arquivo chamado "pub.in" e preenche
 *          um array de inteiros com até 10 valores lidos do arquivo. Caso o arquivo
 *          não possa ser aberto, a função retorna NULL.
 * 
 * @return Ponteiro para o array preenchido com os valores lidos ou NULL em caso de erro.
 */
int* preenchimento_Array(void)
{
    // Declaração de variáveis
    int i = 0;
    int* array = (int*)malloc(10 * sizeof(int));
    FILE* arquivo_Entrada = fopen("pub.in", "r");

    // Inicialização dos elementos do array com zero
    for(i = 0; i < 10; i = i + 1)
    {
        array[i] = 0;
    }

    // Verifica se o arquivo foi aberto corretamente
    if(arquivo_Entrada != NULL)
    {
        // Leitura dos valores do arquivo e preenchimento do array
        for(i = 0; i < 10; i = i + 1)
        {
            if(fscanf(arquivo_Entrada, "%d", &array[i]) != 1)
            {
                // Se não conseguir ler, preenche com zero
                array[i] = 0;
            }
        }
        fclose(arquivo_Entrada);
    }
    else
    {
        printf("Erro ao abrir o arquivo de entrada.\n");
        free(array);
        return NULL;
    }

    return array;
}

/**
 * @brief Ordenação do array em ordem crescente utilizando Bubble Sort
 * 
 * @details A função recebe um ponteiro para um array de inteiros e ordena seus
 *          elementos em ordem crescente utilizando o algoritmo Bubble Sort.
 * 
 * @param array Ponteiro para o array de inteiros a ser ordenado.
 * @return Ponteiro para o array ordenado.
 */
int* ordenacao_Array(int* array)
{
    int i = 0;
    int j = 0;
    int temp = 0;

    // Algoritmo Bubble Sort para ordenação crescente
    for(i = 0; i < 9; i = i + 1)
    {
        for(j = 0; j < 9 - i; j = j + 1)
        {
            if(array[j] > array[j + 1])
            {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }

    return array;
}

/**
 * @brief Função principal do programa
 * 
 * @details Realiza a leitura dos dados do arquivo de entrada, ordena os valores
 *          e grava o resultado ordenado em um arquivo de saída chamado "pub.out".
 * 
 * @return 0 em caso de sucesso, 1 em caso de erro.
 */
int main(void)
{
    // Declaração de variáveis
    int* array = preenchimento_Array();
    if(array == NULL)
        return 1;

    // Ordenação do array
    array = ordenacao_Array(array);

    // Escrita dos valores ordenados no arquivo de saída
    FILE* arquivo_Saida = fopen("pub.out", "w");
    for(int i=0; i<10; i=i+1)
    {
        if(arquivo_Saida != NULL)
        {
            for(int i = 0; i < 10; i++)
            {
                fprintf(arquivo_Saida, "%d", array[i]);
                if ((i + 1) % 10 == 0)
                    fprintf(arquivo_Saida, "\n");
                else
                    fprintf(arquivo_Saida, " ");
            }
            fclose(arquivo_Saida);
        }
        else
        {
            printf("Erro ao abrir o arquivo de saída.\n");
        }
    }

    // Liberação da memória alocada
    free(array);
    return 0;
}
