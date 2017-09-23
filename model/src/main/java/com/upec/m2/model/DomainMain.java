/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upec.m2.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aiden
 */
public class DomainMain {
    
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    private static final byte[] loadImage(String url) {
        byte[] resp = new byte[0];

        try {
            URL u = new URL(url);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();            
            byte[] chunk = new byte[4096];
            int bytesRead;
            InputStream stream = u.openStream();

            while ((bytesRead = stream.read(chunk)) > 0) {
                outputStream.write(chunk, 0, bytesRead);
            }
            resp = outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return resp;
    }
    
    public static final void main(String... args) throws Exception{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.upec.m2_model_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Ouvrage o1 = new Ouvrage();
        o1.setAuteur("Médéric Munier ");
        o1.setDateDePublication(DATE_FORMAT.parse("01/02/2013"));
        o1.setDescription("Partant de zéro, \"Créez des applications web avec Java EE\" vous fera découvrir pas à pas le développement avec Java EE, en suivant les modèles de conception et les bonnes pratiques en vigueur dans le domaine. Médéric Munier vous guidera dans l'installation de votre environnement de développement et vous fera découvrir l'architecture de l'application. Pas à pas, vous apprendrez à construire votre application en appliquant le design pattern MVC, à manipuler les frameworks MVC avec JSF, et entrer ainsi dans le développement web professionnel, enfin à votre portée !");
        byte[] image  = loadImage("https://static.fnac-static.com/multimedia/FR/Images_Produits/FR/fnac.com/Visual_Principal_340/4/4/2/9791090085244/tsp20130225184736/Creez-des-applications-web-avec-Java-EE.jpg");
        o1.setImage(image);
        o1.setStatut(OuvrageStatusType.DISPONIBLE);
        o1.setTitre("Créez des applications web avec Java EE");
        
        em.persist(o1);
        
        Ouvrage o2 = new Ouvrage();
        o2.setAuteur("Thierry Richard");
        o2.setDateDePublication(DATE_FORMAT.parse("01/04/2017"));
        o2.setDescription("Ce livre s'adresse aux développeurs souhaitant monter en compétences sur le développement d'applications web, côté serveur, avec les technologies essentielles de la plateforme Java EE 7 (Java Enterprise Edition 7).");
        byte[] image2  = loadImage("https://static.fnac-static.com/multimedia/Images/FR/NR/cd/9f/83/8626125/1540-1/tsp20170406164723/Java-EE.jpg");
        o2.setImage(image2);
        o2.setStatut(OuvrageStatusType.DISPONIBLE);
        o2.setTitre("Java EE\nDéveloppez des applications web en Java, Nouvelle édition");

        em.persist(o2);
        
        Ouvrage o3 = new Ouvrage();
        o3.setAuteur("Jérôme Lafosse");
        o3.setDateDePublication(DATE_FORMAT.parse("01/03/2011"));
        o3.setDescription("Ce livre consacré à la plate-forme Java EE s'adresse aux architectes logiciels et développeurs d'applications Java EE souhaitant mettre en place des projets avancés avec des techniques optimisées. La lecture de ce livre requiert des connaissances de base dans le développement d'applications Web en Java. Ces connaissances sont largement détaillées dans l'ouvrage précédent du même auteur « Java EE - Guide de développement d'applications Web en Java » paru aux Editions ENI. Ce nouvel ouvrage a pour objectif de présenter en détail et de façon exhaustive, toutes les étapes de réalisation d'applications Internet avancées en Java EE, à partir d'un projet concret et facilement portable. Il détaille dans un premier chapitre la plate-forme Java EE, ses différentes architectures et API ainsi que les outils utilisés par les professionnels (Eclipse, NetBeans, Subversion, Ant, Hudson, JUnit...) au travers de l'étude de cas. Le second chapitre est consacré à la mise en place détaillée du serveur Java EE de référence : GlassFish. Il détaille les concepts et l'architecture de GlassFish, l'installation et la configuration optimisée du serveur, en passant par la mise en production dans un environnement professionnel (clustering, load balancing, versioning...) et la liaison avec des composants annexes (SGBD, serveur mails...). Le chapitre trois aborde la programmation Web Java EE au travers des Servlets 3.0, JavaServer Pages 2.2 et le framework Java EE de référence : JavaServer Faces 2.0, ainsi que les concepts associés comme les feuilles de style CSS, le langage JavaScript ou encore XHTML. Le quatrième chapitre explore en détail la couche de persistance standardisée en Java . Les fonctionnalités de l'API de référence (Java Persistence API) sont détaillées et mises en application à partir d'exemples, en analogie avec les méthodologies UML et MERISE. Le chapitre cinq présente le tiers métier au travers de la dernière spécification des Enterprises JavaBeans. Les différentes concepts, clients et types d'Enterprises JavaBeans sont explicités à partir de clients Java SE et Java EE, ainsi que les API Java Message Service et Message-Driven Bean. Le dernier chapitre est consacré à l'étude des services Web et traitements asynchrones en Java EE. Les technologies et services SOAP sont présentés en détail avec les différents type de clients (Java SE, Java EE et autres) tout comme les méthodes de packaging et déploiement (JAR, EAR, WAR). Enfin, la dernière partie explore de façon exhaustive l'architecture REST et la mise en place de services RESTful. Le code lié à l'étude de cas traitée dans le livre est en téléchargement sur le site www.editions-eni.fr. L'auteur propose également à ses lecteurs un lieu d'échanges via le site www.gdawj.com qui apporte également un certain nombre d'éléments complémentaires (exemples déployés, directement utilisables, des outils complémentaires pour le développement d'applications Web...).");
        byte[] image3  = loadImage("https://static.fnac-static.com/multimedia/FR/images_produits/FR/Fnac.com/ZoomPE/4/3/6/9782746062634/tsp20110305045220/Developpement-n-tiers-avec-Java-EE.jpg");
        o3.setImage(image3);
        o3.setStatut(OuvrageStatusType.DISPONIBLE);
        o3.setTitre("Développement n-tiers avec Java EE \n Architectures, GlassFish, JSF, JPA, JWS, EJB, JMS, SOAP, REST");

        em.persist(o3);
        
        Ouvrage o4 = new Ouvrage();
        o4.setAuteur("Maxime Gréau");
        o4.setDateDePublication(DATE_FORMAT.parse("01/06/2011"));
        o4.setDescription("Ce livre sur Apache Maven 3, s'adresse à tout développeur amené à travailler sur des projets Java de taille conséquente. Il sert également de guide pour les architectes qui souhaitent mettre en ouvre Apache Maven 3 sur un nouveau projet ou sur un projet existant. Apache Maven, créé il y a tout juste 10 ans, tient aujourd'hui une place centrale dans l'écosystème du développement logiciel sur la plate-forme Java EE. La version 3 est le fruit d'un travail conséquent de la communauté, riche de nombreux retours d'expérience. Du développeur Java débutant à l'architecte technique, chaque lecteur trouvera dans cet ouvrage des informations claires et précises, illustrées par de nombreux schémas, pour aborder avec sérénité la découverte d'Apache Maven, jusqu'à sa gestion au sein d'une infrastructure projet. L'explication des origines d'Apache Maven dans le premier chapitre permet de mieux appréhender l'importance stratégique de sa mise en ouvre sur des projets Java EE. Le deuxième chapitre permet une première approche de la philosophie générale autour de la notion de cycle de vie des projets Maven. Le troisième chapitre se focalise sur l'organisation et les relations entre projets grâce à la gestion des graphes de dépendances, c'est dans le quatrième chapitre que le lecteur trouvera les informations sur l'étendue des possibilités qu'offre Apache Maven grâce à la mise en ouvre de plugins associés à des profils. Tout au long du cinquième chapitre, la mise en place complète d'une infrastructure autour d'Apache Maven sur un projet professionnel Java est détaillée : l'environnement de développement, la mise en place de tests, la gestion des référentiels, l'intégration continue et le processus de releases pour la livraison du projet. Le sixième et dernier chapitre de cet ouvrage traite de la génération de rapports Web complets pour la mesure de la qualité des projets Java. Tout au long du livre l'auteur s'appuie sur une application concrète pour illustrer ses propos. Son code source est en téléchargement sur www.editions-eni.fr.");
        byte[] image4  = loadImage("https://static.fnac-static.com/multimedia/FR/images_produits/FR/Fnac.com/ZoomPE/3/9/0/9782746065093/tsp20130903150426/Apache-maven.jpg");
        o4.setImage(image);
        o4.setStatut(OuvrageStatusType.DISPONIBLE);
        o4.setTitre("Apache maven \n tome 3 , maîtrisez l'infrastructure d'un projet Java EE");
        
        em.persist(o4);

        Ouvrage o5 = new Ouvrage();
        o5.setAuteur("Jérôme Lafosse");
        o5.setDateDePublication(DATE_FORMAT.parse("01/11/2011"));
        o5.setDescription("Ce livre est extrait du titre \"Développement n-tiers avec Java EE\" paru dans la collection Epsilon aux Editions ENI. Il s'adresse à un public de lecteurs initiés désireux de connaître en détail l'installation, la mise en place et la configuration évoluée de ce serveur d'applications Java EE de référence. Pour tirer le meilleur profit possible de ces éléments, vous devez disposer de connaissances de base dans le développement d'applications Web en Java. Chapitre 1 - Présentation du serveur GlassFish : Historique, Object Request Broker (ORB), Internet Inter-Orb Protocol (IIOP), Application Client Container (ACC), Architecture GlassFish... Chapitre 2 - Installation du serveur GlassFish : Installation, Coupler GlassFish et le serveur Web Apache, Apache/GlassFish et HTTPS/SSL, Embedded GlassFish... Chapitre 3 - Domaine GlassFish, concept et sécurité : Arborescence d'un projet GlassFish, Le concept de domaine GlassFish, Le fichier domain.xml, Sécuriser GlassFish, Authentification et Realms... Chapitre 4 - Administration du serveur GlassFish : Les fichiers de configuration, Déployer une application, Déployer une application automatiquement, Supprimer une application, Désinstaller le serveur GlassFish, Gestion des composants... Chapitre 5 - Couplage de Java EE et PHP : Introduction, GlassFish et PHP avec Quercus, Mise en place d'un premier projet Java EE / PHP, Utilisation de classes Java en PHP, Ajouter de nouvelles fonctionnalités à PHP, Utiliser des composants Java EE avec PHP, Profiter de la souplesse de PHP en Java... Chapitre 6 - Outils d'analyse et de supervision : Analyse, monitoring et supervision, Gestion des traces et débogages... Chapitre 7 - Mise en place de l'équilibrage de charge : Clustering et Load Balancing GlassFish, Versioning GlassFish, Rolling Upgrade, Répartition de la charge ou Load Balancing... Chapitre 8 - Optimisation des performances du serveur : Introduction, La version de Java, La machine virtuelle Java (JVM), le Java Heap Size, La configuration de l'écouteur HTTP, La configuration des processus HTTP, Le temps d'attente entre les requêtes, Le cache HTTP, La configuration par défaut, La configuration JDBC pour l'accès aux bases de données, Désactiver les traces et logs d'accès... Chapitre 9 - Gestion des ressources : Gestion des ressources avec GlassFish, Administration de JavaMail, Gestion des connexions aux bases de données...");
        byte[] image5  = loadImage("https://static.fnac-static.com/multimedia/FR/images_produits/FR/Fnac.com/ZoomPE/9/5/0/9782746070059/tsp20130903151203/Glafish-decouverte-du-serveur-d-applications-Java-EE.jpg");
        o5.setImage(image5);
        o5.setStatut(OuvrageStatusType.DISPONIBLE);
        o5.setTitre("Glassfish : découverte du serveur d'applications Java EE");        
        
        em.persist(o5);
        
        em.getTransaction().commit();
        em.close();
    }
}
