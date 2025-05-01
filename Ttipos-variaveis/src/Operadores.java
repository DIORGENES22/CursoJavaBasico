public class Operadores {
    public static void main(String[] args) throws Exception {

          // Operadores Aritméticos
          int a = 10;
          int b = 5;
          int soma = a + b; // Adição
          int subtracao = a - b; // Subtração
          int multiplicacao = a * b; // Multiplicação
          double divisao = (double) a / b; // Divisão
          int restoDivisao = a % b; // Módulo
  
          System.out.println("Soma: " + soma);
          System.out.println("Subtração: " + subtracao);
          System.out.println("Multiplicação: " + multiplicacao);
          System.out.println("Divisão: " + divisao);
          System.out.println("Resto da Divisão: " + restoDivisao);
  
          // Operadores Relacionais
          boolean maiorQue = a > b; // Maior que
          boolean menorQue = a < b; // Menor que
          boolean igual = a == b; // Igual a
          boolean diferente = a != b; // Diferente de
  
          System.out.println("Maior que: " + maiorQue);
          System.out.println("Menor que: " + menorQue);
          System.out.println("Igual: " + igual);
          System.out.println("Diferente: " + diferente);
  
        //operadores Lógicos
       
         boolean variavel = false;

         variavel = !variavel; // Inverte o valor da variável
         System.out.println("Valor da variável: " + variavel); // true

         //exppressão ternária
            int x = 10;
            int y = 20;
            int maior = (x > y) ? x : y; // Se x for maior que y, atribui x a maior, caso contrário, atribui y

          
          //expressaão logica
          boolean expressaoLogica = (x > 5) && (y < 30); // true, pois ambas as condições são verdadeiras
          System.out.println("Expressão lógica: " + expressaoLogica); // true         

    }

    

    
}
