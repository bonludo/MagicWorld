package com.company;

public class Mage extends Player {

    public static String getName;

    protected Mage(int level, int life, int strength, int agility, int intelligence, int fullLife) {
        super(level, life, strength, agility, intelligence, fullLife);

    }


    @Override
    public void choiceOfAttack() {
        System.out.println("- [TAPEZ 1] - ATTAQUE BASIQUE : OOo Boule de Feu (づ ●─● )づoOO");
        System.out.println("-  Une boule de feu qui consume votre adversaire, " +
                "la puissance est égale a votre intelligence.");
        System.out.println();

        System.out.println("- [TAPEZ 2] - TECHNIQUE SPECIALE : +++ Soin +++");
        System.out.println("-  Pouvoir de soin qui régènere votre vie grace à votre intelligence x2.");
        System.out.println("   Attention, vous ne pouvez pas avoir plus de vie que vous en aviez au départ.");
        System.out.println();
    }

    @Override
    int getSimpleAttackDamage() {


        System.out.println("(づ ●─● )づoOOO00000");
        System.out.println();
        System.out.println("Vous avez enflammé l'adversaire " +
                "qui à subi " + getIntelligence() + " point de dégât !!! (@[]@!!)");
        System.out.println();

        return getIntelligence();
    }

    @Override
    int SpecialCharacteristicsChange() {
        if ((getLife() == getFullLife()) || (((getIntelligence()*2)+getLife())  > getFullLife())){
            System.out.println("o((⊙﹏⊙))o  ~%?…;# *’☆&℃$︿★? 乱码");
            System.out.println("ECHEC : La technique à échoué votre vie est égale " +
                    "ou supérieur lors du soin à votre vie de départ");
        }else {
            System.out.println("++++++++ㄟ（●─●）ㄏ+++++++");
            System.out.println("Vous avez utilisez le sort de soin, vous avez récupéré "
                    + getIntelligence()*2 +" de point vie") ;
            setLife(getIntelligence()*2+getLife());
            return getLife();

        }
        return 0;
    }

    @Override
    int getSpecialAttack() {
        return 0;
    }

    @Override
    public String getName() {
        return getName= "Mage";
    }

}
