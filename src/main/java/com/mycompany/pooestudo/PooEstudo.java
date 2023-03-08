/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pooestudo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PooEstudo {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        
        
        
        Carro[] umCarro = new Carro[5];
        
        for (int i = 0; i < umCarro.length; i++) {
          umCarro[i] = new Carro("","","",0,0,0);
        }
        
                 
                
        
        int op = -1;
        while(op != 0){
        
        System.out.println("[1] - Receber informações dos carros");
        System.out.println("[2] - Acelerar");
        op = Ler.nextInt();
        
        switch(op){
        
            case 1:
                
                for (int i = 0; i < umCarro.length; i++) {
                System.out.println("-------------------");
                System.out.println(umCarro[i].getName());
                System.out.println(umCarro[i].getCor());
                System.out.println(umCarro[i].getPlaca());
                System.out.println(umCarro[i].getQuantidadePortas());
                System.out.println(umCarro[i].getQuantidadePneus());
                
                }
                
                
                break;
                
            case 2:
                
                
                int velocidade;
                
                
                System.out.println("Quantos KM tu quer ir ?");
                velocidade = Ler.nextInt();
                
                umCarro[0].acelerar(velocidade);
                 
                
                
                
                break;
                
                
        }
        }
        
        
        
    }
}


