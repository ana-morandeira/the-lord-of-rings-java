import org.example.Character;

public class Elf extends Character {
    private String magicType;

    public Elf(String name, int age, int healthLevel, String mainWeapon, String magicType) {
        super(name, age, healthLevel, mainWeapon);
        this.magicType = magicType;
    }

    public String getMagicType() { return magicType; }
    public void setMagicType(String magicType) { this.magicType = magicType; }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Tipo de Magia: " + magicType);
    }
}
