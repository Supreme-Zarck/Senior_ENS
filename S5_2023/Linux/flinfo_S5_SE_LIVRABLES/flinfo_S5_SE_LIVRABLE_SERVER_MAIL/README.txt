# Installation d'un serveur de messagerie sur Linux

Ce guide vous aidera à configurer un serveur de messagerie sur un système Linux en utilisant Postfix et Dovecot.

## Étapes d'installation

1. **Installation des paquets nécessaires**

   Assurez-vous que les paquets suivants sont installés sur votre système :

   ```bash
   sudo apt-get update
   sudo apt-get install postfix 
   
   
   # /etc/postfix/main.cf

      myhostname = VOTRE_NOM_DE_DOMAINE
      mydomain = VOTRE_NOM_DE_DOMAINE
      myorigin = $mydomain

   sudo apt-get install dovecot-imapd

   # /etc/dovecot/dovecot.conf
       
      protocols = imap

