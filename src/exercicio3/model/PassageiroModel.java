/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3.model;

import exercicio2.model.*;
import exercicio1.model.*;

public class PassageiroModel {
    
    private String usuario = "admin";
    private String senha = "123";
    
    public boolean isValid(String usuario, String senha){
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
}
