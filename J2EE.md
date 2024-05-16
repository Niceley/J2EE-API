But de l'application : Une application qui gère la billetterie des JO

Rôle : Utilisateur et Admin

Utilisateur : 
- Possibilité de se connecter, s'inscrire
- Possibilité d'acheter pour lui même / pour une groupe de personne
- Lors de l'achat en groupe -> Appliquer une réduction
- Créer un historique de commande
- Quand une personne achète un billet, il s'inscrit à une épreuve. Lorsqu'une personne achète un lot de billet, il doit inscrire toutes les personnes. (ID des personnes sera le numéro de téléphone, chaque ticket aura un ID unique)

Admin : 
- Il peut ouvrir et fermer la réservation d'une épreuve
- Ajouter/Supprimer des billets (Nombre limité de billet)
- Créer une épreuve 
- Changer / annuler / supprimer un évènement

Point important à retenir / Règle logique et métier : 
- Rajouter un state au billet (Si l'épreuve va se passer ou non), lors de l'annulation, passer le state en false. Si l'évènement est supprimé, supprimé les billets
- CRUD pour Stade, Utilisateur, Evènement, Billet
- Un Utilisateur ne peut pas prendre un billet d'une épreuve à la même date si il a déjà un ticket à cette date
- Si un évènement est annulé, faire une ristourne est faite à toute personne qui a acheté un billet pour cet événement


