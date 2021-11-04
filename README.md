Aplikacja, która korzysta z danych wysłanych przez drugą aplikacje.
Aplikacja pobiera od użytkownika typ, a następnie odbiera dane z API innej aplikacji i wyświetla, w odpowiednim formacie, uzyskane dane.

Przekazanie argumentu, a dokładniej typu (inaczej formatu) wyświetlenia danych, odbywa się poprzez podanie: /nowy/tutajtyp.
Wyróżniamy 4 typy.
1 - format tekstowy
2 - format json
3 - format xml
4 - format csv

Przykładowe wywołanie: ..../args/1
Odpowiedź API: upperLetters:2 lowerLetters:8 numbers:2 specialCharacters:2

Przykładowe wywołanie: ..../args/2
Odpowiedź API: {"upperLetters":"2",
"lowerLetters":"8",
"numbers":"2",
"specialCharacters":"2",
}