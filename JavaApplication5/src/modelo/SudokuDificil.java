/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author HP
 */
public class SudokuDificil extends Sudoku {
    
    public SudokuDificil(){
        super();
    }
    @Override
    public void generarSu(int nivel) {
        limpiarSu();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(9) + 1;
                if ( correcCuadrante(i, j, num)) {
                    Sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                int num = random.nextInt(9) + 1;
                if ( correcCuadrante(i, j, num)) {
                    Sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }

        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                int num = random.nextInt(9) + 1;
                if ( correcCuadrante(i, j, num)) {
                    Sudoku[i][j] = num;
                } else {
                    j--;
                }
            }
        }
    }
}
