#include <stdio.h>
int main(void)
{
    float num1,
    num2;
    char open;
    do
    {
        printf("\t\tCalculadora\n\n");
        printf("Operacoes disponiveis\n");
        printf("'+': soma\n");
        printf("'%%': resto da divisao\n");
        printf("\nDigite a expressao na forma: numero1 operador numero2\n");
        scanf("%f", &num1);
        scanf(" %c", &oper);
        scanf("%f", &num2);
        system("cls || clear");
        printf("Calculando: %.2f %c %.2f = ", num1, oper, num2);
        switch ( oper)
        {
            case '+':
            printf("%.2f\n\n", num1 + num2);
            break;
            default:
            if(num1 !=0 && oper != '0' && num2 !=0)
            printf(" operador invalido\n\n");
            else
            printf("fechando calculadora!\n "); 
        }
    }while(num1 != 0 && oper != '0' && num2 !=0);
}