
==============={ READ ME }=================
*PROJET SERVICE LUNIX"DAEMONS": 

 
*Étape 1 — Affichage de la version de systemd

Pour afficher la version du système de gestion des services systemd :
systemctl --version

Pour afficher la liste des processus en cours d'exécution avec leur nom :
ps -p 1 -o comm==

Afficher la liste des types d'unités disponibles pour systemd :
systemctl -t help

*Étape 2 — Création d'un démon avec Script Shell
Un script Shell est un programme écrit dans un langage de script interprété qui automatise des tâches sur un système Unix.

*Étape 3 — Gestion du service SSH:
Mise à jour du référentiel de packages
sudo dnf update

Installation du package SSH:
sudo dnf install openssh-server

##Démarrage et arrêt des services:

Démarrer un service :
systemctl start <nom du démon>

##Arrêter un service en cours d’exécution :
systemctl stop <nom du démon>

##Redémarrer un service :
systemctl restart <nom du démon>

##Recharger un service :
systemctl reload <nom du démon>

Activation et désactivation des services

##Activer le démarrage automatique d'un service :
systemctl enable <nom du démon>

Désactiver le démarrage automatique d'un service :
systemctl disable <nom du démon>

Vérification de l’état des services:
Vérifier l’état d’un service :

systemctl status <nom du démon>
Vérifier si une unité est active :

systemctl is-active <nom du démon>

Vérifier si une unité est activée pour le démarrage automatique :
systemctl is-enabled <nom du démon>

*Étape 4 — Présentation générale d’états de système

Afficher toutes les unités actives :
systemctl list-units

Consulter toutes les unités chargées par systemd (actives ou non) :
systemctl list-units --all

Consulter uniquement les unités de service actives :
systemctl list-units --type=service

*Étape 5 — Gestion d’unité

Affichage du fichier de l’unité:
cat <fichier de l'unité>

Affichage des dépendances de l’unité:
list-dependencies <nom du démon>

Vérification des propriétés de l’unité:
systemctl show <nom du démon>

##Masquage et affichage des unités:
Pour masquer une unité :
systemctl mask <nom du démon>

Pour afficher une unité :
systemctl unmask <nom du démon>

*Étape 6 — Les journaux

Afficher les journaux
journalctl --no-pager

Afficher les journaux en inversé
journalctl -r

Lire le journal de démarrage du système Linux
journalctl -b

Afficher les journaux d’un démon spécifique

journalctl -u <nom du démon>



==============={ Par : Meryeme Chaouchi & Manal El Agri & Khadija Hrich }=================


