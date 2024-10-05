#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Endereco {
char CEP[10];
char logradouro[100];
char bairro[50];
char cidade[50];
char UF[3];
struct Endereco* next;
} Endereco;

Endereco* criarEndereco(char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]) {
  Endereco* newEndereco = (Endereco*)malloc(sizeof(Endereco));
  if (newEndereco == NULL){
    printf("Erro ao alocar memória para o novo endereço\n");
    exit(1);
  }
  
strcpy(newEndereco-> CEP, CEP);
strcpy(newEndereco-> logradouro, logradouro);
strcpy(newEndereco-> bairro, bairro);
strcpy(newEndereco-> cidade, cidade);
strcpy(newEndereco-> UF, UF);
  
newEndereco-> next = NULL;

return newEndereco;
}

void inserirEndereco(Endereco** head, char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]){
  Endereco* newEndereco = criarEndereco(CEP, logradouro, bairro, cidade, UF);
  newEndereco->next = *head;
  *head = newEndereco;
  printf("Endereço adicionado com sucesso!\n");
  
}

void alterarEndereco(Endereco* head, char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]){
  Endereco* atual = head;

  while (atual != NULL) {
    if (strcmp(atual->CEP, CEP) == 0){
      strcpy(atual->logradouro, logradouro);
      strcpy(atual->bairro, bairro);
      strcpy(atual->cidade, cidade);
      strcpy(atual->UF, UF);
      printf("Endereço alterado com sucesso!\n");
      return;
      
    }
    atual = atual->next;
    
  }

  printf("Endereço com o CEP %s não foi encontrado.\n", CEP);
}

void removerEndereco(Endereco** head, char CEP[]) {
  Endereco* atual = *head;
  Endereco* anterior = NULL;

  while (atual != NULL) {
    if (strcmp(atual->CEP, CEP) == 0) {
      
      if (anterior == NULL) {
        *head = atual->next;  
      } else {
       
        anterior->next = atual->next;
      }
      free(atual);  
      printf("Endereço removido com sucesso!\n");
      return;  
    }
    anterior = atual;
    atual = atual->next; 
  }

  printf("Endereço com o CEP %s não foi encontrado.\n", CEP);
}

void listarEnderecos(Endereco* head) {
  Endereco* atual = head;

  if (atual == NULL) {
    printf("Não há endereços cadastrados.\n");
    return;
  }

  while (atual != NULL) {
    printf("CEP: %s\n", atual->CEP);
    printf("Logradouro: %s\n", atual->logradouro);
    printf("Bairro: %s\n", atual->bairro);
    printf("Cidade: %s\n", atual->cidade);
    printf("UF: %s\n", atual->UF);
    atual = atual->next;
    
  }
}

int main() {
  Endereco* listaEnderecos = NULL;
  int opcao;
  char CEP[10], logradouro[100], bairro[50], cidade[50], UF[3];

do {
  printf("\nMenu:\n");
  printf("1. Inserir endereço\n");
  printf("2. Alterar endereço\n");
  printf("3. Remover endereço\n");
  printf("4. Listar endereços\n");
  printf("5. Sair\n");
  printf("--------------------------\n");
  printf("Escolha uma opção: ");
  scanf("%d", &opcao);
  getchar();

  switch (opcao){
    case 1:
      printf("Digite o CEP: ");
      fgets(CEP, sizeof(CEP), stdin);
      CEP[strcspn(CEP, "\n")] = '\0';

      printf("Digite o logradouro: ");
      fgets(logradouro, sizeof(logradouro), stdin);
      logradouro[strcspn(logradouro, "\n")] = '\0';

      printf("Digite o bairro: ");
      fgets(bairro, sizeof(bairro), stdin);
      bairro[strcspn(bairro, "\n")] = '\0';

      printf("Digite a cidade: ");  
      fgets(cidade, sizeof(cidade), stdin);
      cidade[strcspn(cidade, "\n")] = '\0';

     printf("Digite a UF: ");
     fgets(UF, sizeof(UF), stdin);  
     UF[strcspn(UF, "\n")] = '\0';

     inserirEndereco(&listaEnderecos, CEP, logradouro, bairro, cidade, UF);
    break;

  case 2:
    printf("Digite o CEP do endereço a ser alterado: ");
    fgets(CEP, sizeof(CEP), stdin);
    CEP[strcspn(CEP, "\n")] = '\0';

    printf("Digite o novo logradouro: ");
    fgets(logradouro, sizeof(logradouro), stdin);
    logradouro[strcspn(logradouro, "\n")] = '\0';

    printf("Digite o novo bairro: ");
    fgets(bairro, sizeof(bairro), stdin);
    bairro[strcspn(bairro, "\n")] = '\0';
   
    printf("Digite a nova cidade: ");
    fgets(cidade, sizeof(cidade), stdin);  
    cidade[strcspn(cidade, "\n")] = '\0';

    printf("Digite a nova UF: ");  
    fgets(UF, sizeof(UF), stdin);
    UF[strcspn(UF, "\n")] = '\0';

    alterarEndereco(listaEnderecos, CEP, logradouro, bairro, cidade, UF);
    break;

  case 3:
    printf("Digite o CEP do endereço a ser removido: ");
    fgets(CEP, sizeof(CEP), stdin);
    CEP[strcspn(CEP, "\n")] = '\0';

    removerEndereco(&listaEnderecos, CEP);
    break;

  case 4:
    listarEnderecos(listaEnderecos);
    break;

  case 5:
    printf("Saindo do programa...\n");
    break;

  default:
    printf("Opção inválida. Tente novamente.\n");
  }
  
} while (opcao != 5);

return 0;
}


