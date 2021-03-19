package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_TURMAS = 2;
        final int NUMERO_ALUNOS = 2;
        double mediaAluno, mediaTurma, mediaGeral;

        mediaGeral = 0;
    

        for (int turma=1; turma <=NUMERO_TURMAS; turma++){
            System.out.println("\nTurma " + turma);
            mediaTurma = 0;

            for(int aluno=1; aluno <= NUMERO_ALUNOS; aluno++){
                System.out.println("Digite a média do aluno: " + aluno);
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }
            mediaTurma = mediaTurma / NUMERO_ALUNOS;
            System.out.println("Media Turma: " + mediaTurma);
            mediaGeral = mediaGeral + mediaTurma;

        }

        mediaGeral = mediaGeral / NUMERO_TURMAS;
        System.out.println("Média das turmas: " + mediaGeral);
        entrada.close();

    }
    
}
