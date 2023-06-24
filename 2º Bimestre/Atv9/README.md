# Atv09

# IFPR - Campus Cascavel

# Aluno: Luiz Felipe Salbego Esperança

# Turma: 3° INF 2023

Você foi contratado para desenvolver um programa em Java que realiza operações com números inteiros. Para isso, você precisa implementar métodos sem retorno que executam tarefas específicas. 


- Implemente o método imprimirNumeros, que recebe um array com 10 inteiros como parâmetro e exibe os números na tela, separados por um espaço. O método não deve retornar nenhum valor.


- Implemente o método somaNumeros, que recebe um array com 10 inteiros como parâmetro, calcula a soma de todos os números do array e exibe o resultado na tela. O método não deve retornar nenhum valor 


- No método main, um array de números inteiros é criado e inicializado. Você deve chamar o método imprimirNumeros passando o array como argumento. Em seguida, chame o método somaNumeros para calcular a soma dos números e exibir o resultado. Por fim, chame novamente o método imprimirNumeros para exibir o array atualizado após a soma.

Observações:
Os métodos imprimirNumeros e somaNumeros devem ser implementados dentro da classe ExercicioSemRetorno.
Utilize estruturas de repetição e operações matemáticas para calcular a soma dos números.


```

public class ExercicioSemRetorno{ // Declara a classe "ExercicioSemRetorno"
   
   // Inicialização da classe Main 
   public static void main(String[] args) { // Declara o método main que inicia o programa 
  
       int[] v1 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50}; //declara, aloca e inicializa o array "v1" 

       imprimirN(v1); //chama o metodo imprimirN para printar o array "v1" 

       int[] v2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; //declara, aloca e inicializa o array "v2" 

      
       somaN(v1, v2); //chama o metodo somaN para executar a soma dos dois arrays 
       
   } // fim do método main
   
   public static void imprimirN(int[] a1) { // Declara o método imprimirN que recebe um array de inteiros e imprime os números
       System.out.println("Saida do Vetor: ");
       for (int i = 0; i < a1.length; i++) { //Executa um 'for' que percorre o array "a1" e faz um print de cada posição
           System.out.print(a1[i] + "\t");
       }
       //print para a quebra de linha
       System.out.println();
   } // fim do método imprimirN

   public static void somaN(int[] a1, int[] a2) { //declara o método imprimirN que faz a soma dos arrays "a1" e "a2"

       int[] Soma = new int[a1.length]; //declara e aloca o vetor "Soma" com o tamanho do array "a1"

 
       for (int i = 0; i < a1.length; i++) {//Executa um 'For' que realiza a soma dos arrays "a1" e "a2" e atribui o valor para o array "Soma"
           Soma[i] = a1[i] + a2[i];
       }

       //prints para a orientação
       System.out.println("\n");
       System.out.println("Executando a soma...");
       System.out.println("\n");

       imprimirN(Soma); //chama o metodo imprimirN para mostrar a soma dos arrays
   } // fim do método somaN

}// fim da classe ExercicioSemRetorno

```

