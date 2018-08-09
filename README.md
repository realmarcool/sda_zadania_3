Zadania domowe przewidziane na okres 06.08 – 11. 08

ZADANIE 1

Zadanie będzie polegało na przygotowaniu aplikacji do wysyłki maili. W zadaniu należy
przygotować program do wysyłki maili. Co powinno się w nim znaleźć:
- Klasa abstrakcyjna, która będzie przechowywać podstawowe dane dotyczące
wysłania maila.
- Klasa, która będzie odpowiadała za maile tekstowe. Czyli musi mieć w sobie jakieś
pole gdzie będziemy mogli umieści tekst maila. Ta klasa ma dziedziczyć po klasie
abstrakcyjnej.
- Klasa, która będzie odpowiadała za przetwarzanie miali. W tej klasie chciałbym aby
była umieszczona metoda generyczna, która będzie przyjmować żądanie wysłania
maila pod warunkiem, że przekazany obiekt będzie dziedziczył po naszej klasie
abstrakcyjnej.
- Do klasy, która odpowiada za wysyłkę i przetwarzanie maili stwórzcie interfejs.
- Dane do wysyłki maili mają być na razie zczytywane z konsoli lecz przygotujcie to tak
abyśmy mogli podpiąć później kolejny interfejs. Czyli po uruchomieniu programu:
- użytkownik będzie mógł wybrać opcję “Wyślij e-mail”
- Tam będzie mógł wybrać typ mailu ( w naszym przypadku będzie to mail
tekstowy)
- Później użytkownik wprowadza wszystkie potrzebne dane niezbędne do
wysłania maila(tytuł, odbiorca/odbiorcy, i tekst, który ma znaleźć się w mailu)
- Zróbcie również weryfikacje czy podany e-mail jest poprawny(poszukajcie
metod, które na to pozwolą)
- Po wprowadzeniu uruchamiamy naszą metodę generyczną, która odpowiada
za wysyłania maili - na razie ma zostać tylko wyświetlony komunikat, że
e-mail został wysłany.
Aplikacja ma być tak zaprojektowana abyśmy mogli podpiąć każdy inny interfejs, który
będzie odpowiadał za zbieranie żądań wysyłki maili.
Ważne: Pamiętajcie, że na razie w zadaniu nie wymagam wysyłki maili.

ZADANIE 2

Zadanie polega na stworzeniu sieci komisów samochodowych. Powinny znaleźć się takie
klasy:
- Samochód, będzie klasą abstrakcyjną - zawierające podstawowe dane o samochodzie
- Komis - klasa opisująca dany komis: nazwa komisu, adres komisu, oraz lista wszystkich samochodów.
- Enum z modelami danej marki np. Audi będzie mieć modele: Q3, A7, Q5 itp.
- Klasę Audi, BMW, które będą dziedziczyć po klasie Samochód i będą posiadać pole typu Enum danego modelu.

Do wykonania:
- Stwórzcie 20 obiektów różnych marek samochodów(oczywiście z różnymi modelami)
- Stwórzcie 2 obiekty klasy Komis i przydzielcie tym Komisom samochody, które wcześniej stworzyliście.(najlepiej aby samochody zostały dodane randomowo do Komisu)
- Stwórzcie listę, która będzie zawiera komisy. Dodajcie te 2 komisy do listy.
- Na podstawie powyższej listy stwórzcie Map, która będzie zawierała:
  - Jako klucz - nazwę marki samochodu
  - Jako dane - listę wszystkich samochodów, które są tej marki
  Przykład: Map<String, List<Samochod> map = new HashMap<>();
  
Klasa Komis została stworzona celowo aby utrudnić wam zadanie z tworzeniem Map ;)
