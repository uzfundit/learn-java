package uz.uzfundIT.Exercism;

import java.util.Objects;

public class QueenAttackCalculator {
    private final Queen whiteQueen;
    private final Queen blackQueen;

    QueenAttackCalculator(Queen whiteQueen, Queen blackQueen) {
        checkQueen(whiteQueen, blackQueen);
        this.whiteQueen = whiteQueen;
        this.blackQueen = blackQueen;
    }

    private void checkQueen(Queen whiteQueen, Queen blackQueen){
        if (whiteQueen == null || blackQueen == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        else if (whiteQueen.equals(blackQueen))
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
    }

    private boolean areQueensInSameRow(){
        return whiteQueen.getRow() == blackQueen.getRow();
    }

    private boolean areQueensInSameColumn(){
        return whiteQueen.getColumn() == blackQueen.getColumn();
    }

    private boolean areQueensInSameDiagonal(){
        return (whiteQueen.getRow() - whiteQueen.getColumn()) == (blackQueen.getRow() - blackQueen.getColumn()) ||
                (whiteQueen.getRow() + whiteQueen.getColumn()) == (blackQueen.getRow() + blackQueen.getColumn());
    }

    boolean canQueensAttackOneAnother() {
        return areQueensInSameRow() || areQueensInSameColumn() || areQueensInSameDiagonal();
    }
}

class Queen {

    private final int row;
    private final int column;

    Queen(int row, int column) {
        checkPositionInRow(row);
        checkPositionInColumn(column);
        this.row = row;
        this.column = column;
    }

    private void checkPositionInRow(int row) {
        if(row < 0)
            throw new IllegalArgumentException("Queen position must have positive row.");
        else if (row > 7)
            throw new IllegalArgumentException("Queen position must have row <= 7.");
    }

    private void checkPositionInColumn(int column) {
        if(column < 0)
            throw new IllegalArgumentException("Queen position must have positive column.");
        else if (column > 7)
            throw new IllegalArgumentException("Queen position must have column <= 7.");
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object queen) {
        if (this == queen) return true;
        if (!(queen instanceof Queen)) return false;
        Queen q = (Queen) queen;
        return this.row == q.getRow() && this.column == q.getColumn();
    }

    @Override
    public int hashCode(){
        return Objects.hash(row,column);
    }

}