 

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Para entrada de dados 
    Scanner ler = new Scanner(System.in);
    int numero;
    // Quantidade de numeros definida pelo usuario
    System.out.println("Quantos numeros serão inseridos? \n");
    numero = ler.nextInt();
    // declaração de variaveis 
    int i = numero;
    int vetor[]=  new int [i];
    int menor = 0;
    int maior = 0;
    int j;
    int calculo = 0;
    boolean ordem = true;

    // entrada de dados do vetor pela estrutura de repetição 
    System.out.println ("Insira numeros inteiros:");
    for (j = 0; j < i; j++) {
      System.out.printf("%d° item de %d:", (j+1) , i);
      vetor[j] = ler.nextInt();

      // Inicializando as variveis na primeira posição do vetor
      menor = vetor[0];
      maior = vetor[0];

      // Estrutura condicional para achar maior e menor valor 
     if (vetor[j] < menor ) {
       menor = vetor[j];
     } else if (vetor[j] > maior) {
       maior = vetor[j];
     }

     // Estrutura para verificar se o vetor esta em ordem crescente
     if (vetor.length > vetor[j]) {
       ordem = false;
     } else {
       ordem = true;
     }
    } 
    System.out.println("O menor numero do vetor é: " + menor);
    System.out.println("O maior numero do vetor é: " + maior);
    calculo = maior - menor;
    System.out.println("A maior diferença entre dois numeros distintos do vetor é: " + calculo);
    System.out.println ("Se aparecer 'false' o vetor não está em ordem crescente: \n");
     System.out.println(ordem + "\n");
}
     }


 
    

   
      


