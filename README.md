# TP/Projet J2EE

# Author

David W. & Ludovic M. B3 dev

Project startup

    java 17
    mvn 3.9.6
    Modifier le lien et identifiants de la base de données dans ./src/main/java/resources/application.properties
    Lancer l'application : mvn spring-boot:run

Une partie du JWT TOKEN est mit en place. Il n'y a pas besoins d'être 
connectés pour faire des requêtes. (Role utilisateur non mit en place)

Après lancer, notre projet peut être tester directement sur Postman ou à l'aide de Swagger UI :
http://localhost:8080/swagger-ui/index.html#/

# Endpoints
Authentification

    Register : localhost:8080/auth/register [POST]
    Login : localhost:8080/auth/login [POST]

Utilisateurs

    Voir tous les users : localhost:9090/user/ [GET]
    Voir un user : localhost:8080/user/{id} [GET] 
    Modifier les informations d'un user : localhost:8080/user/{id} [PUT] 
    Supprimer un user : localhost:8080/users/{id} [DELETE] 

Acheter/Créer tickets
    
    Récupérer un tickets : localhost:8080/api/tickets/{id} [GET]
    Modifier un ticket : localhost:8080/api/tickets/{id} [PUT]
    Supprimer un ticket : localhost:8080/api/tickets/{id} [DELETE]
    Créer un ticket : localhost:8080/api/tickets/ [POST]
    Tout les tickets : localhost:8080/api/tickets/all [GET]

Gérer les stades (Stadium)

    Voir tous les stades : localhost:8080/api/stadium/all [GET]
    Voir un stade : localhost:8080/api/stadium/{id} [GET]
    Ajouter un stade : localhost:8080/api/stadium/create [POST]
    Modifier un stade : localhost:8080/api/stadium/{id} [PUT]
    Supprimer un stade : localhost:9090/stadium/{id} [DELETE] 
    

Events

    Voir toutes les epreuves : localhost:8080/api/events/all [GET]
    Voir une épreuve : localhost:8080/api/events/{id} [GET]
    Créer une épreuve : localhost:8080/api/events/create [POST]
    Modifier une épreuve : localhost:8080/api/events/{id} [PUT]
    Supprimer une épreuve : localhost:8080/api/events/{id} [DELETE]
    Annuler une épreuve : Changer le state dans une épreuve en false

Order / Commande 
    
        Voir toutes les commandes : localhost:8080/api/orders/all [GET]
        Voir une commande : localhost:8080/api/orders/{id} [GET]
        Créer une commande : localhost:8080/api/orders/create [POST]
        Modifier une commande : localhost:8080/api/orders/{id} [PUT]
        Supprimer une commande : localhost:8080/api/orders/{id} [DELETE]


