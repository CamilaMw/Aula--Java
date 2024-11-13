/*

QUESTAO 14

Certa prefeitura fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e 
número de filhos. A prefeitura deseja saber:
a. A média do salário da população;
b. A média do número de filhos;
c. O maior salário;
d. O percentual de pessoas com salário até R$100,00;
O final da leitura de dados se dará com a entrada de um salário negativo. Desenvolva este 
programa.

 */

package com.mycompany.aula3questao14;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Aula3Questao14 {

    public static void main(String[] args) {
        double salario, somaSalario = 0, maiorSalario = 0, totalSalarioMenor100 = 0;
        int numFilhos, somaDosFilhos = 0, totalEntrevistados = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Informe seu salário (digite um valor negativo para terminar):");
            salario = sc.nextDouble();

            if (salario <= 0) {
                break;
            }

            System.out.println("Informe o número de filhos:");
            numFilhos = sc.nextInt();

            somaSalario += salario;
            somaDosFilhos += numFilhos;
            totalEntrevistados++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 100) {
                totalSalarioMenor100++;
            }
        }

        double mediaSalario = somaSalario / totalEntrevistados;
        double mediaNumFilhos = (double) somaDosFilhos / totalEntrevistados;

        System.out.println("a. Média do salário da população: " + mediaSalario);
        System.out.println("b. Média do número de filhos: " + mediaNumFilhos);
        System.out.println("c. Maior salário: " + maiorSalario);
        System.out.println("d. Percentual de pessoas com salário até R$100,00: " + (totalSalarioMenor100 * 100.0 / totalEntrevistados) + "%");

        sc.close();
    }
}
