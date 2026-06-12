package de.dhbw.tinf24.memorymodel;

import java.util.concurrent.atomic.AtomicInteger;

public class Zähler {

  private int stand = 0; // data race

  public synchronized int stand() {
    return stand;
  }

  public synchronized int erhöheUmEinsUndGibAktuellenStandZurück(
      int limit,
      AtomicInteger anzahlDerInkrementierungen
  ) {
    if(stand < limit){
      stand++;
      anzahlDerInkrementierungen.incrementAndGet();
    }
    return stand;
  }

}
