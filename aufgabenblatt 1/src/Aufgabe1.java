/*
    Aufgabe 1) for-Schleifen
*/
public class Aufgabe1 {

  public static void main(String[] args) {
    // Aufgabenteil a)
    int sum = 0;
    for (int i = 21; i < 420; i++) {
      if (i % 21 == 0)
        sum += i;
    }
    System.out.println(sum);

    // Aufgabenteil b)

    System.out.print(":");

    for (int i = 45; i <= 135; i++) {
      if (i % 5 == 0 && !(i % 9 == 0)) {
        System.out.print(i + ":");
      }
    }

    System.out.println();

    // Aufgabenteil c)

    for (int i = 70; i > 50; i--) {
      if (i != 70) {
        System.out.print(",");
      }
      System.out.print((char) i);
    }

    System.out.println();

    // Aufgabenteil d)

    String input = "Zehn zahme Ziegen zogen ziemlich z ̈ugig zehn Zentner Zucker zum Zoo!";

    sum = 0;
    for (int i = 0; i < input.length() - 1; i++) {
      char c = input.charAt(i);
      if (Character.toLowerCase(c) == 'z')
        sum++;
    }

    System.out.println(sum);
  }
}
