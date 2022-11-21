
package modelo;
import java.util.Random;
import java.util.Scanner;
public abstract  class Sudoku {
    protected int  [][] Sudoku ;
    private String dificultad;
    protected Datos jugador;
    public Sudoku(){
        int sudoku[][]={
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
                     {0,0,0,0,0,0,0,0,0},
        };
        
        Sudoku=sudoku;
        dificultad="";
        jugador=new Datos();
                
    
    }
    public boolean Resolver(){
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                if (Sudoku[i][j]==0){
                    for (int valor = 1; valor < 10; valor++) {
                        if(correcColumna(j,valor)&&correcFila(i,valor)&&correcCuadrante(i,j,valor)){
                            Sudoku[i][j]=valor;
                            if(Resolver())return true;
                            Sudoku[i][j]=0;
                            
                                
                            
                            
                        }
                    }return false;
                }
                
            }
            
        }return true;
    }
    public void Mostrar(){
        
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                System.out.print(Sudoku[i][j]);
                if(!(j==Sudoku[0].length-1)) System.out.print(" - ");
                
            }
            System.out.println();
            
        }
    }
    public void Mostrarsudokuresuelto(){
        Resolver();
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                System.out.print(Sudoku[i][j]);
                if(!(j==Sudoku[0].length-1)) System.out.print(" - ");
                
            }
            System.out.println();
            
        }
        
    }
        
        
      public boolean correcCuadrante(int i, int j, int valor) {
        
        int posiI = CuaAC(i);
        int posiJ = CuaAC(j);

          for (int n = posiI - 3; n < posiI; n++) {
            for (int m = posiJ - 3; m < posiJ; m++) {

                if (Sudoku[n][m] == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    public int CuaAC (int posi) {
        if (posi <= 2) {
            return 3;
        } else if (posi <= 5) {
            return 6;
        } else {
            return 9;
        }
    }

    public boolean correcFila(int i, int valor) {
        for (int j = 0; j < Sudoku[i].length; j++) {
            if (Sudoku[i][j] == valor) {
                return false;
            }
        }
        return true;
    }

    public boolean correcColumna(int j, int valor) {
        for (int i = 0; i < Sudoku.length; i++) {
            if (Sudoku[i][j] == valor) {
                return false;
            }
        }
        return true;
    }
    public void llenar(){
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                if (Sudoku[i][j]==0){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Rellene los espacios que digan 0 ");
                    System.out.println("EL numero de filas y columnas van de 0 al 8");
                    System.out.println("Ponga la fila que quiere cambiar: ");
                    i=sc.nextInt();
                    System.out.println("Ponga en cual columna se encuentra");
                    j=sc.nextInt();
                    System.out.println("Coloque el numero que quiere ingresar");
                    Sudoku[i][j]=sc.nextInt();
                    Mostrar();
                    
                }
                
            }
            
        }
    }
    public void Borrarrespuesta(){
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                if (Sudoku[i][j]!=0){
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Borra los datos ingresados ");
                    System.out.println("EL numero de filas y columnas van de 0 al 8");
                    System.out.println("Ponga la fila que quiere cambiar: ");
                    i=sc.nextInt();
                    System.out.println("Ponga en cual columna se encuentra");
                    j=sc.nextInt();
                    
                    Sudoku[i][j]=0;
                    Mostrar();
                }
            }   
        }
    }
    
    public  int [][] Getsudoku(){
        return Sudoku;
    }
    
    
    public abstract void generarSu(int nivel);
   
    public String getdificultad(){
        return dificultad;
    }
    public void verdatos(){
        System.out.println(dificultad);
        System.out.println(jugador);
        
    }
   
   
   
   
   public void limpiarSu() {
        for (int i = 0; i < Sudoku.length; i++) {
            for (int j = 0; j < Sudoku[0].length; j++) {
                Sudoku[i][j] = 0;
            }
        }
    }
 
    

    

        
    

}
        
    
    




    
    
        
        
        
    
    

