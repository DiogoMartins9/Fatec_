#include <stdio.h>
#include <stdlib.h>

void bubbleSort(int vetor[], int tamanho) {
    int i, j, temp;
    for (i = 0; i < tamanho - 1; i++) {
        for (j = 0; j < tamanho - i - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }
}

int buscaBinaria(int vetor[], int tamanho, int chave) {
    int esquerda = 0, direita = tamanho - 1;
    while (esquerda <= direita) {
        int meio = esquerda + (direita - esquerda) / 2;
        if (vetor[meio] == chave) {
            return meio; // Elemento encontrado
        }
        if (vetor[meio] < chave) {
            esquerda = meio + 1;
        } else {
            direita = meio - 1;
        }
    }
    return -1; // Elemento não encontrado
}

int main(void) {
    int numeros[10];
    int i, elemento, posicao;

    // Entrada dos 10 números
    printf("Digite 10 números:\n");
    for (i = 0; i < 10; i++) {
        printf("Número %d: ", i + 1);
        scanf("%d", &numeros[i]);
    }

    bubbleSort(numeros, 10);

    printf("\nNúmeros em ordem crescente:\n");
    for (i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    printf("Digite o número a ser consultado: ");
    scanf("%d", &elemento);

    posicao = buscaBinaria(numeros, 10, elemento);

    if (posicao != -1) {
        printf("O número %d está na posição %d do vetor.\n", elemento, posicao);
    } else {
        printf("O número %d não está no vetor.\n", elemento);
    }

    return 0;
}
