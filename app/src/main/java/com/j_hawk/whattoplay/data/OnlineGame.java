package com.j_hawk.whattoplay.data;

/**
 * Created by martin on 10/27/2017.
 */

/**
 * OnlineGame.java
 * @author Kevin, Simon, Jian, Martin
 * @version 1.0
 * This class holds the shape for all games that are pulled from BoardGameGeek.com through search or import colletion.
 */
public class OnlineGame {

    private String name;
    private int id;
    private int year;

    /**
     * Constructor for an Game. Games will always be constructed this way.
     * @param id Integer ID of the game
     * @param name String name of the game
     * @param year Integer year the game was published
     */
    public OnlineGame(int id, String name, int year) {
        this.id=id;
        this.name =name;
        this.year = year;
    }

    /**
     * Getter for the OnlineGame id
     * @return Integer id
     */
    public int getId() {

        return id;
    }

    /**
     * Getter for the OnlineGame name
     * @return String name
     */
    public String getName() {
        return name;

    }

    /**
     * Getter for the OnlineGame year
     * @return Integer year
     */
    public int getYear() {
        return year;
    }

    /**
     * toString for the OnlineGame
     * @return String formatted String containing OnlineGame info for search results
     */
    @Override
    public String toString() {
        return name + "\n" + year;
    }
}
