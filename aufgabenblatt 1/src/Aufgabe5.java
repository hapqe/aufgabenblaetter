/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des CodeDraw-Fensters
*/

import codedraw.CodeDraw;
import codedraw.Palette;

import java.awt.*;

public class Aufgabe5 {

    public static void main(String[] args) {
        int n = 5;
        if (n % 2 == 0 || n > 19) {
            System.out.println("n muss ungerade und >= 20 sein!");
            return;
        }

        int pixelWidth = 500;
        int pixelHeight = 500;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);

        double sideLength = (double) pixelWidth / (double) n;

        myDrawObj.setLineWidth(4);
        myDrawObj.setColor(Color.RED);
        for (int i = 0; i < n - 1; i++) {
            myDrawObj.drawSquare(sideLength * i, 0, sideLength);
        }

        myDrawObj.setLineWidth(2);
        myDrawObj.setColor(Color.BLUE);
        for (int i = n / 2; i < n; i++) {
            myDrawObj.drawSquare(sideLength * i, pixelHeight - sideLength * (i + 1), sideLength);
        }

        myDrawObj.drawSquare(0, sideLength * (n - 1), sideLength);

        myDrawObj.setLineWidth(4);
        myDrawObj.setColor(Color.RED);
        for (int i = n / 2 + 1; i < n - 1; i++) {
            myDrawObj.drawSquare(sideLength * (n / 2), sideLength * i, sideLength);
        }

        for (int i = 1; i < n / 2 + 1; i++) {
            myDrawObj.drawSquare(sideLength * i, sideLength * (n - 1), sideLength);
        }


        myDrawObj.show();
    }
}
