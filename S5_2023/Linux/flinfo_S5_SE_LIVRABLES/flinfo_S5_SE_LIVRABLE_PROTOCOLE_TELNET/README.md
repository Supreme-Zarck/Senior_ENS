
  ***** Installation et Configuration du protocole Telnet *****




Ce fichier README fournit des instructions détaillées sur l'installation et la configuration du protocole Telnet. Assurez-vous de suivre attentivement chaque étape pour garantir un processus sans problème.


                     ***Protocole Telnet***


Le protocole Telnet est un protocole de communication utilisé pour établir une connexion interactive bidirectionnelle entre deux ordinateurs sur un réseau. Il fait partie des protocoles de la couche application du modèle OSI. Telnet permet à un utilisateur d'accéder à distance à un système informatique et d'interagir avec celui-ci comme s'il était physiquement présent devant la machine.


Bien que Telnet ait été largement utilisé dans le passé, il a été en grande partie remplacé par des protocoles plus sécurisés, notamment SSH. Cependant, Telnet reste parfois utilisé dans des environnements locaux ou contrôlés où la sécurité n'est pas une préoccupation majeure.




Installation:


                        **Dans la machine serveur**


1- apt-get update:

-->sudo apt-get update

-->Cette commande met à jour la liste des paquets disponibles, en téléchargeant les informations les plus récentes sur les versions des logiciels disponibles dans les référentiels configurés sur votre système.




2- apt-get upgrade:

-->sudo apt-get upgrade

-->Cette commande met à jour tous les paquets installés sur votre système vers les versions les plus récentes disponibles dans les référentiels. Elle ne supprime pas de paquets ni n'ajoute de nouveaux paquets.




3- apt install telnetd xinetd:

-->sudo apt install telnetd xinetd

-->Cette commande installe les paquets nécessaires pour le service Telnet et le démon xinetd. Telnetd est le serveur Telnet, et xinetd est un service de gestion des serveurs Internet.




4-systemctl status xinetd.service:

-->sudo systemctl status xinetd.service

-->Cette commande affiche le statut du service xinetd, indiquant s'il est actif, inactif ou s'il y a des erreurs.




5-systemctl start xinetd.service:

-->sudo systemctl start xinetd.service

-->Cette commande démarre le service xinetd s'il n'est pas déjà en cours d'exécution.




6-Configuration de Telnet dans xinetd:

-->nano /etc/xinetd.d/telnet

-->Cette commande ouvre le fichier de configuration de Telnet dans l'éditeur de texte nano. 

--> Ajoutez ou modifiez les lignes selon les besoins :

service telnet {
  disable = no
  flags = REUSE
  socket_type = stream
  wait = no
  user = root
  server = /usr/sbin/in.telnetd
  log_on_failure += USERID
}

-->Explication des lignes de configuration :

*disable = no: Active le service Telnet. Si cette ligne est définie sur "yes", le service serait désactivé.


*flags = REUSE: Utilise l'option "REUSE" pour le socket, indiquant que le socket peut être réutilisé pour les connexions ultérieures.


*socket_type = stream: Spécifie que le type de socket utilisé pour le service Telnet est de type "stream", ce qui signifie une connexion TCP.


*wait = no: Indique que le service n'attend pas qu'une connexion soit établie avant de lancer un autre processus.


*user = root: Spécifie que le service Telnet sera exécuté avec les privilèges de l'utilisateur "root".


*server = /usr/sbin/in.telnetd: Indique le chemin de l'exécutable du serveur Telnet. Dans ce cas, /usr/sbin/in.telnetd est l'emplacement de l'exécutable.


*log_on_failure += USERID: En cas d'échec de connexion, cette ligne spécifie de journaliser l'identifiant de l'utilisateur (USERID).



7-ufw enable:

-->sudo ufw enable

-->Cette commande active le pare-feu UFW (Uncomplicated Firewall) sur votre système.




8-ufw allow telnet:

-->sudo ufw allow telnet

-->Cette commande autorise le trafic Telnet à travers le pare-feu UFW.




9-apt install wireshark:

-->sudo apt install wireshark

-->Cette commande installe le logiciel Wireshark, un outil de capture et d'analyse de paquets réseau.





                         **Dans la machine cliente**



1-Téléchargement et installation de Telnet

-Assurez-vous que Telnet est installé sur votre système. Si ce n'est pas le cas, vous pouvez l'installer en suivant les étapes appropriées pour votre système d'exploitation.

-->Sur Linux (utilisant apt comme gestionnaire de paquets) :

sudo apt-get install telnet


-->Sur Windows :

*Allez dans "Panneau de configuration" > "Programmes" > "Activer ou désactiver des fonctionnalités Windows".

*Cochez la case "Client Telnet" et cliquez sur "OK".




2-Connexion à un hôte distant

-Pour vous connecter à un hôte distant via Telnet, utilisez la commande suivante :

-->telnet [adresse IP] [port]

-->Remplacez [adresse IP] par l'adresse IP de l'hôte distant et [port] par le port Telnet approprié (23 par defaut).