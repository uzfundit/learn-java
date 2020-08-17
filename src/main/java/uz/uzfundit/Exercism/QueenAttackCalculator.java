package uz.uzfundit.Exercism;

public class QueenAttackCalculator {
    private final Queen queen1;
    private final Queen queen2;

    QueenAttackCalculator(Queen queen1, Queen queen2) {
        if(queen1 == null || queen2 == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        } else if(queen1.equals(queen2)) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        } else {
            this.queen1 = queen1;
            this.queen2 = queen2;
        }
    }

    boolean canQueensAttackOneAnother() {
        return queen1.getRow() == queen2.getRow() ||  // Queens in same row
                queen1.getColumn() == queen2.getColumn() ||  // Queens in same column
                // Queens in same diagonal
                (queen1.getRow() - queen1.getColumn()) == (queen2.getRow() - queen2.getColumn()) ||
                (queen1.getRow() + queen1.getColumn()) == (queen2.getRow() + queen2.getColumn());
    }
}

class Queen {

    private final int row;
    private final int column;

    Queen(int row, int column) {
        if(row >= 0) {
            if(row < 8) {
                this.row = row;
            } else {
                throw new IllegalArgumentException("Queen position must have row <= 7.");
            }
        } else {
            throw new IllegalArgumentException("Queen position must have positive row.");
        }

        if(column >= 0) {
            if(column < 8) {
                this.column = column;
            } else {
                throw new IllegalArgumentException("Queen position must have column <= 7.");
            }
        } else {
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
    }

    @Override
    public boolean equals(Object queen) {
        Queen q = (Queen) queen;
        return this.row == q.getRow() && this.column == q.getColumn();
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
