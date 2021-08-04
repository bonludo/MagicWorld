package com.company;

public class Prowler extends Player  {


    public static String getName;

    protected Prowler(int level, int life, int strength, int agility, int intelligence, int fullLife) {
        super(level, life, strength, agility, intelligence, fullLife);


    }



    @Override
    public void choiceOfAttack() {
        System.out.println("- [TAPEZ 1] - ATTAQUE BASIQUE : <<=={{ Tir à l’Arc }}==>> ");
        System.out.println("- Fleche perçante dont les dégâts sont égaux à votre agilité sur l’adversaire.");
        System.out.println();

        System.out.println("- [TAPEZ 2] - TECHNIQUE SPECIALE : ((( Concentration （︶︿︶）)))");
        System.out.println(" - Vous gagner votre niveau divisé par 2 en agilité");
        System.out.println();

    }

    @Override
    int getSimpleAttackDamage() {

        System.out.println("(▔ ,▔)ㄏ }}==>> }}==>> }}==>> }}==>> (ㄒoㄒ)");
        System.out.println();
        System.out.println("Une pluie de flèche à transpercer l'adversaire " +
                "qui à subi " + getAgility() + " point de dégât !!!");
        System.out.println();

        return getAgility();
    }

    @Override
    int SpecialCharacteristicsChange() {

        setAgility(getAgility()+(getLevel()/2));

        System.out.println();
        System.out.println("╮(￣⊿￣)╭");
        System.out.println();
        System.out.println("(-_-) zzz");
        System.out.println("Votre agilité a augmenté de " +getLevel()/2+" point" );
        System.out.println();
        return getAgility();

    }

    @Override
    int getSpecialAttack() {
        return 0;
    }

    @Override
    public String getName() {
        return getName = "Rodeur";
    }

}
