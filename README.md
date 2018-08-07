Zadania domowe przewidziane na okres 06.08 – 11. 08
Zadanie1)
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
