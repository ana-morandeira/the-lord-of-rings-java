package org.example;

public class Human extends Character {
    private String kingdom;

    public Human(String name, int age, int healthLevel, String mainWeapon, String kingdom) {
        super(name, age, healthLevel, mainWeapon);
        this.kingdom = kingdom;
    }

    public String getKingdom() { return kingdom; }
    public void setKingdom(String kingdom) { this.kingdom = kingdom; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Reino: " + kingdom);
    }
}
