package com.example.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TicTacToeApplicationTests {

//	Our goal is to create a function that will check that for us!
//	Assume that the board comes in the form of a 3×3 array, where the value is 0 if a spot is empty, 1 if it is an X, or 2 if it is an O, like so:
//			[[0,0,1],
//			[0,1,2],
//			[2,1,0]]
//	We want our function to return -1 if the board is not solved yet, 1 if X won, 2 if O won, or 0 if it’s a cat’s game (i.e. a draw), 3 if table is not valid.
//	You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.

    public TicTacToeApplication ticTacToeApplication = new TicTacToeApplication();

    @Test
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
        int[][] table = new int[][]{
                {0, 0},
                {0, 0},
                {0, 0}
        };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
          ticTacToeApplication.resultChecker(table);
        });

        assertEquals(exception.getMessage(),"Illegal table");
    }

    @Test
    public void shouldReturnThreeIfTableIsInvalid2x2() {
        int[][] table = new int[][]{
                {0, 0},
                {0, 0}
        };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ticTacToeApplication.resultChecker(table);
        });

        assertEquals(exception.getMessage(),"Illegal table");
    }

    @Test
    public void shouldReturnThreeIfTableIsInvalid3x3AndMissingValue() {
        int[][] table = new int[][]{
                {0, 0, 0},
                {0, 0},
                {0, 0, 0}
        };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           ticTacToeApplication.resultChecker(table);
        });

        assertEquals(exception.getMessage(),"Illegal table");
    }

    @Test
    public void shouldReturnThreeIfTableIsInvalid4x4() {
        int[][] table = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            int ticTacToeActual = ticTacToeApplication.resultChecker(table);
        });

        String expectedMessage = "Illegal table";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldReturnMinusOneIfTableIsFullOfZeros() {

        int[][] table = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        int ticTacToeActual = ticTacToeApplication.resultChecker(table);
        assertEquals(-1, ticTacToeActual);
    }

    @Test
    public void shouldReturnOneIfTheresAHorizontalWinForX() {

        int[][] tableRowOne = new int[][]{
                {1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] tableRowTwo = new int[][]{
                {0, 0, 0},
                {1, 1, 1},
                {0, 0, 0}
        };

        int[][] tableRowThree = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {1, 1, 1}
        };
        int ticTacToeActual = ticTacToeApplication.resultChecker(tableRowOne);
        assertEquals(1, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableRowTwo);
        assertEquals(1, ticTacToeActualTwo);

        int ticTacToeActualThree = ticTacToeApplication.resultChecker(tableRowThree);
        assertEquals(1, ticTacToeActualThree);
    }

    @Test
    public void shouldReturnTwoIfTheresAHorizontalWinForO() {

        int[][] tableRowOne = new int[][]{
                {2, 2, 2},
                {0, 0, 0},
                {0, 0, 0}
        };

        int[][] tableRowTwo = new int[][]{
                {0, 0, 0},
                {2, 2, 2},
                {0, 0, 0}
        };

        int[][] tableRowThree = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {2, 2, 2}
        };
        int ticTacToeActual = ticTacToeApplication.resultChecker(tableRowOne);
        assertEquals(2, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableRowTwo);
        assertEquals(2, ticTacToeActualTwo);

        int ticTacToeActualThree = ticTacToeApplication.resultChecker(tableRowThree);
        assertEquals(2, ticTacToeActualThree);
    }

    @Test
    public void shouldReturnOneIfTheresAVerticalWinForX() {

        int[][] tableColumnOne = new int[][]{
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
        };

        int[][] tableColumnTwo = new int[][]{
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };

        int[][] tableColumnThree = new int[][]{
                {0, 0, 1},
                {0, 0, 1},
                {0, 0, 1}
        };
        int ticTacToeActual = ticTacToeApplication.resultChecker(tableColumnOne);
        assertEquals(1, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableColumnTwo);
        assertEquals(1, ticTacToeActualTwo);

        int ticTacToeActualThree = ticTacToeApplication.resultChecker(tableColumnThree);
        assertEquals(1, ticTacToeActualThree);
    }

    @Test
    public void shouldReturnTwoIfTheresAVerticalWinForO() {

        int[][] tableColumnOne = new int[][]{
                {2, 0, 0},
                {2, 0, 0},
                {2, 0, 0}
        };

        int[][] tableColumnTwo = new int[][]{
                {0, 2, 0},
                {0, 2, 0},
                {0, 2, 0}
        };

        int[][] tableColumnThree = new int[][]{
                {0, 0, 2},
                {0, 0, 2},
                {0, 0, 2}
        };
        int ticTacToeActual = ticTacToeApplication.resultChecker(tableColumnOne);
        assertEquals(2, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableColumnTwo);
        assertEquals(2, ticTacToeActualTwo);

        int ticTacToeActualThree = ticTacToeApplication.resultChecker(tableColumnThree);
        assertEquals(2, ticTacToeActualThree);
    }

    @Test
    public void shouldReturnOneIfTheresADiagonalWinForX() {

        int[][] tableDiagonalOne = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] tableDiagonalTwo = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0}
        };

        int ticTacToeActual = ticTacToeApplication.resultChecker(tableDiagonalOne);
        assertEquals(1, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableDiagonalTwo);
        assertEquals(1, ticTacToeActualTwo);
    }

    @Test
    public void shouldReturnTwoIfTheresADiagonalWinForO() {

        int[][] tableDiagonalOne = new int[][]{
                {2, 0, 0},
                {0, 2, 0},
                {0, 0, 2}
        };

        int[][] tableDiagonalTwo = new int[][]{
                {0, 0, 2},
                {0, 2, 0},
                {2, 0, 0}
        };

        int ticTacToeActual = ticTacToeApplication.resultChecker(tableDiagonalOne);
        assertEquals(2, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableDiagonalTwo);
        assertEquals(2, ticTacToeActualTwo);
    }

    @Test
    public void shouldReturnZeroIfTheresADraw() {

        int[][] tableDrawOne = new int[][]{
                {1, 1, 2},
                {2, 2, 1},
                {1, 1, 2}
        };

        int ticTacToeActual = ticTacToeApplication.resultChecker(tableDrawOne);
        assertEquals(0, ticTacToeActual);
    }

    @Test
    public void shouldReturnMinusOneIfPartiallyComplete() {

        int[][] tableIncompleteOne = new int[][]{
                {0, 1, 2},
                {1, 2, 1},
                {1, 0, 0}
        };

        int[][] tableIncompleteTwo = new int[][]{
                {0, 0, 2},
                {0, 1, 1},
                {0, 1, 1}
        };
        int[][] tableIncompleteThree = new int[][]{
                {0, 0, 0},
                {1, 2, 1},
                {1, 0, 2}
        };

        int ticTacToeActual = ticTacToeApplication.resultChecker(tableIncompleteOne);
        assertEquals(-1, ticTacToeActual);

        int ticTacToeActualTwo = ticTacToeApplication.resultChecker(tableIncompleteTwo);
        assertEquals(-1, ticTacToeActual);

        int ticTacToeActualThree = ticTacToeApplication.resultChecker(tableIncompleteThree);
        assertEquals(-1, ticTacToeActual);
    }
}
