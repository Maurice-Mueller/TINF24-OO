package de.dhbw.tinf24.einführung;

public class Kunde {

  public Kunde() {
    super();
  }

  public void ausleihen(Fahrzeug fahrzeug){
    System.out.println("K1: Ich habe ein Fahrzeug ausgeliehen!");
  }

  public void ausleihen(Auto auto){
    System.out.println("K2: Ich bevorzuge Autos!");
  }

  public void ausleihen(Fahrrad fahrrad){
    System.out.println("K3: Ich bevorzuge Fahrräder!");
  }
}
