#include <stdio.h>
#define pi 3.14
int main() {
    float soma,ap1,ap2,as1,as2;
 printf("Digite o valor de ap1;\n");
    scanf("%f%*c",&ap1);
 printf("Digite o valor de ap2;\n");
    scanf("%f%*c",&ap2);
 printf("Digite o valor de AS1;\n");
    scanf("%f%*c",&as1);
 printf("Digite o valor de AS2;\n");
    scanf("%f%*c",&as2);

    soma = ap1+ap2+as1+as2;
    //char nome[40]; String proxima
    printf("Soma = %.1f AP1=%.3f, AP2=%.4f, AS1=%.1f, AS2=%.1f" ,soma,ap1,ap2,as1,as2);
    //calcula a soma da ulbra
    
    return 0;