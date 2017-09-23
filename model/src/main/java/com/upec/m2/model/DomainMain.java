/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aiden
 */
public class DomainMain {
    public static final void main(String... args) {
        System.out.println("Hello, Word!");
        
        EntityManagerFactory em_factory = Persistence.createEntityManagerFactory("com.upec.m2_model_jar_1.0-SNAPSHOTPU");
        
        EntityManager em = em_factory.createEntityManager();
        
        em.close();
        
        System.out.println("End.");
    }
}
