package de.dhbw.tinf24.einführung;

public class Fahrzeug {

  public Fahrzeug() {
    super();
  }

  public void fahren(/*Fahrzeug this*/) {
    System.out.println("A1: Ich fahre.");
//    this.fahren();
  }


  public static void fahren(Fahrzeug fahrrad){
    System.out.println("Wie komme ich hierhin?");
  }
}
