# biblio

Cette application est  un gestionnaire de bibliothèque. Les rayons de cette bibliothèque sont : 
Informatique, Science, Technologie Lettre & Littérature, CD et DVD. 
L’objectif de la future  application est de permettre aux étudiants et enseignants 
- De s’abonner en ligne et de recherche des ouvrages par titre, auteur, thème, etc... 
- De mettre les ouvrages souhaités, qui peuvent être des livres,  DVD ou  CD, dans un panier virtuel et les reversés. 
- Une fois la réservation validée, d’aller récupérer le livre à la bibliothèque en présentant un  code qui est généré par l’application. 
- L’application doit aussi permettre à un bibliothécaire de suivre l’état d’un ouvrage Prêté,  en retard, retourné, ouvrage disponible,  réservé.
- Pour pouvoir emprunter un ouvrage, les utilisateurs doivent au préalable créer des comptes dans l’application (pas besoin de validation dans un premier temps càd qu’un compte créé devient automatique fonctionnel).   
- Une fois  l’utilisateur inscrit, son mot de passe lui est envoyé par mail. Il peut s’authentifier et voir l’ensemble de livres disponibles à la location. 
- Un utilisateur authentifié peut modifier les informations lui concernant (son profil). Et voir sur sa page d’accueil les derniers ouvrages ajoutés. De même, il peut faire des recherches et ajouter des ouvrages (qu’il souhaite réserver) dans son panier virtuel.  Une fois le choix fait, il valide le panier, tous les  ouvrages contenus dans le panier passent à l’état « Réservé » et un code de récupération  est généré. 
- Grâce à ce code, un bibliothécaire peut retrouver les livres réservé afin de service l’abonner.  
- Les abonnés ayant renseigné un numéro de carte bancaire peuvent recevoir  les ouvrage via la poste. 
- Dans ce cas les frais de port sont à la charge de l’abonné. 
- Une fois l’ouvrage remis à l’utilisateur, l’administrateur passe le statut le statut des ouvrages de  « Réservé » à « Prêté ».  
- La durée maximale de prêt d’un ouvrage est de 2 semaines maximum (cette durée doit être configurable).  Si ce délai est dépassé, le statut de l’ouvrage passe automatiquement  de « Prêté » à « En retard ».  
- Une fois le prêt retourné, l’administrateur doit terminer la location et  passer son statut en « Prêt ». 
- Si l’utilisateur connecté est un bibliothécaire, il pourra voir la liste des utilisateurs,  des ouvrages avec leurs statuts, acheter de nouveaux  ouvrages. 
- Tous les soirs à 23h00 l’application lance un batch qui vérifié l’état de tous les ouvrages. Ceux qui sont à l’état « Retourné » passent à l’état « Disponible » et ceux dont le délai est dépassé passent de l’état « Prêté » à « En retard ».
