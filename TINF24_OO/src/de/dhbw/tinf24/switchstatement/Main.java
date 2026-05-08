package de.dhbw.tinf24.switchstatement;

import de.dhbw.tinf24.einführung.Auto;
import de.dhbw.tinf24.einführung.Fahrrad;
import de.dhbw.tinf24.einführung.Fahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static void main() {
    Fahrrad fahrrad = new Fahrrad();
    Auto auto = new Auto();

    List<Fahrzeug> garage = new ArrayList<>();
    garage.add(auto);
    garage.add(fahrrad);
    garage.add(new Bus());

    for (Fahrzeug fahrzeug : garage) {
//      fahrzeug.fahren();

//      if(fahrzeug instanceof Fahrzeug){
//        System.out.println("Fahrzeug");
//      } else if (fahrzeug instanceof Auto) {
//        System.out.println("Auto");
//      } else if (fahrzeug instanceof Fahrrad) {
//        System.out.println("Fahrrad");
//      } else if (fahrzeug instanceof Bus) {
//        System.out.println("Bus");
//      } else {
//        System.out.println("Unbekanntes Fahrzeug");
//      }
      switch (fahrzeug) {
        case Auto autoMatch:
          autoMatch.starteMotor();
          break;
        case Fahrrad fahrradMatch when !fahrradMatch.istDynamoAktiviert():
//        case Fahrrad fahrradMatch:
//          fahrradMatch.dynamoAktiviert = true;
//          fahrradMatch.setDynamoAktiviert(true);
//          fahrradMatch.aktiviereDynamo();
          break;
        case Fahrzeug fahrzeugMatch:
          fahrzeugMatch.fahren();
          break;
      }
    }

    Truck truck = new Truck(1000, 2, 4, 2);
    //...

    Geschwindigkeit geschwindigkeit1 = new Geschwindigkeit(100);
    Geschwindigkeit geschwindigkeit2 = new Geschwindigkeit(100);

    if(geschwindigkeit1 == geschwindigkeit2){
      System.out.println("E1: Geschwindigkeit1 ist gleich Geschwindigkeit2");
    }
    if(geschwindigkeit1.equals(geschwindigkeit2)){
      System.out.println("E2: Geschwindigkeit1 ist gleich Geschwindigkeit2");
    }
  }

}
