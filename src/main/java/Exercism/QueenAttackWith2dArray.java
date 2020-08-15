package Exercism;

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
        if (i >= 0) {
            if (i < 8) {
                this.row = i;
            } else {
                throw new IllegalArgumentException("Queen position must have row <= 7.");
            }
        } else {
            throw new IllegalArgumentException("Queen position must have positive row.");
        }

        if (j >= 0) {
            if (j < 8) {
                this.column = j;
            } else {
                throw new IllegalArgumentException("Queen position must have column <= 7.");
            }
        } else {
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}