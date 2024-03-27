EN: Design patterns problems solving for the Software Quality and Testing faculty course

RO: Rezolvarea problemelor pentru cursul Calitate si testare software

### A1 (A.Spital - problema 1)
**Design pattern = Builder**

Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de tipul pacient cu opțiuni extra.

### A3 (A.Spital - problema 3)
**Design pattern = Factory Method**

În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
nu fie necesare modificări în codul existent.

---
### D7 (D.Banca - problema 7)
**Design pattern = Facade**

Banca dorește simplificarea procesului de creare a unui cont. În momentul de față pentru crearea
unui cont un operator de la bancă trebuie să verifice vârsta persoanei, să verifice dacă este urmărit
de poliție sau dacă are creanțe la alte bănci. Să se realizeze un modul pentru simplificarea
procesului pentru operator.

### D9 (D.Banca - problema 9)
**Design pattern = Composite**

Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
mai multe agenții, iar o agenție deține mai multe filiale.

---
### E1 (E.Sportiv - problema 1)
**Design pattern = Simple Factory**

Se dorește implementarea unui modul care să inițializeze în cadrul aplicației obiecte din familia
de obiecte Jucator. Categoriile de jucători existente sunt salvate într-un enum {Portar, Fundas,
Atacant}. Să se implementeze acest modul care va crea obiecte din familia Jucator.

### E4 (E.Sportiv - problema 4)
**Design pattern = Prototype**

Firma de vânzare bilete dorește să implementeze un modul în cadrul aplicației, astfel încât dacă
un client a mai cumpărat bilete și revine pentru a fi cumpăra un nou bilet să nu fie necesară
reconstruirea unui cont respectivului client, deoarece prin construire clientului durează foarte mult. Să se implementeze modul care permite copierea datelor despre un client dintr-o instanță deja
existentă.

### E5 (E.Sportiv - problema 5)
**Design pattern = Adapter**

Firma de vânzare bilete deține o aplicație pentru rezervarea de bilete și pentru vinderea de bilete
la meciuri. Firma dorește să vândă bilete prin intermediul platformei de vânzare bilete: eBilet.ro,
însă dezvoltatorii platformei spun că au interfețe pentru obiectele cu care lucrează acea platformă
și trebuie creat un nivel intermediar pentru clasele existente în aplicația companiei, astfel încât,
platforma să poată lucra cu obiecte furnizate de aplicația existentă.

### E8 (E.Sportiv - problema 8)
**Design pattern = Proxy**

Pentru un meci de fotbal se ia decizia ca biletele sa fie vândute doar pentru persoanele care au
minim 14 ani. Sa se implementeze un modul intermediar pentru clasa VanzareBilet prin care
vânzarea de bilete sa fie condiționată de vârsta clientului.

---
### F7 (F.Companie de transport in comun STB - problema 7)
**Design pattern = Decorator**

Compania doreste ca modulul de printare al biletelor sa permita cu ocazia anumitor zile nationale
sa printeze pe bilet un mesaj de "La multi ani". Se doreste implementarea acestui modul care sa
adauge functionalitatea de printare mesaj customizat. Exista posibilitatea ca aceasta functionalitate
sa nu fie folosita, si din acest motiv se doreste sa fie optionala, fara modificarea codului existent.

### F13 (F.Companie de transport in comun STB - problema 13)
**Design pattern = Memento**

Pentru fiecare Autobuz se solicita salvarea acestora in memorie pentru posibilitatea de a reveni
la o forma anterioara a obiectului respectiv. Se doreste implementarea unui modul care sa asigure
aceasta salvare cu consum optim de memorie in conditiile in care este cunoscut faptul ca atributele
care se vor modifica cu o frecventa mai mare sunt cele legate de soferul care il conduce, consumul
mediu, etc. Celelalte atribute precum model, an fabricatie, numar locuri nu se vor modifca frecvent.
