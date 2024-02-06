# SSH/SSL
## Installation des Outils

### OpenSSH

Pour installer OpenSSH sur les principales distributions Linux, utilisez la commande appropriée selon votre gestionnaire de paquets :

# Pour Ubuntu/Debian
sudo apt-get install openssh-server

# Pour CentOS
sudo yum install openssh-server

# Pour Arch Linux
sudo pacman -S openssh


### Ansible

Installez Ansible en utilisant les commandes suivantes :

# Pour Ubuntu/Debian
sudo apt-get install ansible

# Pour CentOS
sudo yum install ansible

# Pour Arch Linux
sudo pacman -S ansible


### Wireshark

Installez Wireshark avec les commandes suivantes :

# Pour Ubuntu/Debian
sudo apt-get install wireshark

# Pour CentOS
sudo yum install wireshark

# Pour Arch Linux
sudo pacman -S wireshark


## Gestion des SSH Keys

### Génération des SSH Keys

ssh-keygen -t ed25519 -C "nom ou description de la cle"


### Copie de la SSH Key du Client au Serveur

ssh-copy-id "chemin de la cle generer" user@serverip


## Configuration de UFW (Uncomplicated Firewall)

### Installation de UFW

# Pour Ubuntu/Debian
sudo apt-get install ufw

# Pour CentOS
sudo yum install ufw

# Pour Arch Linux
sudo pacman -S ufw


### Autorisation SSH dans UFW

sudo ufw enable
sudo ufw allow 22/tcp


### Status de UFW et SSH

sudo ufw status


## Connexion à une Machine avec SSH

ssh user@machine-ip


## Configuration d'Ansible

### Configuration d'Ansible avec ansible.cfg

Créez ou modifiez le fichier ansible.cfg avec le contenu suivant :

[default]
inventory=inventory
host_key_checking=False


### Fichier d'Inventaire inventory

Créez le fichier inventory avec le contenu suivant :

[machines]
machine1 ansible_host=IP_machine1
machine2 ansible_host=IP_machine2
# Ajoutez d'autres machines au besoin


### Test du Ping avec Ansible

ansible all -m ping --ask-pass


### Exemple de Playbook YAML

Créez un fichier create_folder.yml avec le contenu suivant :

yaml
---
-name: creer un dossier avec ansible 
 hosts: machines
 become: true # pour executer les commandes en tant que superutilisateur 

 tasks:
    - name: Create a folder
      file:
        path: /path/to/folder
        state: directory
	mode: 0775 # definir les permisions au dossier



### Exécution du Playbook avec Ansible

ansible-playbook -i inventory create_folder.yml
