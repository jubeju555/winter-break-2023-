#include <iostream>
using namespace std;

const int N = 9;

void printGrid(int grid[N][N]) {
    for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++) {
            cout << grid[row][col] << " ";
        }
        cout << endl;
    }
}

bool isValidMove(int grid[N][N], int row, int col, int num) {
    // Check if 'num' is not present in the current row, column, and 3x3 subgrid
    for (int i = 0; i < N; i++) {
        if (grid[row][i] == num || grid[i][col] == num || grid[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
            return false;
        }
    }
    return true;
}

bool findEmptyLocation(int grid[N][N], int &row, int &col) {
    for (row = 0; row < N; row++) {
        for (col = 0; col < N; col++) {
            if (grid[row][col] == 0) {
                return true;
            }
        }
    }
    return false;
}

bool solveSudoku(int grid[N][N]) {
    int row, col;

    // Find an empty location
    if (!findEmptyLocation(grid, row, col)) {
        return true; // Sudoku solved
    }

    // Try placing numbers 1 to 9 in the empty location
    for (int num = 1; num <= 9; num++) {
        if (isValidMove(grid, row, col, num)) {
            // Place the number if it's a valid move
            grid[row][col] = num;

            // Recursively try solving the rest of the Sudoku
            if (solveSudoku(grid)) {
                return true;
            }

            // If placing the number doesn't lead to a solution, backtrack
            grid[row][col] = 0;
        }
    }

    // No number worked, backtrack to the previous state
    return false;
}

int main() {
    int grid[N][N] = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    if (solveSudoku(grid)) {
        cout << "Sudoku solved:" << endl;
        printGrid(grid);
    } else {
        cout << "No solution exists." << endl;
    }

    return 0;
}
