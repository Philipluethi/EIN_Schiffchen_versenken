package Schiffeversenken;

import java.util.Random;

public class Feld {

    private char[][] spielfeld;

    // Methode zur Erstellung des Spielfelds
    public void erstelleFeld() {
        this.spielfeld = new char[5][5];  // Initialisiere das Spielfeld als 5x5 Matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                spielfeld[i][j] = '-';  // Fülle das Spielfeld mit '-'
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Methode zum Setzen von Schiffen auf das Spielfeld
    public char[][] schiffeSetzen() {
        char[][] PlatziertesFeld = erstelleFeld(); // Hier wird das Spielfeld erstellt und zurückgegeben, was nicht korrekt ist
        Random rand = new Random();
        for (int y = 0; y < 1; y++) {
            int randomRow = rand.nextInt(4); // Zufällige Zeile
            int randomSpalte = rand.nextInt(2); // Zufällige Spalte (es sieht aus, als ob es nur bis 2 gehen soll)
            for (int j = randomSpalte, i = 0; i <= 2; i++) {
                PlatziertesFeld[j][i] = 'S'; // Setze 'S' für Schiff in aufeinanderfolgende Felder
            }
        }
        return PlatziertesFeld;  // Rückgabe des platzierten Schiffs
    }

    // Diese Methode ist unvollständig und nicht korrekt
    public void setzeSchuss(int x, int y) {  // Parameter sollten mit Typen deklariert werden
        // Logik zum Setzen eines Schusses könnte hier folgen
    }

    // Methode zur Ausgabe des Spielfeldes
    public static void printFeld(char[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j] + " ");  // Ausgabe jedes Feldes
            }
            System.out.println();  // Neue Zeile nach jeder Zeile des Spielfeldes
        }
    }
}