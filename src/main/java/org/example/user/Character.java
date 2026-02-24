package org.example;

public class Character {
    private String name;
    private int age;
    private int healthLevel;
    private String mainWeapon;

    public Character(String name, int age, int healthLevel, String mainWeapon) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.mainWeapon = mainWeapon;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getHealthLevel() { return healthLevel; }
    public void setHealthLevel(int healthLevel) { this.healthLevel = healthLevel; }

    public String getMainWeapon() { return mainWeapon; }
    public void setMainWeapon(String mainWeapon) { this.mainWeapon = mainWeapon; }

    public void showDetails() {
        System.out.println("--- Detalles del Personaje ---");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Nivel de Salud: " + healthLevel);
        System.out.println("Arma Principal: " + mainWeapon);
    }
}