package com.company;

public abstract class Player implements Namable{

    private final int level;
    private int life;
    private int strength;
    private int agility;
    private final int intelligence;
    private final int fullLife;

    protected Player(int level, int life, int strength, int agility, int intelligence, int fullLife) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.fullLife = fullLife;
    }


    abstract void choiceOfAttack();

    abstract int getSimpleAttackDamage();

    abstract int SpecialCharacteristicsChange();

    abstract int getSpecialAttack();

    public int getLevel() {

        return level;
    }
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }
        public void setAgility(int agility) {
            this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getFullLife() {
        return fullLife;
    }
}
