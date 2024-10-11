# Projekt prezentujący model MVC.

### Pobranie projektu z GitHub:

* Otwórz terminal (Command Prompt lub PowerShell na Windowsie, terminal na macOS lub Linuxie).

* Upewnij się, że masz zainstalowanego Git’a, wpisując polecenie:

`` git --version ``

Jeśli Git nie jest zainstalowany, pobierz i zainstaluj go z oficjalnej strony.

* W terminalu przejdź do katalogu, w którym chcesz umieścić projekt:

`` cd /sciezka/do/katalogu ``

* Skopiuj projekt z GitHub, wpisując polecenie:

`` git clone https://github.com/lciuraj/store.git ``


### Budowanie projektu za pomocą Mavena

* Upewnij się, że masz zainstalowanego Maven’a, wpisując polecenie:

`` mvn -v ``


Jeśli Maven nie jest zainstalowany, pobierz i zainstaluj go z oficjalnej strony.

* Aby zbudować projekt, w terminalu wpisz:

`` mvn clean install ``

> clean usuwa wszystkie pliki wygenerowane w poprzednich kompilacjach.

> install buduje projekt i instaluje jego artefakty w lokalnym repozytorium Maven.


### Uruchamianie Tomcat

* Pobierz Apache Tomcat z oficjalnej strony (użyj najnowszej stabilnej wersji).

* Rozpakuj pobrany plik ZIP (lub TAR.GZ dla systemów Unix) do wybranego katalogu.

* Upewnij się, że JAVA_HOME jest ustawione i wskazuje na Twoją instalację JDK, ponieważ Tomcat wymaga Javy. Możesz to zrobić w następujący sposób:
  * Na Windows: ``set JAVA_HOME=C:\ścieżka\do\jdk``
  * Na macOS/Linux: ``export JAVA_HOME=/ścieżka/do/jdk``

* Skopiuj wygenerowany plik .war do katalogu webapps w katalogu instalacyjnym Tomcat. Na przykład:
  * Windows: ``copy target\nazwa_projektu.war C:\Tomcat\webapps\``
  * macOS/Linux: ``cp target/nazwa_projektu.war /opt/tomcat/webapps/``

* Aby uruchomić Tomcat:
  * Na Windows uruchom skrypt startup.bat znajdujący się w katalogu bin Tomcata: ``C:\Tomcat\bin\startup.bat``
  * Na macOS/Linux uruchom skrypt startup.sh w katalogu bin: ``/opt/tomcat/bin/startup.sh``

* Otwórz przeglądarkę i wpisz w pasku adresu: ``http://localhost:8080/store_war_exploded/``

* Jeśli chcesz zatrzymać Tomcat:
  * Na Windows: uruchom skrypt shutdown.bat: ``C:\Tomcat\bin\shutdown.bat``
  * Na macOS/Linux: uruchom skrypt shutdown.sh: ``/opt/tomcat/bin/shutdown.sh``


## ZADANIA DO SAMODZIELNEGO WYKONANIA

* Dodaj przycisk "Rozmyśliłem się", który będzie działał analogicznie do przycisku "Powrót do strony głównej" do każdego z działów,
* Dodaj kolejny produkt, który będzie można dodać do koszyka ma działać analogicznie do już istniejących,
* Dodaj do widoku koszyka przycisk "Wyczyść koszyk", który będzie powodował wyczyszczenie całego koszyka,