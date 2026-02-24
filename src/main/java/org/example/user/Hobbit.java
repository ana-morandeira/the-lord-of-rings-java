package org.example;

public class Hobbit extends Character {
    private int stealthSkill;

    public Hobbit(String name, int age, int healthLevel, String mainWeapon, int stealthSkill) {
        super(name, age, healthLevel, mainWeapon);
        this.stealthSkill = stealthSkill;
    }

    public int getStealthSkill() { return stealthSkill; }
    public void setStealthSkill(int stealthSkill) { this.stealthSkill = stealthSkill; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Habilidad de Sigilo: " + stealthSkill);
    }
}