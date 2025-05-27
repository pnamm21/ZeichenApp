# ✏️ ZeichenApp – Java-Zeichnen leicht gemacht

**ZeichenApp** ist eine grafische Java-Anwendung, mit der du Linien, Ellipsen und Texte zeichnen und bearbeiten kannst – ideal für Einsteiger in GUI-Programmierung und objektorientiertes Design mit Java.

---

## 🚀 Features

✅ Zeichnen von Linien, Ellipsen und Texten  
✅ Live-Vorschau im Fenster (mit `JFrame` und `JPanel`)  
✅ Objekte gruppieren und verwalten  
✅ TXT- und XML-Dateien einlesen  
✅ Speichern von Zeichnungen im XML-Format  
✅ Interaktive Maussteuerung zum Verschieben und Bearbeiten  
✅ Buttons zur Objekterstellung (Swing)  
✅ Ant-Build-System zur Automatisierung  
✅ JavaDoc-Erstellung für Dokumentation

---

## 🧱 Projektstruktur

```
zeichenapp/
├── src/
│   ├── main/java/         # Java-Quellcode
│   ├── main/resources/    # Ressourcendateien (z. B. bild.txt, bild.xml)
│   ├── test/java/         # Tests (optional)
│   └── test/resources/    # Testressourcen
├── build.xml              # Ant Build-Datei
└── .gitignore             # Git-Konfiguration
```

---

## ⚙️ Voraussetzungen

- Java JDK 8 oder höher
- IntelliJ IDEA oder andere IDE
- Apache Ant

---

## 📦 Build & Run mit Ant

```bash
ant compile     # Kompilieren
ant run         # Anwendung starten
ant jar         # Erzeuge JAR-Datei
ant doc         # Erzeuge JavaDoc
ant clean       # Löscht den Build-Ordner
```

---

## 💡 Bedienung

- Beim Start wird automatisch `bild.txt` oder `bild.xml` eingelesen
- Die grafischen Elemente erscheinen im Fenster
- Mit Maus kannst du Punkte oder Objekte verschieben
- Über Buttons kannst du neue Linien hinzufügen

---

## 📂 Datenformate

**TXT-Dateien:** Listen von Objekten mit Parametern  
Beispiel:
```
Linie 50 50 100 50
Ellipse 50 50 100 100
Text 45 20 Hallo
```

**XML-Dateien:** Mit JAXB importierbar/exportierbar  
Beispiel:
```xml
<gruppe>
  <linie x="50" y="50" x2="100" y2="50"/>
  <text x="45" y="20" text="Hallo"/>
</gruppe>
```

---

## 🧠 Lernziele & Konzepte

- Objektorientierung (Vererbung, Abstraktion)
- GUI-Entwicklung mit Swing
- Event Handling (Maus & Buttons)
- Arbeiten mit Listen & Dateien
- JAXB für XML-Verarbeitung
- Arbeiten mit Ant-Build-Prozessen

---

## 👨‍💻 Autor

Entwickelt im Rahmen eines Schulprojekts nach Anleitung von BS1TS Bauer.  
Betreut und erweitert durch [pnamm21](https://github.com/pnamm21)

---