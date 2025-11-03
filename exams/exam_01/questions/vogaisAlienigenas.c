/**
Programa fornece uma string e requisita
contabilizar a quantidade de elementos
dessa string estão presentes em outra
string
 */
#include <stdio.h>
#include <stdbool.h>

bool isVogal(char c, char* vogais)
{
    bool resp=false;
    for(int i=0; !resp && vogais[i] != '\0'; i=i+1)
    {
        if(vogais[i] == c)
        {
            resp=true;
        }
    }
    return resp;
}

int contarVogais(char* vogais, char* frase)
{
    int cont=0;
    for(int i=0; frase[i] != '\0'; i=i+1)
    {
        char c=frase[i];
        if(isVogal(c, vogais))
        {
            cont++;
        }
    }
    return cont;
}

int main(void)
{
    int count=0;
    char vogais[10];
    char frase[100];

    while(scanf(" %[^\n]", vogais) != EOF)
    {
        scanf(" %[^\n]", frase);

        //printf("%s\n", vogais);
        //printf("%s\n", frase);

        count=contarVogais(vogais,frase);
        printf("%d\n", count);
    }

    return 0;
}