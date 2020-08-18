package uz.uzfundIT.Exercism;
public class QueenAttackCalculator {
    private final Queen whiteQueen;
    private final Queen blackQueen;

    QueenAttackCalculator(Queen whiteQueen, Queen blackQueen) {
        if(whiteQueen == null || blackQueen == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        } else if(whiteQueen.equals(blackQueen)) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        } else {
            this.whiteQueen = whiteQueen;
            this.blackQueen = blackQueen;
        }
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
        this.row = row;
        this.column = column;
        positionRow(row);
        positionColumn(column);
    }

    private void positionRow(int row) {
        if(row < 0)
            throw new IllegalArgumentException("Queen position must have positive row.");
        else if (row > 7)
            throw new IllegalArgumentException("Queen position must have row <= 7.");
    }

    private void positionColumn(int column) {
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
        Queen q = (Queen) queen;
        return this.row == q.getRow() && this.column == q.getColumn();
    }
}