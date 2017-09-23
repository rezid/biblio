/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapKeyColumn;

/**
 *
 * @author UPEC
 */
@Entity
public class CD extends Ouvrage{
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "TITRES")
    @MapKeyColumn(name = "CLE")
    @Column(name = "VALEUR")
	//TODO : BV : Doit être "NON VIDE"
    private Map<String, Long> listeDesTitres;

    public Map<String, Long> getListeDesTitres() {
        return listeDesTitres;
    }

    public void setListeDesTitres(Map<String, Long> listeDesTitres) {
        this.listeDesTitres = listeDesTitres;
    }
    
    
}
