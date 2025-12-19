/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ctour
 */
public class Piece {
    public enum Type {
        MASTER, STUDENT
    }

    private Type type;
    private boolean isRed;

    public Piece(Type type, boolean isRed) {
        this.type = type;
        this.isRed = isRed;
    }

    public Type getType() {
        return type;
    }

    public boolean isRed() {
        return isRed;
    }
    
}
