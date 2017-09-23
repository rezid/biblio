/*"

 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author github name : rezid
 */
//TODO : JPA : Mettre les requêtes nommées
@Entity
@Table(name="OUVRAGE_01")
public class Ouvrage implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;  	

    @Transient
    private String auteur;
    
    //TODO : BV : Créer une contrainte "NON NULL"
    @Column(length=256, nullable=false, name="TITLE")
    private String titre;
    
    //TODO : BV : Créer une contrainte "NON NULL"	
    @Column(nullable=false, name="DESCRIPTION", length=3072)
    private String description; 
	
    //TODO : BV : Créer une contrainte "DATE DANS lE PASSE"
    @Column(nullable=true, name="PUB_DATE")
    @Temporal(TemporalType.DATE)
    private Date dateDePublication;
    
    @Enumerated(EnumType.STRING)
    private OuvrageStatusType statut;
    
    @Lob
    private byte[] image;
    
    private String reference;
    
    
    public Ouvrage(){
        
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(Date dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public OuvrageStatusType getStatut() {
        return statut;
    }

    public void setStatut(OuvrageStatusType statut) {
        this.statut = statut;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.auteur);
        hash = 67 * hash + Objects.hashCode(this.titre);
        hash = 67 * hash + Objects.hashCode(this.reference);
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
        final Ouvrage other = (Ouvrage) obj;
        if (!Objects.equals(this.auteur, other.auteur)) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        if (!Objects.equals(this.reference, other.reference)) {
            return false;
        }
        return true;
    }
    
    
}
