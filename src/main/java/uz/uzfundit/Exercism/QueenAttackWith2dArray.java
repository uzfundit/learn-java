package uz.uzfundit.Exercism;

import java.util.Objects;

public class QueenAttackWith2dArray {
    private final int[][] chess = new int[8][8];

    public QueenAttackWith2dArray(Queens whiteQueen, Queens blackQueen) {
        if(whiteQueen == null || blackQueen == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        else if(whiteQueen.getRow() == blackQueen.getRow() && whiteQueen.getColumn() == blackQueen.getColumn())
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        this.chess[whiteQueen.getRow()][whiteQueen.getColumn()] = 1;
        this.chess[blackQueen.getRow()][blackQueen.getColumn()] = 1;
    }

    public boolean canQueensAttackOneAnother() {
        int firstRow = 0;
        int firstColumn = 0;
        int secondRow = 0;
        int secondColumn = 0;
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if(chess[i][j] == 1){
                    if(firstRow == 0){
                        firstRow = i;
                        firstColumn = j;
                    }else {
                        secondRow = i;
                        secondColumn = j;
                    }
                }
            }
        }
        if(firstRow == secondRow || firstColumn == secondColumn )
            return true;
        int x = firstRow-1;
        int y = firstColumn-1;
        while (x>= 0 && y>=0 ){
            if(chess[x][y] == 1) return true;
            x = x -1;
            y = y - 1;
        }
        x = firstRow+1;
        y = firstColumn+1;
        while (x< chess.length && y<chess[0].length ){
            if(chess[x][y] == 1) return true;
            x = x +1;
            y = y + 1;
        }
        x = firstRow-1;
        y = firstColumn+1;
        while (x>= 0 && y<chess[0].length ){
            if(chess[x][y] == 1) return true;
            x = x -1;
            y = y + 1;
        }
        x = firstRow+1;
        y = firstColumn-1;
        while (x< chess[0].length && y>=0 ){
            if(chess[x][y] == 1) return true;
            x = x +1;
            y = y - 1;
        }
        return false;
    }
}

class Queens {
    private final int row;
    private final int column;

    public Queens(int i, int j) {
        checkPositionInRow(i);
        checkPositionInColumn(j);
        this.row = i;
        this.column = j;
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
        if (!(queen instanceof Queens)) return false;
        Queens q = (Queens) queen;
        return this.row == q.getRow() && this.column == q.getColumn();
    }

    @Override
    public int hashCode(){
        return Objects.hash(row,column);
    }
}