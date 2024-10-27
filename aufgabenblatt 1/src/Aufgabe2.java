/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {
  public static void teilA(String input) {
    int i = 0;
    while (i < input.length()) {
      char c = input.charAt(i);
      char cInLower = Character.toLowerCase(c);
      if (cInLower == 'a' || cInLower == 'e' || cInLower == 'i' || cInLower == 'o' || cInLower == 'u')
        System.out.print("-" + c);
      else
        System.out.print(c);

      i++;
    }

    System.out.println();
  }

  public static void teilB(String input) {
    int i = 0;

    String output = "";
    while (i < input.length()) {
      char c = input.charAt(i);
      char cInLower = Character.toLowerCase(c);
      boolean isPrinted = true;

      for (char j = 'a'; j <= 'j'; j++) {
        if (cInLower == j)
          isPrinted = false;
      }

      if (c == ' ')
        isPrinted = false;

      if (isPrinted)
        output += c;

      i++;
    }

    System.out.println(output);
  }

  public static void main(String[] args) {

    String first = "Eine nennenswerte und geeignete Sprache.";
    String second = "Anzahl der Zeichen ist nicht genug!";

    teilA(first);
    teilA(second);

    teilB(first);
    teilB(second);

    // Teil C
    int i = 35;
    boolean isFirst = true;
    while (i < 175) {
      if (i % 5 == 0 && i % 7 == 0) {
        if (isFirst) {
          isFirst = false;
        } else
          System.out.print(' ');

        System.out.print(i);
      }

      i++;
    }

    System.out.println();
  }
}
