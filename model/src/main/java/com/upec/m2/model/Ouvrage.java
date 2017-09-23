/*"

 */
package com.upec.m2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Salifou BERTHE
 */
//TODO : JPA : Mettre l'annotation pour que cette classe Ouvrage soit une entité 
//TODO : JPA : Le nom de la table doit être "OUVRAGE_01"
//TODO : JPA : Mettre les requêtes nommées
public class Ouvrage implements Serializable{
	private static final long serialVersionUID = 1L;
	//TODO : JPA : Clé primaire avec  stratégie de génération IDENTITY.
	//TODO : JPA : Mettre l'annotation pour que le nom de la colonne de cet attribute soit  "ID"
    private Long id;  	
	
	//TODO : JPA : Rendre cet attribut transient (JPA ne doit pas le persister)
    private String auteur;
	//TODO : JPA : Créer les constraintes de base de données :  champ obligatoire, 
			 //256 caractères max et nom de la colonne "TITLE"
	//TODO : BV : Créer une contrainte "NON NULL"			
    private String titre;
	//TODO : JPA : Créer les constraintes de base de données :  champ obligatoire, 
			 //3072 caractères max et nom de la colonne DESCRIPTION	
	//TODO : BV : Créer une contrainte "NON NULL"			 
    private String description;
	//TODO : JPA : Créer les constraintes de base de données : champ non obligatoire,
			//nom de la colonne "PUB_DATE", format de date "DD/mm/YYYY" (sans heure/minute/seconde)
	//TODO : BV : Créer une contrainte "DATE DANS lE PASSE"			
    private Date dateDePublication;
	//TODO : JPA : stocker sous la forme de valeur constante (EnumType.STRING) 
    private OuvrageStatusType statut;
	//TODO : JPA : Stocker en données binaires
    private byte[] image;
    
    // i have added this variable
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
