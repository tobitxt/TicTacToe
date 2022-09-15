package com.example.TicTacToe;

public class TicTacToeApplication {

    public int resultChecker(int[][] table) {

        int returnValue = -1;

        if (checkTableValidity(table))
            throw new IllegalArgumentException("Illegal table");

        returnValue = horizontalWin(table);
        if (hasReturnValueChanged(returnValue))
            return returnValue;

        returnValue = verticalWin(table);
        if (hasReturnValueChanged(returnValue))
            return returnValue;

        returnValue = diagonalWin(table);
        if (hasReturnValueChanged(returnValue))
            return returnValue;

        return draw(table);

    }

    private boolean hasReturnValueChanged(int returnValue) {
        return (returnValue != -1);
    }

    private boolean checkTableValidity(int[][] table) {
        return (table.length != 3 || table[0].length != 3 || table[1].length != 3 || table[2].length != 3);
    }

    private int horizontalWin(int[][] table) {

        int returnValue = -1;

        for (int i = 0; i < table.length; i++) {
            int inputPlayer = table[i][0];
            if (inputPlayer > 0) {
                if (table[i][0] == inputPlayer & table[i][1] == inputPlayer & table[i][2] == inputPlayer) {
                    returnValue = inputPlayer;
                }
            }
        }
        return returnValue;
    }

    private int verticalWin(int[][] table) {

        int returnValue = -1;

        for (int i = 0; i < table.length; i++) {
            int inputPlayer = table[0][i];
            if (inputPlayer > 0) {
                if (table[0][i] == inputPlayer & table[1][i] == inputPlayer & table[2][i] == inputPlayer) {
                    returnValue = inputPlayer;
                }
            }
        }
        return returnValue;
    }

    private int diagonalWin(int[][] table) {

        int returnValue = -1;

        if (table[0][0] > 0) {
            int inputPlayer1 = table[0][0];
            if (table[0][0] == inputPlayer1 & table[1][1] == inputPlayer1 & table[2][2] == inputPlayer1) {
                returnValue = inputPlayer1;
            }}
        if (table[2][0] > 0) {
            int inputPayer2 = table[2][0];
            if (table[2][0] == inputPayer2 & table[1][1] == inputPayer2 & table[0][2] == inputPayer2) {
                returnValue = inputPayer2;
            }
        }
        return returnValue;
    }

    private int draw(int[][] table) {

        int returnValue = -1;
        for (int i = 0; i < table.length; i++) {
            if (table[i][0] != 0 & table[i][1] != 0 & table[i][2] != 0) {
                if (table[0][i] != 0 & table[1][i] != 0 & table[2][i] != 0) {
                    returnValue = 0;
                }
            }
        }
        return returnValue;
    }

}