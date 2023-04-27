package com.mycompany.factorybuilder;

public class App {

  public static void main(String[] args) {
    var knight = new Knight("Aragorn");
    System.out.println(knight.toString());

    var archer = new Archer("Legolas");
    System.out.println(archer.toString());
    
    var flagBearer = new FlagBearer("Frodo");
    System.out.println(flagBearer.toString());
  }
}
