package com.company;

public class Warrior extends Player{


    public static String getName;

    protected Warrior(int level, int life, int strength, int agility, int intelligence, int fullLife) {
        super(level, life, strength, agility, intelligence, fullLife);
    }

    @Override
    public String getName() {

        return getName = "Guerrier";
    }

    @Override
    public void choiceOfAttack() {
        System.out.println("- [TAPEZ 1] - ATTAQUE BASIQUE : <===||= coup d'Epée =||===> ");
        System.out.println("- Coup d'épée tranchant égale à votre force sur l’adversaire.");
        System.out.println();

        System.out.println("- [TAPEZ 2] - ATTAQUE SPECIALE : < coup de Rage > (•́へ•́ ╬) ");
        System.out.println("- Effectue des dommages égaux à deux fois votre force sur l’adversaire. ");
        System.out.println("  Par contre votre attaque perd de la vitalité et votre et force divisée par 2.");
        System.out.println();
    }

    @Override
    int getSimpleAttackDamage() {

        System.out.println("( ง °皿°)ง⁼³₌₃ =||===> ");
        System.out.println();
        System.out.println("Vous avez asséné une puissante attaque à l'adversaire " +
                "qui à subi " + getStrength() + " point de dégât !!!");
        System.out.println();
        return getStrength();
    }

    @Override
    int SpecialCharacteristicsChange() {

            System.out.println("Par contre vous avez perdu en vitalité, Votre force à diminuez de "
                    + getStrength() / 4 + " point");
            System.out.println();
            setStrength(getStrength()/4);

            return getStrength();

    }
    @Override
    int getSpecialAttack() {

        System.out.println("(╯╬°Д°)╯︵ ┻━┻  (~%?…;# *’☆&℃$︿★? 乱码) => ( ง ╬°皿°)ง⁼³₌₃ ");
        System.out.println();
        System.out.println("Vous avez déployé votre Rage sur l'adversaire qui à multiplié par 2" +
                " les dégat subi qui sont de " + getStrength()*2 + " point !!!");
        setStrength(getStrength()*2);
        System.out.println();
        return getStrength();
    }
}
    
