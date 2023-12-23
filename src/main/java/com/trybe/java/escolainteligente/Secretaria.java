package com.trybe.java.escolainteligente;

import java.util.Scanner;

/**
 * Classe Secretaria.
 */
public class Secretaria {

  /**
   * Método calcularMedia.
   */
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    return (nota1 + nota2 + nota3 + nota4) / 4;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner secretariaScanner = new Scanner(System.in);

    System.out.print("Qual o nome da Pessoa Estudante? ");
    String nome = secretariaScanner.next();

    System.out.print("Entre com as notas das provas:");

    System.out.print("Avaliação 1: ");
    double nota1 = secretariaScanner.nextDouble();

    System.out.print("Avaliação 2: ");
    double nota2 = secretariaScanner.nextDouble();

    System.out.print("Avaliação 3: ");
    double nota3 = secretariaScanner.nextDouble();

    System.out.print("Avaliação 4: ");
    double nota4 = secretariaScanner.nextDouble();

    double media = calcularMedia(nota1, nota2, nota3, nota4);

    System.out.println(
        "A média das notas de " + nome + " é " + media
    );

    secretariaScanner.close();
  }
}
