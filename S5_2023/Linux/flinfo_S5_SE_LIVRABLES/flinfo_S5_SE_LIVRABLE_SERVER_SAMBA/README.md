# Guide de Commandes Samba 
##Ubuntu

### Installation de Samba :
sudo apt update
sudo apt-get install samba

### Affichage des Paquets Samba Installés :
dpkg --get-selections | grep samba

### Ajout d'un Utilisateur Samba :
sudo smbpasswd -a nom_utilisateur

### Ouverture du Fichier de Configuration Samba :
sudo vim /etc/samba/smb.conf

### Démarrage du Service Samba :
sudo systemctl start smbd

### Vérification du Statut du Service Samba :
sudo systemctl status smbd

##Fedora

### Installation de Samba :
sudo dnf install samba

### Affichage des Paquets Samba Installés :
rpm -qa | grep samba

### Ajout d'un Utilisateur Samba :
sudo smbpasswd -a nom_utilisateur

### Ouverture du Fichier de Configuration Samba :
sudo nano /etc/samba/smb.conf

### Démarrage du Service Samba :
sudo systemctl restart smb

### Vérification du Statut du Service Samba :
sudo systemctl status smb
