/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author UPEC
 */
//TODO : JPA : Transformer la classe en entité. Stratégie de génération de la clé primaire IDENTITY
//TODO : JPA : Cette classe est la classe Mère des classes Enseignant et Etuduant (voir la diagramme UML des classes)
//TODO : JPA : Utiliser la stratégie d'héritage "SINGLE_TABLE", 
			 //avec colonne de dsicrimination sur 3 caractères et de nom "ADHERENT_TYPE"
//TODO : JPA : Créer les requêtes nommées suivantes (findAllAdherents, findAllAdherentByLogin) 
@DiscriminatorColumn(name = "ADHERENT_TYPE",discriminatorType = DiscriminatorType.STRING, length = 3)
public class Adherent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
	//TODO : BV : Doit être "NON NULL"    
    private String nom;
	//TODO : BV : Doit être "NON NULL"	
    private String prenom;
	//TODO : JPA : Doit être unique et non null
	//TODO : BV : doit être "NON NULL et la TAILLE COMPRISE ENTRE à 3 - 10 CARACTERES"	
    private String login;
	//TODO : BV : Doit être "NON VIDE"
    private String motDePasse;
	
    private String numeroTelephone;
	//TODO : BV : Créer une contrainte personnalisée  @Email de validation d'adresse mail
				 //Doit avoir au moins 5 caractères et doit être au format adresse mail 
				 //L'expression regulière de validation d'adresse mail est
				 //^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$
    private String email;
    
    //TODO : JPA : Attention la classe "Adresse" est marquée @Embeddable (voir la classe)
	//TODO : BV : Doit être validé en même temps que la classe Adherent
    private Adresse adresse;
    
	//TODO : JPA : Cette classe "Adherent" n'est pas propriétaire de cette rélation
				 //rélation 1-*. Mettre l'attribut orphanRemoval = true 
	//TODO : BV : Doivent être validés en même temps que la classe Adherent			 
    private List<Reservation> reservations;
    
    //TODO  : JPA : Cette classe "Adherent" estpropriétaire de cette rélation	
				  //cascade = CascadeType.ALL
	//TODO : BV : Doit être validé en même temps que la classe Adherent			  
    private Compte compte;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
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
        if (!(object instanceof Adherent)) {
            return false;
        }
        Adherent other = (Adherent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.upec.m2.library.model.Adherent[ id=" + id + " ]";
    }
    
}
