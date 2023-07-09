
### cursos
>- https://udemy.com/course/admin-jboss-eap/learn/lecture/13754360#overview

### proyecto realizado
>-  en spring tool suite 3.9.11
>- plugin JBoss Tools 4.13.0.Final
>- Web Dynamic 2.5
>- Servicor JBoss EAP 7.2 Windows
>- java 1.8
>- Spring Tool Suite 3.9.11.RELEASE
>- https://github.com/spring-projects/toolsuite-distribution/wiki/Spring-Tool-Suite-3

### instalar jboss EAP 7.2
>- https://www.youtube.com/watch?v=FCgTSgGaxD8
>- https://developers.redhat.com/products/eap/download?sc_cid=701f2000000Rm5EAAS&gclid=CjwKCAjwp-X0BRAFEiwAheRui1RkJiwqh5J4T098xpBE-jzyItsB3diTB0oVGwK_9b-oUh_g9ILpDhoCW0sQAvD_BwE&gclsrc=aw.ds%E2%80%8B

### levantar jboss EAP 7.2
>- standalone.bat -b 0.0.0.0
>- standalone.bat -c standalone-full.xml

### cambiar la dirección de administrador mediante comandos, primero por la siguiente ruta
>- http://localhost:9990/console/index.html#interface;name=public
>- ./standalone.bat -Djboss.bind.address.management=192.168.100.180


### archivo de congiguración:
>- en linux /opt/jboss/bin/init.d
>- en windows C:\jboss-eap-7.2\bin\standalone.conf.bat


### proyecto realizado en primefaces
>- https://github.com/programacionparaaprender/primefaces

### vídeo de ejemplo web service
>- https://www.youtube.com/watch?v=4n33DDhbY4s
>- https://www.youtube.com/watch?v=4n33DDhbY4s

### este vídeo funciono
>- https://www.youtube.com/watch?v=fvKoSySXbEE

###  ruta de prueba de web service
>- http://localhost:8080/PrimerWS/HolaWebService?wsdl
>- http://localhost:8080/PrimerWS/HolaWebService/servlet/AxisServlet
>- mkdir prueba && cd prueba
>- wsimport -keep http://127.0.0.1:8080/PrimerWS/HolaWebService?wsdl
### soapui
>- https://www.soapui.org/downloads/soapui/