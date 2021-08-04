package com.company;


import java.util.Scanner;

class PlayerConfig {

    static Scanner in = new Scanner(System.in);

    static Player getPlayer
            (String playerOneName) {
        int fighterChoicePlayer;
        int level;
        int strentgh;
        int agility;
        int intelligence;
        Player playerOne;
        fighterChoicePlayer = in.nextInt();
// Le choix du combattant par son numéro

        System.out.println();

        while (fighterChoicePlayer <= 0 || fighterChoicePlayer > 3) {
            System.out.println("Il n'y a que 3 combattant,donc faire un choix entre 1 pour Guerrier, " +
                    "2 pour Rôdeur et 3 pour Mage et appuyez sur entrée: ");
            fighterChoicePlayer = in.nextInt();
//Si il n'a pas choisi un combattant entre 1,2 et 3, recommence la manip
        }
        System.out.println();

        System.out.println("Choissis ton |NIVEAU| (MAXIMUM jusqu'a 100) :");


        System.out.println();

        level = in.nextInt();

        int life = (level * 5);

        while (level > 100 || level <= 0) {

            System.out.println("Rentrez une valeur entre 0 et maximum 100");
            level = in.nextInt();
            life = (level * 5);
            System.out.println();
        }
        System.out.println("Vous ête au |NIVEAU| " + level );
        System.out.println("Vous avez " + life + " de |VIE|");
        System.out.println();

        System.out.println("Vous allez devoir choisir votre |FORCE|, votre |AGILITE| et votre |INTELLIGENCE|");
        System.out.println();

        System.out.println("ATTENTION !!!");
        System.out.println("Le total de ces 3 compétences ne doit pas dépasser votre |NIVEAU| qui est " + level);
        System.out.println();

        System.out.println("|FORCE (｀⌒´メ)| :");
        strentgh = in.nextInt();

        while
        (strentgh > level || strentgh < 0) {
            System.out.println("Rappel : le total de votre force + agilité + intelligence " +
                    "doit etre équivalent a votre niveau");

            System.out.println("Votre force dépasse votre niveau ou est inférieur à 0, " +
                    "choissisez a nouveau votre |FORCE| :");
            strentgh = in.nextInt();
        }
        System.out.println();
        System.out.println("Rappel : il vous reste " + (level - strentgh) +
                " point a depenser entre votre agilité et votre intelligence");

        System.out.println();
        System.out.println("|AGILITE (▔ ,▔) | :");
        agility = in.nextInt();

        while
        (strentgh + agility > level || agility < 0) {
            System.out.println("Votre force et votre agilité dépasse votre niveau ou l'agilité et inférieur à 0, " +
                    "choissisez a nouveau votre agilité :");
            agility = in.nextInt();
        }
        intelligence = level - agility - strentgh;
        System.out.println("Votre |INTELLIGENCE （●─●）| est de : ");
        System.out.println(intelligence);

        if (fighterChoicePlayer == 1) {
            playerOne = new Warrior(level, life, strentgh, agility, intelligence, life);
        } else if (fighterChoicePlayer == 2) {
            playerOne = new Prowler(level, life, strentgh, agility, intelligence, life);
        } else {
            playerOne = new Mage(level, life, strentgh, agility, intelligence, life);

        }

        System.out.println();
        System.out.println("===== "+playerOneName+" ========");
        System.out.println("          (｀⌒´メ)             ");
        System.out.println("Combattant : " + playerOne.getName());
        System.out.println("| Niveau : " + playerOne.getLevel());
        System.out.println("| Vie : " + playerOne.getLife());
        System.out.println("| Force: " + playerOne.getStrength());
        System.out.println("| Agilité : " + playerOne.getAgility());
        System.out.println("| Intelligence : " + playerOne.getIntelligence());
        System.out.println("========================");
        return playerOne;
    }
}







