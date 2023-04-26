import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Создание персонажей
        Character frodo = new MainCharacter("Фродо Бэггинс", CharacterType.HOBBIT, 100, 10, 5, 15, "Хоббит");
        Character legolas = new MainCharacter("Леголас Гринлиф", CharacterType.ELF, 120, 15, 10, 20, "Эльф");
        Character aragorn = new MainCharacter("Арагорн Северный", CharacterType.HUMAN, 150, 20, 15, 18, "Человек");
        Character gimli = new MainCharacter("Гимли Глухонемой", CharacterType.DWARF, 130, 18, 12, 10, "Гном");
        Character sam = new SupportingCharacter("Сэм Гэмджи", CharacterType.HOBBIT, 80, 8, 4, 12, "Друг Фродо");

        // Создание коллекции персонажей
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(frodo);
        characters.add(legolas);
        characters.add(aragorn);
        characters.add(gimli);
        characters.add(sam);

        // Изменение статистики персонажей
        frodo.setHealth(90);
        legolas.setStrength(17);
        aragorn.setSpeed(22);
        ((SupportingCharacter) sam).setRole("Кузнец");

        // Вызов методов боевых способностей для главных героев
        ((MainCharacter) frodo).attack(aragorn);
        ((MainCharacter) legolas).defend();

        // Использование HashMap для хранения информации о персонажах по ключу
        HashMap<String, Character> characterMap = new HashMap<>();
        characterMap.put(frodo.getName(), frodo);
        characterMap.put(legolas.getName(), legolas);
        characterMap.put(aragorn.getName(), aragorn);
        characterMap.put(gimli.getName(), gimli);
        characterMap.put(sam.getName(), sam);

        // Вывод информации о всех персонажах с использованием перебора массива и foreach цикла
        System.out.println("Информация о персонажах:");
        for (int i = 0; i < characters.size(); i++) {
            System.out.printf("%d) %s, тип: %s, здоровье: %d, сила: %d, защита: %d, скорость: %d\n", i + 1, characters.get(i).getName(),
                    characters.get(i).getType(), characters.get(i).getHealth(), characters.get(i).getStrength(),
                    characters.get(i).getDefense(), characters.get(i).getSpeed());
        }

        for (Character character : characters) {
            System.out.printf("Персонаж %s, тип: %s, здоровье: %d, сила: %d, защита: %d, скорость: %d\n", character.getName(),
                    character.getType(), character.getHealth(), character.getStrength(),
                    character.getDefense(), character.getSpeed());
        }

        // Вывод информации о персонаже по ключу
        System.out.println("Информация о персонаже по ключу:");
        System.out.printf("%s, тип: %s, здоровье: %d, сила: %d, защита: %d, скорость: %d\n", characterMap.get("Фродо Бэггинс").getName(),
                characterMap.get("Фродо Бэггинс").getType(), characterMap.get("Фродо Бэггинс").getHealth(), characterMap.get("Фродо Бэггинс").getStrength(),
                characterMap.get("Фродо Бэггинс").getDefense(), characterMap.get("Фродо Бэггинс").getSpeed());
    }
}