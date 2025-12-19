/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ctour
 */
public class MoveAction {
    int fromRow, fromCol;
    int toRow, toCol;
    Card card;

    MoveAction(int fr, int fc, int tr, int tc, Card card) {
        this.fromRow = fr;
        this.fromCol = fc;
        this.toRow = tr;
        this.toCol = tc;
        this.card = card;
    }
    
}
