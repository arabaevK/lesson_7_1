package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic(30);

        HavingSuperAbility[] Heroes = {magic, warrior, medic};
        for (HavingSuperAbility i : Heroes) {
            i.applySuperAbilty();
            medic.increase_experience();
        }

    }
}
