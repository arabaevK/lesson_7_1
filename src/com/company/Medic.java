package com.company;

public class Medic extends Hero {
    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Medic(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void increase_experience(){
        int point = this.healthPoint / 10;
        this.healthPoint += point;
    }
    @Override
    public void applySuperAbilty() {
        System.out.println("Healthing"+" " + healthPoint);
    }




}
