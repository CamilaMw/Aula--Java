/*

QUESTAO 1 

Desenvolva um algoritmo que apresente todos os valores ímpares na faixa de 0 a 100
 */

package com.mycompany.aula3questao1;

/**
 *
 * @author Camila
 */
public class Aula3Questao1 {

    public static void main(String[] args) {
        
        for(int i=0;i<=100;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        } 
    }
}
