package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        // Elfos
        characters.add(new Elf("Legolas", 2931, 100, "Arco de Galadhrim", "Luz Estelar"));
        characters.add(new Elf("Elrond", 6500, 95, "Hadhafang", "Sanación"));
        characters.add(new Elf("Galadriel", 8000, 99, "Anillo Nenya", "Clarividencia"));

        // Enanos
        characters.add(new Dwarf("Gimli", 139, 100, "Hacha Doble", 90));
        characters.add(new Dwarf("Thorin", 195, 85, "Orcrist", 95));
        characters.add(new Dwarf("Balin", 178, 70, "Maza Enana", 80));

        // Humanos
        characters.add(new Human("Aragorn", 87, 100, "Andúril", "Gondor"));
        characters.add(new Human("Boromir", 41, 90, "Espada de Gondor", "Gondor"));
        characters.add(new Human("Éomer", 28, 92, "Gúthwinë", "Rohan"));

        // Hobbits
        characters.add(new Hobbit("Frodo Bolsón", 50, 80, "Dardo", 95));
        characters.add(new Hobbit("Samwise Gamgee", 38, 85, "Espada de Túmulo", 90));
        characters.add(new Hobbit("Peregrin Took", 28, 75, "Espada de Oesternesse", 85));

        // Orcos
        characters.add(new Orc("Lurtz", 1, 100, "Arco Uruk-hai", 100));
        characters.add(new Orc("Azog", 200, 95, "Maza de Piedra", 98));
        characters.add(new Orc("Gothmog", 150, 80, "Mayal", 90));

        // Impresión con Polimorfismo
        for (Character c : characters) {
            c.showDetails();
            System.out.println("------------------------------");
        }
    }
}