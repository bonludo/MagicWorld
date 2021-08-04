package com.company;

class MagicWorld {


    public static void Introduction(String intro, String player) {

        System.out.println();
        System.out.println(intro + player + "choisis ton combattant : ");
        System.out.println();
        System.out.println("1. Guerrier" );
        System.out.println("2. Rodeur" );
        System.out.println("3. Mage" );
        System.out.println();

        System.out.println("Tapez le numéro du combattant : ");
//Introduction
    }


    public static void main(String[] args) {

        String intro1 = "Premier arrivé premier servi, ",
               intro2 = "Souvent, on dit qu'il faut garder le meilleur pour la fin, ";
        String playerOneName = "JOUEUR 1 ",
               playerTwoName = "JOUEUR 2 ";
        Player playerOne;
        Player playerTwo;


//  --------------------------------------------------------------------------------------------------------
//                                              MAGIC WORLD
//  --------------------------------------------------------------------------------------------------------
        System.out.println();

        System.out.println("BIENVENUE DANS MAGIC WORLD");
        System.out.println();

        Introduction(intro1, playerOneName);


//  --------------------------------------------------------------------------------------------------------
//                                              CREATE PLAYER 1
//  --------------------------------------------------------------------------------------------------------

        playerOne = PlayerConfig.getPlayer(playerOneName);

//  --------------------------------------------------------------------------------------------------------
//                                            END OF CREATION OF PLAYER 1
//  --------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println();

        System.out.println("===== "+playerTwoName+" C'est ton tour =====");
        System.out.println();

        Introduction(intro2, playerTwoName);

//  --------------------------------------------------------------------------------------------------------
//                                              CREATE PLAYER 2
//  --------------------------------------------------------------------------------------------------------

        playerTwo = PlayerConfig.getPlayer(playerTwoName);

//  --------------------------------------------------------------------------------------------------------
//                                            END OF CREATION OF PLAYER 2
//  --------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println();
        System.out.println("LES JOUEURS SONT PRET AU COMBAT");
        System.out.println();
        System.out.println();
        System.out.println("D'un coté nous avons le " + playerOne.getName() + " avec le " + playerOneName +
                " et de l'autre le " + playerTwo.getName() + " avec le  " + playerTwoName);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=||===> [OOo C'EST L'HEURE DU DUEL oOO] <<=={{");
        System.out.println();
        System.out.println("           (๑ŐдŐ)b    ☆    d(ŐдŐ๑)                 ");
        System.out.println();
        System.out.println();

//  --------------------------------------------------------------------------------------------------------
//                                              LAUNCHING THE GAME
//  --------------------------------------------------------------------------------------------------------

        Game firstGame = new Game();
        firstGame.launchGame(playerOne, playerTwo);
    }
}







