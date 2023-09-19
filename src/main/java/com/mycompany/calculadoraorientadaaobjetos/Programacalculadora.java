/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjetos;

import java.util.Scanner;

/**
 *
 * @author tayna.4930
 */
public class Programacalculadora {
    public static void main(String args[]){
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Informe o primeiro valor: ");
//        float num1 = scanner.nextFloat();
//        
//        System.out.println("Informe o segundo valor: ");
//        float num2 = scanner.nextFloat();
//        
//        System.out.println("---------------------RESULTADOS----------------------");
//        System.out.println("Resultado soma: " + calculadora.somar(num1, num2));
//        System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
//        System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
//        System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));

          Scanner scanner = new Scanner(System.in);
          
          int opcao;
          
          float num1 = 0, num2 = 0, resultado = 0;
          
          Boolean continuar = true;
          
          while(continuar){
            System.out.println("----------------------");
            System.out.println("Calculadora Científica"); 
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divísão");
            System.out.println("5 - Raíz Quadrada");
            System.out.println("6 - Potência");
            System.out.println("----------------------");
            opcao = scanner.nextInt();
            
            if(opcao == 1){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("Infome o segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + calculadora.somar(num1, num2));
            }else if(opcao == 2){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("Infome o segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + calculadora.subtrair(num1, num2));
            }else if(opcao == 3){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("Infome o segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + calculadora.multiplicar(num1, num2));
            }else if(opcao == 4){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("Infome o segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + calculadora.dividir(num1, num2));
            }else if(opcao == 5){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + cc.raizQuadrada(num1));
            }else if(opcao == 6){
                System.out.println("Informe o primeiro número: ");
                num1 = scanner.nextInt();
                
                System.out.println("Infome o segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.println("RESULTADO: " + cc.potencia(num1, num2));
            }
        }
    }
}

 
