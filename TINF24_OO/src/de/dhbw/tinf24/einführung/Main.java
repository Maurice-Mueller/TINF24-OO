package de.dhbw.tinf24.einführung;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static void main() {
    Auto auto = new Auto();
    Fahrzeug fahrrad = new Fahrrad();
    Fahrzeug fahrzeug22 = new Fahrzeug();

    auto.fahren();
    fahrrad.fahren();

    //Fahrzeug[] garage = {auto, fahrrad};
//    Fahrzeug[] garage = new Fahrzeug[2];
//    garage[0] = auto;
//    garage[1] = fahrrad;

    List<Fahrzeug> garage = new ArrayList<>();
    garage.add(auto);
    garage.add(fahrrad);


//    Fahrrad.fahren(fahrrad);

    for (Fahrzeug fahrzeug : garage) {
      switch (fahrzeug.getClass().getSimpleName()) {
        case "Auto":
          System.out.println("Auto");
          break;
        case "Fahrrad":
          System.out.println("Fahrrad");
          break;
        default:
          System.out.println("Unbekanntes Fahrzeug");
          break;
      }
      fahrzeug.fahren();
    }
//    garage.forEach(Fahrzeug::fahren);
//    garage.forEach(fahrzeug -> fahrzeug.fahren());
//    garage.forEach((Fahrzeug fahrzeug) -> fahrzeug.fahren());
    System.out.println("++++++++++++");
    auto.fahren();

    System.out.println("++++++++++++");
    Kunde kunde = new Kunde();
    kunde.ausleihen((Fahrzeug)auto);
    kunde.ausleihen(auto);
    kunde.ausleihen(fahrrad);



  }
}
