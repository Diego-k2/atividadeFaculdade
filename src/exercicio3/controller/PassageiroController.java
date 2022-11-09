/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3.controller;

import exercicio2.controller.*;
import exercicio1.model.UsuarioModel;

/**
 *
 * @author Diego
 */
public class PassageiroController {
    UsuarioModel usuario = new UsuarioModel();
    
    public boolean login(String user, String senha) {
        return usuario.isValid(user, senha);
    }
    
}
