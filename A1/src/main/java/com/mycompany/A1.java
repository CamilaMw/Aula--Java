/*

QUESTAO 23

Faça um programa que receba o salário de um funcionário, calcule e imprima o valor do 
imposto de renda a ser pago, sabendo que o imposto equivale a 27% do salário.

27/100=0.27
 */

package com.mycompany;

/**
 *
 * @author Camila
 */

import java.util.Scanner;
public class A1 {

    public static void main(String[] args) {
        double salario,imposto=0.27, liquido, total;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário");
        salario=sc.nextDouble();
        
        
        liquido=salario*imposto;
        
        System.out.println("O imposto a ser pago:\n->"+liquido);
        
        
        total=salario-liquido;
        System.out.println("O imposto descontado do salário:\n->"+total);
        
    }
}
