
#Firewall
#Installation de HTTPD
sudo dnf install httpd
Installation : 
# dnf -y install httpd 
# mv /etc/httpd/conf.d/welcome.conf /etc/httpd/conf.d/welcome.conf.org 
Creation d’une page web : 
# vi /var/www/html/index.html 
<html> 
<body> 
<div style="width: 100%; font-size: 40px; font-weight: bold; text-align: center;"> 
Bienvenu sur mon site web ! 
</div> 
</body> 
</html> 

Configuration du firewall 
Activer le firewall : 
# systemctl enable firewalld 
# systemctl restart firewalld 
Autoriser l’accès web 
# firewall-cmd --add-service=http 
# firewall-cmd --add-service=https 
# firewall-cmd --runtime-to-permanent 
# firewall-cmd --reload 
Bloquer l’accès web 
# firewall-cmd --remove-service=http 
# firewall-cmd --remove-service=https 
# firewall-cmd --runtime-to-permanent 
# firewall-cmd --reload 
Test : 
Depuis le client Ubuntu tester l’accès au site web hébérgé dans le serveur Fedora.