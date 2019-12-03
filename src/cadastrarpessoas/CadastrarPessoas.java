/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrarpessoas;

/**
 *
 * @author Flavio
 */
public class CadastrarPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CRIAÇÃO DO OBJETO:*/
        Pessoas objPessoa = new Pessoas("Flavio");
        
        System.out.println("Nome : " + objPessoa.mostrarNome());
        objPessoa.inserirEmail("flaviooo.alves@gmail.com");
        System.out.println("Email: " + objPessoa.mostrarNome());
    }
    
    
    
}
