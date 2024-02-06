# Serveur FTP 

## Description

FTP est l’abréviation de File Transfer Protocol, Ce protocole de communication est utilisé pour l’échange de fichiers entre un serveur et un client. FTP est utile pour transférer des fichiers entre ordinateurs, que ce soit à distance ou au sein d’un réseau local, votre ordinateur personnel peut même faire office de serveur FTP. Il intervient au niveau de la couche application du modèle OSI (couche n°7) et utilise TCP comme protocole de transport.

## Fonctionnalités Principales

- Téléchargement de fichiers depuis le serveur vers le client (Download)
- Téléversement de fichiers depuis le client vers le serveur (Upload)
- Gestion sécurisée des connexions FTP

## Installation
VSFTPD (Very Secure FTP Daemon) est un serveur FTP open source populaire pour les systèmes basés sur Unix/Linux.

#### Installation de vsftpd
```http
  sudo dnf install vsftpd
```


#### Démarrage du service vsftpd
```http
  sudo systemctl start vsftpd
```

#### Vérification du statut du service vsftpd
```http
  sudo systemctl status vsftpd
```

## Configuration

#### Modification du fichier de configuration
```http
  sudo vi /etc/vsftpd/vsftpd.conf
```
`Les modes`

**Mode actif :**
Si vous utilisez firewalld sur les systèmes basés sur systemd (comme Fedora), vous pouvez exécuter :
```http
  Sudo firewall-cmd –add-service=ftp --permanent
```

**Mode passif :**

```http
Assurez-vous que l'option pasv_enable est définie sur YES
```

## Présenté par :

- Fatima-zahra Ait Benalla
- Fatima Es-sofyany 
- Kawtar Herra
## Encadré par :
- Mr.Moukhafi




