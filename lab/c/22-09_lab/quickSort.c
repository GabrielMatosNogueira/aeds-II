    #include <stdio.h>

    /**
     * @brief Funcao para exibir o conteudo de vetor
     * 
     * @details Realiza a exibicao de forma recursiva passando o indiceo
     *          do vetor, tamanho do array e seu conteudo como paramatro
     */
    void exibirArray(int tamanho, int indice, int* array)
    {
        if(indice!=tamanho)
        {
            printf("%d\n", array[indice]);
            exibirArray(tamanho, indice+1, array);
        }
        else
        {
            return;
        }
    }

    int* preencherArray(int tamanho, int indice, int* array)
    {
        if(indice==tamanho)
        {
            return array;
        }
        else
        {
            array[indice]=indice+1;
            preencherArray(10, indice+1, array);
        }
    }

    int main(void)
    {
        int i=0;
        int j=0;
        int menor=0;
        int array[10];

        preencherArray(10, i, array);
        exibirArray(10, i, array);

        return 0;
    }
