#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

void main(void) {
  int codigo, tipoSalario, numeroFilhos;
  double salarioBase;

  printf("Digite o codigo do funcionario: ");
  scanf("%d", &codigo);
  printf("\n");
  
  printf("-----------------------------------------\n");
  printf("[1] horista \n[2] diarista \n[3] mensalista");
  printf("\n");
  printf("Digite o tipo de salario: ");
  scanf("%d", &tipoSalario);
  
  printf("\n-----------------------------------------\n");
  printf("Digite o numero de filhos: ");
  scanf("%d", &numeroFilhos);
  
  printf("\n-----------------------------------------\n");
  printf("Digite o salario base: ");
  scanf("%lf", &salarioBase);

  printf("\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#\n \n \n");

  double salarioBruto;
  int horista = 220;
  int diarista = 30;
  int mensalista = 1;
  

  if (tipoSalario == 1) {
    salarioBruto = salarioBase * horista;
  } else if (tipoSalario == 2) {
    salarioBruto = salarioBase * diarista;
  } else if (tipoSalario == 3) {
    salarioBruto = salarioBase * mensalista;
  } else {
    printf("Tipo de salário inválido\n");
  }

  double taxaInss;
  
  if (salarioBruto <= 3500) {
    taxaInss = salarioBruto * 0.08;    
  } else if (salarioBruto > 3500 && salarioBruto < 5800) {
    taxaInss = salarioBruto * 0.09;    
  } else if (salarioBruto > 5800) {
    taxaInss = salarioBruto * 0.1;    
  } else {
    printf("Erro\n");
  }

  double impostoRenda;
  double salarioDescontadoInss = salarioBruto - taxaInss;
  
  if (salarioDescontadoInss <= 6200) {
    printf("Escapo do leão\n");
    
  } else if (salarioDescontadoInss > 6200 && salarioDescontadoInss < 9400) {
    impostoRenda = salarioDescontadoInss * 0.05;    
    
  } else if (salarioDescontadoInss > 9400) {
    impostoRenda = salarioDescontadoInss * 0.1;    
  } else {
    printf("Erro\n");
  }

  double salarioFamilia = numeroFilhos * 20;

  double salarioLiquido = salarioBruto - taxaInss - impostoRenda + salarioFamilia;


  printf("O salario bruto: %.2lf\n", salarioBruto);
  printf("O desconto do inss: %.2lf\n", taxaInss);
  printf("O imposto de renda: %.2lf\n", impostoRenda);
  printf("O salario familia: %.2lf\n", salarioFamilia);
  printf("O salario liquido: %.2lf\n", salarioLiquido);
  
}