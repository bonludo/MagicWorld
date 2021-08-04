package com.company;

import java.util.Scanner;

public class Game {

    static Scanner in = new Scanner(System.in);

    public void launchGame(Player playerOne, Player playerTwo) {
        String playerOneName = "JOUEUR 1 ", playerTwoName = "JOUEUR 2 ";


        int turnToPlay = 0;

        while (playerOne.getLife() > 0 && playerTwo.getLife() > 0) {
            turnToPlay = turnToPlay % 2;
            System.out.println();

            if (turnToPlay == 0) {
                playerToPlay(playerOne, playerTwo, playerOneName);

                turnToPlay++;

                if (playerTwo.getLife() <= 0) {
                    break;
                }

            } else {
                playerToPlay(playerTwo, playerOne, playerTwoName);
                turnToPlay++;
                if (playerOne.getLife() <= 0) {
                    break;
                }
            }
        }
        if (playerOne.getLife() > playerTwo.getLife()) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("~~~~~~ LE JOUEUR 1 A GAGNER ~~~~~~");
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("  ヾ(￣▽￣)Bye~Bye~     ○|￣|_     ");
            System.out.println("                    (T＿T)");
        } else {
            System.out.println("----------------------------------");
            System.out.println("~~~~~~ LE JOUEUR 2 A GAGNER ~~~~~~");
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("  ○|￣|_    （︶︿︶）Iam~the~Best  ");
            System.out.println("-٩(✘д✘๑;)۶");
        }
    }

    private void playerToPlay(Player playerOne, Player playerTwo, String playerOneName) {
        System.out.println("===== " + playerOneName + " A TOI DE JOUER =====");
        System.out.println();
        System.out.println();
        System.out.println("===== " + playerOne.getName() + " ========");
        System.out.println();
        System.out.println("| Niveau : " + playerOne.getLevel());
        System.out.println("| Vie : " + playerOne.getLife());
        System.out.println("| Force: " + playerOne.getStrength());
        System.out.println("| Agilité : " + playerOne.getAgility());
        System.out.println("| Intelligence : " + playerOne.getIntelligence());
        System.out.println("========================");
        System.out.println();

        playerOne.choiceOfAttack();
        int x = in.nextInt();

        if (x == 1) {
            int normalAttackDamage = playerOne.getSimpleAttackDamage();

            playerTwo.setLife(playerTwo.getLife() - normalAttackDamage);

            System.out.println("la vie du Joueur Adverse est maintenant de " + playerTwo.getLife());

        } else if (x == 2) {
            playerTwo.setLife(playerTwo.getLife() - playerOne.getSpecialAttack());

            playerOne.SpecialCharacteristicsChange();

            System.out.println("la vie du Joueur Adverse est de " + playerTwo.getLife());

        }
    }
}
