package org.example;

public class Dwarf extends Character {
    private int miningResistance;

    public Dwarf(String name, int age, int healthLevel, String mainWeapon, int miningResistance) {
        super(name, age, healthLevel, mainWeapon);
        this.miningResistance = miningResistance;
    }

    public int getMiningResistance() { return miningResistance; }
    public void setMiningResistance(int miningResistance) { this.miningResistance = miningResistance; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Resistencia a la Minería: " + miningResistance);
    }
}
