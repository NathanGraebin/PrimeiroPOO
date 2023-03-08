/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooestudo;

/**
 *
 * @author aluno
 */
public class Carro {
    String name;
    String cor;
    String placa;
    int quantidadePortas;
    int quantidadePneus;
    int velocidadeAtual;
    
    public Carro(String name, String cor, String placa, int quantidadePortas, int quantidadePneus,int velocidadeAtual) {
        this.name = name;
        this.cor = cor;
        this.placa = placa;
        this.quantidadePortas = quantidadePortas;
        this.quantidadePneus = quantidadePneus;
        this.velocidadeAtual = velocidadeAtual;
        
    }
    
    

    

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadePneus(int quantidadePneus) {
        this.quantidadePneus = quantidadePneus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    void acelerar(int velocidade){
        
        
        velocidadeAtual = velocidadeAtual + velocidade;
        
        
        System.out.println("Acelerando a "+ velocidadeAtual + "km/h");
    }
    
    
    
           
    
    
    
}
