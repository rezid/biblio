/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author UPEC
 */
@Embeddable
public class Adresse implements Serializable{
    private Integer codePostal;
	//TODO : BV : Doit être "NON NULL"
    private String ville;
    private String nomDeVoie;
    private String numeroDeVoie;

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNomDeVoie() {
        return nomDeVoie;
    }

    public void setNomDeVoie(String nomDeVoie) {
        this.nomDeVoie = nomDeVoie;
    }

    public String getNumeroDeVoie() {
        return numeroDeVoie;
    }

    public void setNumeroDeVoie(String numeroDeVoie) {
        this.numeroDeVoie = numeroDeVoie;
    }
    
    
}
