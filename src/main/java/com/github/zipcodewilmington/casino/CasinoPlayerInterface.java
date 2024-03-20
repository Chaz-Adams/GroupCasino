package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * All players of a game should abide by `CasinoPlayerInterface`.
 * All players must have reference to the `ArcadeAccount` used to log into the `Arcade` system.
 * All players are capable of `play`ing a game.
 */
public interface CasinoPlayerInterface {
    /**
     * @return the `ArcadeAccount` used to log into the `Arcade` system to play this game
     */
    CasinoAccount getArcadeAccount();

    /**
     * Defines how a specific implementation of `CasinoPlayerInterface` plays their respective game.
     * @param <SomeReturnType> specify any return type you would like here
     * @return whatever return value you would like
     */
    <SomeReturnType> SomeReturnType play();
}