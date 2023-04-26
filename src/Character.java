public class Character {

    private String name;
    private CharacterType type;
    private int health;
    private int strength;
    private int defense;
    private int speed;

    public Character(String name, CharacterType type, int health, int strength, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
