/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/

public class Aufgabe3 {
  static final double dt = 1;

  public static void main(String[] args) {
    double maxCap = 1500;
    double numFoxes = 2;
    double numRabbits = 2500;
    double freeCap = 0; // calcualted inside the loop
    double decFoxes = 0; // calcualted inside the loop
    double incRabbits = 0; // calcualted inside the loop
    double numContacts = 5000;

    for (int i = 0; i < 500; i++) {
      freeCap = maxCap - numRabbits;
      incRabbits = (1.0 / maxCap) * freeCap * 0.08 * numRabbits;
      decFoxes = 0.2 * numFoxes;
      numContacts = numRabbits * numFoxes;
      numRabbits = numRabbits + dt * (incRabbits - 0.002 * numContacts);
      numFoxes = numFoxes + dt * (0.0004 * numContacts - decFoxes);

      System.out.printf("Iteration %d: freecap: %.2f numRabbits: %.2f numFoxes: %.2f\n", i + 1, freeCap, numRabbits,
          numFoxes);

      long nPrintedRabbits = Math.round(numRabbits * (500.0 / 2500.0));
      System.out.println(nPrintedRabbits);
      for (int j = 0; j < nPrintedRabbits; j++) {
        System.out.print('*');
      }

      long nPrintedFoxes = Math.round(numFoxes * (500.0 / 200.0));
      System.out.println();
      for (int j = 0; j < nPrintedFoxes; j++) {
        System.out.print('#');
      }
      System.out.println();

      System.out.println();
    }
  }
}
