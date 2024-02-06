
==============={ READ ME }=================
PROJETEMACS : 
*Étape 1 — Installation Emacs :
##Pour installer Emacs :
sudo dnf install emacs
##Pour lancer Emacs :
emacs
##Pour travailler sur un fichier précis exemple : maitrise.txt
emacs maitrise.txt
##Pour savoir la version d’Emacs :
emacs --version
*Étape 2 — INSTALATION de OpenJDK :
##Pour installer OpenJDK :
dnf search openjdk
##Choisir une version et lancer la commande suivante :
sudo dnf install java-1.8.0-openjdk.x86_64
##Puis lancer une recherche du jvm :
sudo find -name ‘’jvm’’
##Et acceder à ce repertoire par :
cd /usr/lib/jvm 
##Choisir une version de jre et lancer la commande suivante :
sudo dnf install jre
*Étape 3 – compiler et exécuter un programme
java avec Emacs:
Premièrement ouvrir le fichier avec l’extension .java avec Emacs.
Pour la compilation :
Tapez M-x compile
Tapez make -k NomFichier.java
Pour l’execution
Tapez M-x shell (pour ouvrir le terminal dans Emacs)
Lancer la commande suivante :
java NomFicher.java
*Étape 4 – compiler et exécuter une classe java
avec Emacs:
Premièrement ouvrir le fichier avec l’extension .java avec Emacs :
On tape emacs nomFichier.java dans le terminal:
pour compiler ce fichier on va taper M-x compile :
M=Alt ;
Tapez make -k NomFichier.java
accéder au shell dans emacs on tape : M-x shell
pour créer le .class : javac nomFichier.java
pour réaliser un à notre classe on fait la commande :
jar cvf nomFichier.jar NomFichier.class
pour lier ce manifest à notre classe on fait cette commande :
jar cvmf MANIFEST.MF nomFichier.jar NomFichier.class
Étape 5 – exécuter .jar et .java avec Emacs:
Maintenant il nous reste juste d’exécuter nos fichiers .jar et .java :
Commande pour :
.java : java NomFichier.java
.jar : java –jar nomFichier.jar



