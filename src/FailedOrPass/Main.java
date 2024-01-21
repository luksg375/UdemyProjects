package FailedOrPass;

import FailedOrPass.entities.alunos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Insira as notas de cada periodo: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        alunos alunos = new alunos(name, nota1, nota2, nota3);

        System.out.println(alunos);

        sc.close();
    }
}