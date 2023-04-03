Ändringar:

- values > strings.xml
  - Från "hello" till "Some text"
    - Applikationens rubrik samt den centrerade texten i fönstret ändras i samband med förändringen.
      - Verkar som att innehållet är en referens till app_name som är strängen som ändrades.
      - 
- java > com.example.webviewapp > MainActivity.java
  - Lade till en knapp "btn_cute",
  - Lade till en textruta "countView",
  - Lade till en ToastClickListener (egen klass)
    - Vid knapptryck dyker två olika typer av texter upp i applikationen,
      - första texten kommer upp som en "Toast", en typ av notifikationsbubbla som sedan försvinner igen
      - den andra texten kommer upp permanent, varav siffran i texten går upp för varje knapptryckning
        - slutligen dyker även en text i console som signalerar att knappen har tryckts genom texten "Click!".