/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Sudokumedio extends Sudoku implements Aumentarnivel {
    
    public Sudokumedio(){
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
    @Override
    public void Subirlevel(SudokuFacil a,Sudokumedio b,SudokuDificil c){
     Scanner sc=new Scanner(System.in);
        int nivel;
        System.out.println("A QUE NIVEL QUIERES AUMENTARLE PRECIONA 1 PARA SUBIRLE UN NIVEL Y PRECIONA 2 PARA SUBIRLE DOS: ");
        nivel=sc.nextInt();
        if(nivel==1){
            c.generarSu(nivel);
        }else{
            System.out.println("ERRROR");
            
        }   
       
    }
}
