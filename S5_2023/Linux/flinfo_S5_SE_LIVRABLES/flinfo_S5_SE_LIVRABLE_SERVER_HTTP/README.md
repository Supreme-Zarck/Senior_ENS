            ************** Guide d'installation du serveur HTTP sur Ubuntu ***************

Ce guide fournit des instructions détaillées sur la configuration et l'installation d'un serveur HTTP (Apache) sur un système Ubuntu.
 Suivez attentivement ces étapes pour mettre en place votre serveur web.
 /////// Étapes d'installation //////////
 //////// 1. Mise à jour du système ///////
Avant d'installer Apache, mettez à jour votre système en exécutant les commandes suivantes dans votre terminal :
sudo apt update
sudo apt upgrade
//////// 2. Installation d'Apache /////////
Utilisez la commande suivante pour installer le serveur HTTP Apache :
sudo apt install apache2
//////// 3. Vérification du statut d'Apache //////////
Après l'installation, vérifiez si Apache est en cours d'exécution avec la commande suivante :
sudo systemctl status apache2
Si Apache est actif, vous verrez un message indiquant que le service est en cours d'exécution.
///////// 4. Configuration du pare-feu /////////
Si un pare-feu est actif sur votre système, vous devez autoriser le trafic HTTP. Pour cela, utilisez la commande suivante :
sudo ufw allow 'Apache'
//////////// 5. Test du serveur ////////
Ouvrez un navigateur web et accédez à l'adresse IP de votre serveur ou à "http://localhost". Si Apache a été installé avec succès,
 vous verrez la page par défaut d'Apache confirmant que le serveur fonctionne.
//////// 6. Gestion d'Apache ////////
Pour démarrer Apache : sudo systemctl start apache2
Pour arrêter Apache : sudo systemctl stop apache2
Pour redémarrer Apache : sudo systemctl restart apache2





