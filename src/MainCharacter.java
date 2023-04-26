public class MainCharacter extends Character implements BattleAbility {

    private String race;

    public MainCharacter(String name, CharacterType type, int health, int strength, int defense, int speed, String race) {
        super(name, type, health, strength, defense, speed);
        this.race = race;
    }

    // Геттер и сеттер для расы
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Методы для реализации боевых способностей интерфейса BattleAbility
    @Override
    public void attack(Character character) {
        int damage = this.getStrength() - character.getDefense();
        if (damage < 0) {
            damage = 0;
        }
        character.setHealth(character.getHealth() - damage);
        System.out.printf("%s атаковал %s и нанёс урон %d ед. здоровья\n", this.getName(), character.getName(), damage);
    }

    @Override
    public void defend() {
        System.out.printf("%s защищается от ударов противника\n", this.getName());
    }
}
