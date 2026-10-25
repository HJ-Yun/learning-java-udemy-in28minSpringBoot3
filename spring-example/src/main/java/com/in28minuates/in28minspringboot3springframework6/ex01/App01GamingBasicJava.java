package com.in28minuates.in28minspringboot3springframework6.ex01;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        // Chapter 1
//        var marioGame = new MarioGame();
//        var gameRunner = new GameRunner(marioGame);
//        gameRunner.run();

        // Chapter 2
//        var superContraGame = new SuperContraGame();
//        //if I want to change ex01 to superContraGame, I have to change GameRunner class to SuperContraGame
//        //Tight Coupling
//        var gameRunner = new GameRunner(superContraGame);
//        gameRunner.run();

        // Chapter 3
        // Loose Coupling with using Interface
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var packMan = new PackMan();

        // Object Creation + Wiring of Dependencies
        // marioGame, superContraGame, packMan are dependencies of GameRunner
        var gameRunner1 = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(packMan);

        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();



    }
}
