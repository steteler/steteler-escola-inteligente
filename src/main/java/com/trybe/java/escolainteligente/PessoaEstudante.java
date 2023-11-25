package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner pessoaScanner = new Scanner(System.in);

    System.out.print("Qual o nome da Pessoa Estudante? ");
    String nome = pessoaScanner.next();

    System.out.println("Qual a sua idade em anos, meses e dias?");

    System.out.print("anos: ");
    int anos = pessoaScanner.nextInt();

    System.out.print("meses: ");
    int meses = pessoaScanner.nextInt();

    System.out.print("dias: ");
    int dias = pessoaScanner.nextInt();

    pessoaScanner.close();

    System.out.println("A idade de " + nome + " em dias é " + calcularIdadeEmDias(anos, meses, dias) + ".");
  }
}