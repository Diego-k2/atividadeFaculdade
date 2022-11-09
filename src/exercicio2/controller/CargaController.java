/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2.controller;

import exercicio2.model.CargaModel;
import javax.swing.JOptionPane;

public class CargaController {
    CargaModel cargaModel = new CargaModel();
    
    public Integer prazo() {                
        return (int) Math.round(Math.random() * 10);
    }
    
    public Double frete() {
        return cargaModel.getPeso() * 0.45;
    }

    public void cadastrarCarga(String origem, String destino, String especificacao
                   ,String descricao, double peso){
        try{
            cargaModel.setOrigem(origem);
            cargaModel.setDestino(destino);
            cargaModel.setEspecificacao(especificacao);
            cargaModel.setDescricao(descricao);
            cargaModel.setPeso(peso);
            JOptionPane.showMessageDialog(null, "Finalizamos a cotação");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao solicitar");
        }       
    }
    
    
}
