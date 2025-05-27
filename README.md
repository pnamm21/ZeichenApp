# ZeichenApp

Eine interaktive Java-Anwendung zum Zeichnen, Bearbeiten und Speichern von grafischen Elementen wie Linien, Ellipsen und Texten. Entwickelt mit Swing, Ant, XML und Mausinteraktionen.

## Features

- Zeichnen von Linien, Ellipsen und Texten
- Gruppierung und Verwaltung grafischer Objekte
- Einlesen von Bilddaten aus TXT- und XML-Dateien
- Speichern von Zeichnungen im XML-Format
- Unterstützung von Mausinteraktionen: Punkte ziehen, Objekte selektieren
- Dynamisches Erstellen neuer Objekte über Buttons
- Ant-Build-System für Kompilierung, JAR-Erstellung, Ausführen und JavaDoc

## Projektstruktur

```
src/
  main/
    java/             # Java-Quellcode
    resources/        # Bilddateien: bild.txt, bild.xml
  test/
    java/             # Testklassen
    resources/        # Testressourcen
```

## Voraussetzungen

- Java JDK 8 oder höher
- IntelliJ IDEA (empfohlen)
- Apache Ant

## Build & Run

### Kompilieren
```bash
ant compile
```

### Ausführen
```bash
ant run
```

### Erstellen eines JAR-Files
```bash
ant jar
```

### JavaDoc generieren
```bash
ant doc
```

### Projekt bereinigen
```bash
ant clean
```

## Bedienung

- Programmstart öffnet ein Fenster mit Zeichenbereich
- über Buttons können neue Linien erzeugt werden
- Objekte können mit der Maus verschoben werden
- Einlesen von Dateien erfolgt automatisch beim Start:
  - `bild.txt`
  - `bild.xml`

## Entwicklerhinweise

- Nutze die Klasse `Gruppe` zum dynamischen Einlesen der Zeichnungen
- Grafiken sind über die abstrakte Klasse `GrafikKomponente` organisiert
- Mausinteraktionen über `MouseListener` und `MouseMotionListener`
- Verwendung von JAXB für XML-Parsing

## Autor

Dieses Projekt basiert auf einer Anleitung von [BS1TS Bauer] und wurde im Rahmen einer Lernaufgabe erstellt.

---
