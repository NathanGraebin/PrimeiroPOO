/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maissimples;

/**
 *
 * @author aluno
 */
class Pato {
    String nome;
    String cor;
    String comportamento;
    String sexo;
    String classe;
    
    
    
    public void Coar(String sexo){
    if(sexo == "Masculino"){
    System.out.println("Quack sou macho");
        }
    else if (sexo == "Feminino"){
    System.out.println("Qui qui qui, sou Femea");
    }
    else{
    System.out.println("O Pato não existe");
    }
    
    }
}
