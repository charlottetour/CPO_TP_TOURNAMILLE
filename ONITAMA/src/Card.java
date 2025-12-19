/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ctour
 */
import java.util.List;

public class Card {

    private String name;
    private List<Move> moves;

    public Card(String name, List<Move> moves) {
        this.name = name;
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public List<Move> getMoves() {
        return moves;
    }

}
