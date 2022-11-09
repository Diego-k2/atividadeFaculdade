/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3.model;

public class PassagemModel {

    private String destino;
    
    private int numeroPassagens;
    
    private double valorPassagem;
    
    private double pesoBagagens;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroPassagens() {
        return numeroPassagens;
    }

    public void setNumeroPassagens(int numeroPassagens) {
        this.numeroPassagens = numeroPassagens;
    }

    public double getPesoBagagens() {
        return pesoBagagens;
    }

    public void setPesoBagagens(double pesoBagagens) {
        this.pesoBagagens = pesoBagagens;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    
}
