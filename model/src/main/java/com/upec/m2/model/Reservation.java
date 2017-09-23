/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author UPEC
 */
//TODO : JPA : Transformer la classe en entité. Stratégie de génération de la clé primaire "IDENTITY"
//TODO : JPA : Completerter les requêtes nommées suivantes 
			 //(findAllReservationsByLogin, ->  Charge toutes les réservations d'une personne donnée
			 //findAllReservationsByLoginAndOuvrage -> Charge toutes les réservations d'une personne donnée et contenant l'ouvrage donné
			 //)   

public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    
    //TODO : JPA : Mapper au type "TIMESTAMP"
	//TODO : BV : Créer une contrainte "NON NULL"	
    private Date dateDeReservation;
    
	//TODO : JPA : Rélation unidirectionnelle 1-* avec définition de table de jointure
	//TODO : BV : Créer une contrainte "NOT VIDE (CONTENIR AU MOINS 1 Ouvrage)"	
    @JoinTable(name = "RESERVATION_OUVRAGE", joinColumns = @JoinColumn(name = "RESERVATION_ID"), inverseJoinColumns = @JoinColumn(name = "OUVRAGE_ID"))
    private List<Ouvrage> ouvrages;
	
	//TODO : JPA : Rélation bidirectionnelle *-1. Cette classe (Reservation) est propriétaire de la rélation
				 //rendre la rélation obligatoire "optional = false"
	//TODO : BV : Annoter pour que l'objet Adherent soit validé à la validation de la classe courant				 
    private Adherent adherent;   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Date getDateDeReservation() {
        return dateDeReservation;
    }

    public void setDateDeReservation(Date dateDeReservation) {
        this.dateDeReservation = dateDeReservation;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public void setOuvrages(List<Ouvrage> ouvrages) {
        this.ouvrages = ouvrages;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.upec.m2.library.model.Reservation[ id=" + id + " ]";
    }
    
}
