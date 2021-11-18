Aplikacja, która korzysta z danych wysłanych przez drugą aplikacje.
Aplikacja pobiera od użytkownika argumenty i typ, a następnie odbiera dane z API innej aplikacji i wyświetla, w odpowiednim formacie, uzyskane dane.

Scieżka wywolania aplikacji ma wygladac nastepująco: /nowy/argumenty/typ, gdzie "argumenty" to wybrane slowo, ktore chcemy policzyć, a "typ" to rodzaj w jakim chcemy odczytac wynik.
Przykładowe wywołanie: ..../nowy/Test123/json
Odpowiedź API: { "upperLetters": 1, "lowerLetters": 3, "numbers": 3, "specialCharacters": 0 }

Przykładowe wywołanie: ..../nowy/Test123/xml
Odpowiedź API: 1, 3, 3, 0,