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
public class SudokuFacil extends Sudoku implements Aumentarnivel {
     
    
    public SudokuFacil(){
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
    public void Subirlevel(SudokuFacil sudo1,Sudokumedio sudo2, SudokuDificil sudo3){
        Scanner sc=new Scanner(System.in);
        int nivel;
        System.out.println("A QUE NIVEL QUIERES AUMENTARLE PRECIONA 1 PARA SUBIRLE UN NIVEL Y PRECIONA 2 PARA SUBIRLE DOS: ");
        nivel=sc.nextInt();
        if(nivel==1){
            sudo1.generarSu(nivel);
        }else if(nivel==2){
            sudo2.generarSu(nivel);
            
            
        }
        
        
        
    }  
    
        
       
        
    
    
    
    
    
}
