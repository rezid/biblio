/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author UPEC
 */
//TODO : JPA : Transformer la classe en entité. 
//TODO : JPA : Valeur de discriminiation "ENS"
public class Enseignant extends Adherent {
    //TODO : JPA : Nom de la colonne "ENS_SEC"
	//TODO : BV : Doit être "UN NOMBRE POSITIF"
    private int section;

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
    
    
}
