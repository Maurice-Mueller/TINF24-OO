package de.dhbw.tinf24.switchstatement;

import de.dhbw.tinf24.einführung.Fahrzeug;

public class Bus extends Fahrzeug {

  @Override
  public void fahren() {
    System.out.println("B1: Ich fahre langsam.");
  }
}
