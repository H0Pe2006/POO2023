import javax.swing.JOptionPane;

public class Atv07 { // Início da classe Atv07

    public static void main(String[] args) {
        Float media = 0f; // variavel para calcular a media
		String input; // variavel auxliar
        int notas[] = new int[5]; // declaração e alocação de um array
        String notasDecres = "";

        // Recebe as notas dos alunos através de showInputDialog
        for (int i = 0; i < notas.length; i++) { // Usa o loop for para repetir 5 vezes a classe JOptionPane, assim pedindo as notas dos alunos
            input= JOptionPane.showInputDialog("Informe a nota do aluno " + (i+1)); // Pede a nota dos alunos através de uma caixa de texto
            notas[i] = Integer.parseInt(input);
            media += notas[i];  // recebe a soma de todas as notas das provas
        }

        // Ordena as notas em ordem decrescente (maior para o menor)
        for (int i = 1; i < notas.length; i++) { 
            for (int j = 0; j < i; j++) {
                if (notas[i] > notas[j]) {
                    int tmp = notas[i];
                    notas[i] = notas[j];
                    notas[j] = tmp;
                }
            }
        }

        for (int num : notas) { 
			notasDecres += num + ", ";  // Adicionando o caracter ";" para separar as notas
        }

        // Calcula a média aritmética das notas
        Float soma = 0f;
        for (float nota : notas) {
            soma += nota;
        }
        media = soma / notas.length;

        // Apresenta as cinco notas em ordem decrescente
        JOptionPane.showMessageDialog(null, "As notas em ordem decrescente são: " + notasDecres); // Exibe as notas em ordem decrescente usando a classe JOptionPane 

        // Apresenta a média aritmética das notas
        JOptionPane.showMessageDialog(null, "A média aritmética é: " + media); // Exibe a média das notas usando a classe JOptionPane 
    }

}
