/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.util.Arrays;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

/**
 *
 * @author UPEC
 */
// @Entity
public class DVD extends Ouvrage {
    private String sousTitres;
    @Transient
    private transient List<String> soustritresList;
	//TODO : BV : Doit être "SUPERIEUR A 5"
    private int duree; 
    public String getSousTitres() {
        return sousTitres;
    }

    public void setSousTitres(String sousTitres) {
        this.sousTitres = sousTitres;
    }

    public List<String> getSoustritresList() {
        return soustritresList;
    }

    public void setSoustritresList(List<String> soustritresList) {
        this.soustritresList = soustritresList;
    }
    @PrePersist
    @PreUpdate
	//TODO : JPA : Annoter la méthode pourqu'elle soit rattachée aux événements 
				 //PrePersist et PreUpdate du cycle de vie de l'entité 
    public void prePersist(){
        if(soustritresList!=null){
            sousTitres = String.join(":|:", soustritresList);
        }
    }
    @PostLoad
	//TODO : JPA : Annoter la méthode pourqu'elle soit rattachée à l'événement 
				 //PostLoad  du cycle de vie de l'entité	
    public void postLoad(){
        if(sousTitres!=null){
            
            soustritresList = Arrays.asList(sousTitres.split(":|:"));
        }
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
 
    
}
