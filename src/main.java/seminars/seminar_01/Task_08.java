package main.java.seminars.seminar_01;

/*
Используйте заготовку класса Hero и напишите следующие проверки для объекта Hero с использованием
assert:
1. Проверить, что герой создался с именем Emmett
2. Проверить, что значение прочности брони героя равно 50
3. Проверить, что у героя оружие типа sword
4. Проверить содержимое инвентаря героя (размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
5. Проверить, что герой это человек (свойство isHuman)
 */

import java.util.Arrays;
import java.util.List;

public class Task_08 {
    public static void main(String[] args) {
        checkingHero();
    }

    public static void checkingHero() {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        // записываем проверки при помощи assert
        assert "Emmett".equals(emmett.getName()) : "Name should be Emmett";
        assert 50 == emmett.getArmorStrength() : "Armor strength should be 50";
        assert "sword".equals(emmett.getWeapon()) : "Weapon should be sword";

        List<String> expectedBag = Arrays.asList("Bow", "Axe", "Gold");
        assert emmett.getBag().containsAll(expectedBag);
        assert expectedBag.containsAll(emmett.getBag()) : "Bag contents mismatch";
        assert emmett.isHuman() : "Should be Human";
    }
}

class Hero {
    private String name;
    private int armorStrength;
    private String weapon;
    private List<String> bag;
    private boolean isHuman;

    public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
        this.name = name;
        this.armorStrength = armorStrength;
        this.weapon = weapon;
        this.bag = bag;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }

    public int getArmorStrength() {
        return armorStrength;
    }

    public String getWeapon() {
        return weapon;
    }

    public List<String> getBag() {
        return bag;
    }

    public boolean isHuman() {
        return isHuman;
    }
}