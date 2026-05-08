package de.dhbw.tinf24.einführung;

import de.dhbw.tinf24.switchstatement.Geschwindigkeit;

public class Fahrrad extends Fahrzeug {

  public Fahrrad() {
    super();
  }

  private boolean dynamoAktiviert = false;

  @Override
  public void fahren() {
    System.out.println("A3: Ich bin sehr ökologisch.");
  }

  public void aktiviereDynamo(){
    if(dynamoAktiviert){
      return;
    }
    dynamoAktiviert = true;
    System.out.println("Dynamo aktiviert.");
  }

  public boolean istDynamoAktiviert() {
    return dynamoAktiviert;
  }

}
