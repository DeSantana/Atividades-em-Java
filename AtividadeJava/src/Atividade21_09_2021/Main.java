package Atividade21_09_2021;

import java.util.Scanner;

public class Main {

public static void main(String[] args){

       Scanner leia = new Scanner(System.in);

       

       System.out.print("Digite a velocidade do carro: ");

       float velCarro = leia.nextFloat();  //l� a velocidade do carro

       System.out.print("Digite a velocidade m�xima da rua: ");

       float velMax = leia.nextFloat();  //l� a velociadade m�xima da rua

       

       float kmAcima = velCarro - velMax;

       System.out.print("A multa � de: ");

       if(kmAcima <= 10 && kmAcima > 0){

           System.out.println("R$50");

       }else if(kmAcima > 10 && kmAcima <= 30){

           System.out.println("R$100");

       }else if(kmAcima > 30){

           System.out.println("R$300");

       }else{

           System.out.println("R$0");

       }

}

}