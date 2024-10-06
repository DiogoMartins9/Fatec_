#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Definição da estrutura Endereco
typedef struct Endereco {
    char CEP[10];
    char logradouro[100];
    char bairro[50];
    char cidade[50];
    char UF[3];
    struct Endereco* next;  // Ponteiro para o próximo endereço (lista encadeada)
} Endereco;

// Função para criar um novo endereço e retornar o ponteiro para ele
Endereco* criarEndereco(char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]) {
    // Aloca memória para um novo endereço
    Endereco* newEndereco = (Endereco*)malloc(sizeof(Endereco));
    if (newEndereco == NULL) {
        printf("Erro ao alocar memória para o novo endereço\n");
        exit(1);  // Sai do programa em caso de falha na alocação
    }

    // Copia os valores fornecidos para os campos da estrutura
    strcpy(newEndereco->CEP, CEP);
    strcpy(newEndereco->logradouro, logradouro);
    strcpy(newEndereco->bairro, bairro);
    strcpy(newEndereco->cidade, cidade);
    strcpy(newEndereco->UF, UF);

    // Define o ponteiro next como NULL (sem próximo endereço)
    newEndereco->next = NULL;

    return newEndereco;  // Retorna o novo endereço
}

// Função para inserir um novo endereço na lista encadeada
void inserirEndereco(Endereco** head, char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]) {
    Endereco* newEndereco = criarEndereco(CEP, logradouro, bairro, cidade, UF);  // Cria o novo endereço
    newEndereco->next = *head;  // Faz o novo endereço apontar para o atual primeiro da lista
    *head = newEndereco;  // Atualiza o ponteiro de cabeça para o novo endereço
    printf("Endereço adicionado com sucesso!\n");
}

// Função para alterar um endereço existente com base no CEP
void alterarEndereco(Endereco* head, char CEP[], char logradouro[], char bairro[], char cidade[], char UF[]) {
    Endereco* atual = head;  // Começa a busca no primeiro endereço da lista

    // Percorre a lista até encontrar o endereço com o CEP informado
    while (atual != NULL) {
        if (strcmp(atual->CEP, CEP) == 0) {  // Se o CEP bater, altera os valores
            strcpy(atual->logradouro, logradouro);
            strcpy(atual->bairro, bairro);
            strcpy(atual->cidade, cidade);
            strcpy(atual->UF, UF);
            printf("Endereço alterado com sucesso!\n");
            return;  // Sai da função após alterar o endereço
        }
        atual = atual->next;  // Avança para o próximo endereço
    }

    // Caso o CEP não seja encontrado
    printf("Endereço com o CEP %s não foi encontrado.\n", CEP);
}

// Função para remover um endereço da lista com base no CEP
void removerEndereco(Endereco** head, char CEP[]) {
    Endereco* atual = *head;  // Começa a busca no primeiro endereço
    Endereco* anterior = NULL;  // Ponteiro para o endereço anterior

    // Percorre a lista procurando o endereço com o CEP informado
    while (atual != NULL) {
        if (strcmp(atual->CEP, CEP) == 0) {  // Se encontrar o CEP
            if (anterior == NULL) {  // Caso seja o primeiro endereço da lista
                *head = atual->next;  // Atualiza a cabeça da lista
            } else {
                anterior->next = atual->next;  // Liga o anterior ao próximo, pulando o atual
            }
            free(atual);  // Libera a memória do endereço removido
            printf("Endereço removido com sucesso!\n");
            return;  // Sai da função após remover o endereço
        }
        anterior = atual;  // Avança para o próximo endereço
        atual = atual->next;
    }

    // Caso o CEP não seja encontrado
    printf("Endereço com o CEP %s não foi encontrado.\n", CEP);
}

// Função para listar todos os endereços armazenados
void listarEnderecos(Endereco* head) {
    Endereco* atual = head;  // Começa no primeiro endereço

    // Se a lista estiver vazia
    if (atual == NULL) {
        printf("Não há endereços cadastrados.\n");
        return;
    }

    // Percorre a lista e imprime os dados de cada endereço
    while (atual != NULL) {
        printf("CEP: %s\n", atual->CEP);
        printf("Logradouro: %s\n", atual->logradouro);
        printf("Bairro: %s\n", atual->bairro);
        printf("Cidade: %s\n", atual->cidade);
        printf("UF: %s\n", atual->UF);
        atual = atual->next;  // Avança para o próximo endereço
    }
}

int main() {
    Endereco* listaEnderecos = NULL;  // Inicializa a lista de endereços como vazia
    int opcao;
    char CEP[10], logradouro[100], bairro[50], cidade[50], UF[3];

    // Loop principal do menu
    do {
        printf("\nMenu:\n");
        printf("1. Inserir endereço\n");
        printf("2. Alterar endereço\n");
        printf("3. Remover endereço\n");
        printf("4. Listar endereços\n");
        printf("5. Sair\n");
        printf("--------------------------\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);  // Lê a opção escolhida pelo usuário
        getchar();  // Limpa o buffer do teclado

        switch (opcao) {
            case 1:
                // Coleta os dados para inserir um novo endereço
                printf("Digite o CEP: ");
                fgets(CEP, sizeof(CEP), stdin);
                CEP[strcspn(CEP, "\n")] = '\0';  // Remove o '\n' do final da string

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

                inserirEndereco(&listaEnderecos, CEP, logradouro, bairro, cidade, UF);  // Insere o endereço
                break;

            case 2:
                // Coleta os dados para alterar um endereço existente
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

                alterarEndereco(listaEnderecos, CEP, logradouro, bairro, cidade, UF);  // Altera o endereço
                break;

            case 3:
                // Coleta o CEP para remover o endereço correspondente
                printf("Digite o CEP do endereço a ser removido: ");
                fgets(CEP, sizeof(CEP), stdin);
                CEP[strcspn(CEP, "\n")] = '\0';

                removerEndereco(&listaEnderecos, CEP);  // Remove o endereço
                break;

            case 4:
                // Lista todos os endereços
                listarEnderecos(listaEnderecos);
                break;

            case 5:
                printf("Saindo do programa...\n");
                break;

            default:
                printf("Opção inválida. Tente novamente.\n");
        }

    } while (opcao != 5);  // Sai do loop quando a opção for 5

    return 0;
}
