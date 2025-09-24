#include <stdio.h>

int *fill_Array(int *array, int n)
{
    int i = 0;
    for (i = 0; i < n; i = i + 1)
    {
        scanf("%d", &array[i]);
    }
    return array;
}

int highest_Value(int *array, int n)
{
    int i = 0;
    int auxiliar_Variable = array[0];
    for (i = 1; i < n; i = i + 1)
    {
        if (array[i] > auxiliar_Variable)
        {
            auxiliar_Variable = array[i];
        }
    }
    return auxiliar_Variable;
}

int main(void)
{
    int n = 0;
    int result = 0;

    scanf("%d", &n);
    getchar();

    while (n != 0)
    {
        int array[n];
        fill_Array(array, n);

        result = highest_Value(array, n);
        printf("\nMaior valor do conjunto: %d\n", result);
    
        scanf("%d", &n);
        getchar();
    }

    return 0;
}
