public class SupportingCharacter extends Character {

    private String role;

    public SupportingCharacter(String name, CharacterType type, int health, int strength, int defense, int speed, String role) {
        super(name, type, health, strength, defense, speed);
        this.role = role;
    }

    // Геттер и сеттер для роли
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
