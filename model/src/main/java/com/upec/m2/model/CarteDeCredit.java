/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;


import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Salifou BERTHE
 */
//TODO : JPA : Transformer la classe en entité. Stratégie de génération de la clé primaire "IDENTITY"
//TODO : JPA : Le nom de la table doit être "CREDIT_CARD"
//TODO : JPA : Mettre les requêtes nommées suivantes (findAllCartesDeCredit, findCartesDeCreditByNumero et findExpiredCards)
public class CarteDeCredit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    //TODO : JPA : Nom de la colonne est "NUMBER", champ obligatoire et taille max 25 caractères
	//TODO : BV : Doit être "NON VIDE" et "TAILLE COMPRISE ENTRE 5 A 26"
    private String numero;
    
	//TODO : JPA : Stockée sous la forme de valeurs constantes (EnumType.STRING))
	//TODO : BV : Doit être "NON NULL"
    private TypeCarteDeCretdit type;
    //TODO : JPA : Nom de la colonne est "EXPIRATION_DATE", champ obligatoire et taille max 6 caractères
	//TODO : BV : Doit être "NON VIDE"
    private String dateDexpiration;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TypeCarteDeCretdit getType() {
        return type;
    }

    public void setType(TypeCarteDeCretdit type) {
        this.type = type;
    }

    public String getDateDexpiration() {
        return dateDexpiration;
    }

    public void setDateDexpiration(String dateDexpiration) {
        this.dateDexpiration = dateDexpiration;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.dateDexpiration);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarteDeCredit other = (CarteDeCredit) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.dateDexpiration, other.dateDexpiration)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return "com.upec.m2.library.model.CarteDeCredit[ id=" + id + " ]";
    }
    
}
