package org.example;

public class Orc extends Character {
    private int aggressionLevel;

    public Orc(String name, int age, int healthLevel, String mainWeapon, int aggressionLevel) {
        super(name, age, healthLevel, mainWeapon);
        this.aggressionLevel = aggressionLevel;
    }

    public int getAggressionLevel() { return aggressionLevel; }
    public void setAggressionLevel(int aggressionLevel) { this.aggressionLevel = aggressionLevel; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Nivel de Agresión: " + aggressionLevel);
    }
}Orc {

