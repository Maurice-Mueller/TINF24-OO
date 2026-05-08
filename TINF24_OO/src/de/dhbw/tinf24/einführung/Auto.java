package de.dhbw.tinf24.einführung;

public class Auto extends Fahrzeug {

  public Auto() {
    super();
  }

  public void starteMotor(){
    System.out.println("Motor läuft.");
  }

  @Override
  public void fahren() {
    System.out.println("A2: Ich fahre am schnellsten.");
  }
}
