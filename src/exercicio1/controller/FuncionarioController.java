/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1.controller;

import exercicio1.model.FuncionarioModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioController {
    
    FuncionarioModel funcionario = new FuncionarioModel();
    
    public void novoFuncionario(String nome, String sobrenome, String cpf, String
            rg, String dtNascimento){
       
        try{
            funcionario.setNome(nome);
            funcionario.setSobrenome(sobrenome);
            funcionario.setCpf(cpf);
            funcionario.setDtNascimento(dtNascimento);
            funcionario.setRg(rg);;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }
        
    }
    
    
    public FuncionarioModel exibeFuncionario(){
        
        if(funcionario != null){
            return funcionario;
        } 
        return null;
    } 
}
