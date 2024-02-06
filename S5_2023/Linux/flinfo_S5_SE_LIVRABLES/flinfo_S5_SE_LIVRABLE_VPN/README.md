
```

# Guide d'Installation et de Configuration d'OpenVPN

Ce document explique étape par étape le processus d'installation et de configuration d'OpenVPN sur un système Linux.

## 1. Téléchargement du script d'installation

Téléchargez le script d'installation depuis le référentiel officiel OpenVPN.L'utilisation du script est juste une manière pour faciliter la tache.

!!!!!!!!!Attention: Assurez-vous que le lien du script que vous utiliser est fiable avant de le telecharger et puis de lire le script d'installation avant de l'exécuter pour comprendre les opérations qu'il effectuera sur votre système.

Bonus : vous pouvez créer votre propre scipt (bon courage)

```les commandes utilisées:
wget https://git.io/vpn -O openvpn-install.sh
sudo chmod +x openvpn-install.sh
sudo ./openvpn-install.sh
```
```##2. Redémarrage du service OpenVPN
Après l'installation, redémarrez le service OpenVPN pour considérer les changements et faire une vérification que le service est en cours d'exécution et sans erreurs..

```les commandes utilisées:
sudo systemctl restart openvpn
sudo systemctl status openvpn
```



```## 3. Configuration du pare-feu avec UFW

Activez UFW (Uncomplicated Firewall) et configurez-le pour autoriser le trafic OpenVPN.

```les commandes utilisées:
sudo ufw enable
sudo ufw status
sudo ufw allow 1194/udp
sudo ufw status
```

```## 4. Installation d'outils réseau

```les commandes utilisées:
sudo apt install net-tools
sudo netstat -anp | grep openvpn
```

```## 6. Installation du gestionnaire de réseau OpenVPN

```les commandes utilisées:
sudo apt install -y network-manager-openvpn
```

```## 7. Vérification des interfaces réseau

Vérifiez les interfaces réseau pour confirmer la configuration.

```les commandes utilisées:
ifconfig
```
```
Ce guide fournit une référence rapide pour l'installation et la configuration d'OpenVPN sur votre système dans le pc server . Pour plus de details, consultez le livrable .



