/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3.controller;

import exercicio3.model.PassagemModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class PassagemController {
    PassagemModel passagemModel = new PassagemModel();
    
    public Double calculaTotal(){
        return calculoBagagens() + valorPassagens();
    }
    
    public Double calculoBagagens(){
        if(passagemModel.getPesoBagagens() > 5) {
            return (passagemModel.getPesoBagagens() - 5) * 1;
        }
        
        return 0.0;
    }
    
    public Double valorPassagens() {
        return passagemModel.getNumeroPassagens() * passagemModel.getValorPassagem();
    }
    
    public void solicitar(String destino, int numeroPassagens, double pesoBagagens, double valorPassagem){
        try{
            passagemModel.setDestino(destino);
            passagemModel.setNumeroPassagens(numeroPassagens);
            passagemModel.setValorPassagem(valorPassagem);
            passagemModel.setPesoBagagens(pesoBagagens);
            JOptionPane.showMessageDialog(null, "Solicitação enviada aguarde...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao solicitar");
        }
               
    }
    
    
}
