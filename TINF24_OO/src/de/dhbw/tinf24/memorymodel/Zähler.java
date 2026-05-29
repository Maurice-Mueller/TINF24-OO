package de.dhbw.tinf24.memorymodel;

public class Zähler {

  private int stand = 0; // data race

  public int stand() {
    return stand;
  }

  public void setzeAuf(int stand) {
    this.stand = stand;
  }
}
