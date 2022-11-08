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
    List<FuncionarioModel> funcionarios = new ArrayList<>();
    
    public void novoFuncionario(String nome, String sobrenome, String cpf, String
            rg, String dtNascimento){
       
        try{
            funcionario.setNome(nome);
            funcionario.setSobrenome(sobrenome);
            funcionario.setCpf(cpf);
            funcionario.setDtNascimento(dtNascimento);
            funcionario.setRg(rg);
            funcionarios.add(funcionario);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }
        
    }
    
    
    public FuncionarioModel exibeFuncionario(int index){
        
        if(!funcionarios.isEmpty() || index <= funcionarios.size() - 1){
            FuncionarioModel f = new FuncionarioModel();
            f.setNome(funcionarios.get(index).getNome());
            f.setSobrenome(funcionarios.get(index).getSobrenome());
            f.setCpf(funcionarios.get(index).getCpf());
            f.setRg(funcionarios.get(index).getRg());
            f.setDtNascimento(funcionarios.get(index).getDtNascimento());
            return f;
        }
        
        return null;
    } 
}
