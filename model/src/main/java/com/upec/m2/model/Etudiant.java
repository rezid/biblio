/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author UPEC
 */
//TODO : JPA : Transformer la classe en entité. 
//TODO : JPA : Valeur de discriminiation "ETU" 
public class Etudiant extends Adherent {
	//TODO : BV : Créer une contrainte "NON NULL"	
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
