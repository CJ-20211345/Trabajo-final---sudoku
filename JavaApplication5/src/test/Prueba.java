
package test;

import modelo.*;
import java.util.Scanner;
public class Prueba {
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        int d;
        String nombre;
        String apellido;
        int codigo;
        String institucion;
        char rpta;
        
        System.out.println("JUEGO SUDOKU PARA  UNIVERSITARIOS");
        System.out.println("        ");
         SudokuFacil facil=new SudokuFacil();
         Sudokumedio medio=new Sudokumedio();
         SudokuDificil dificil=new SudokuDificil();
         
         System.out.println("Ingrese sus datos: ");
                System.out.println("nombre: ");
                nombre=sc.next();
                System.out.println("Apellido: ");
                apellido=sc.next();
                System.out.println("CODIGO");
                codigo=sc.nextInt();
                System.out.println("INGRESA INSTITUCION: ");
                institucion=sc.next();
                Datos objd=new Datos(nombre,apellido,codigo,institucion);
         do{
           System.out.println("COMANDOS: ");
           System.out.println("J. PRESIONE PARA COMENZAR A JUGAR");
           System.out.println("R. Resolver sudoku");
           System.out.println("C. COMPLETAR SUDOKU");
           System.out.println("B.borrar datos ");
           System.out.println("D: CAMBIAR DE DIFICULTAD");
           System.out.println("S: Salir del juego");
           System.out.println("Porfavor dijite la opcion para continuar el Juego: ");
        
            rpta=sc.next().charAt(0);
            
            switch (rpta){
            case 'J':
               
                System.out.println("QUE DIFICULTAD QUIERES JUGAR EL SUDOKU");
                System.out.println("1.FACIL");
                System.out.println("2.Medio");
                System.out.println("3.DIFICil");
                d=sc.nextInt();
                if(d==1){
                   facil.generarSu(d);
                   facil.Mostrar();
                }else if(d==2){
                    medio.generarSu(d);
                    medio.Mostrar();
                }else if(d==3){
                    dificil.generarSu(d);
                    
                    dificil.Mostrar();
                }
                 break;
            case 'R':
                System.out.println("PORFA MENCIONAEL NIVEL DEL DUDOKU ya dicha antes QUE QUIERAS RESOLVER: ");
                d=sc.nextInt();
                if (d==1){
                    facil.Mostrarsudokuresuelto();
                    
                    
                }
                else if(d==2){
                    medio.Mostrarsudokuresuelto();
                    
                }else if(d==3){
                    dificil.Mostrarsudokuresuelto();
                }
                break;
            case 'C':
                System.out.println("INGRESE LA DIFICULTAD DEL SUDOKU YA DICHA PARA COMPLETARLO");
                d=sc.nextInt();
                if (d==1){
                    facil.llenar();
                    
                }else if (d==2){
                    medio.llenar();
                }else if(d==3);
                    dificil.llenar();
                
                
                break;
            case 'B':
                 System.out.println("INGRESE LA DIFICULTAD DEL SUDOKU YA DICHA PARA BORRAR UNA RESPUESTA");
                d=sc.nextInt();
                if (d==1){
                    facil.Borrarrespuesta();
                    
                }else if (d==2){
                    medio.Borrarrespuesta();
                }else if(d==3);
                    dificil.Borrarrespuesta();
                
                break;
            case 'D':
                System.out.println("DIJITE LA DIFICULTAD QUE PUSO PRIMERO");
                d=sc.nextInt();
                if(d==1){
                    facil.Subirlevel(facil, medio, dificil);
                    
                    
                }
                else if(d==2){
                    medio.Subirlevel(facil, medio, dificil);
                }else if(d==3){
                    System.out.println("ESTE SUDOKU YA ESTA A NIVEL MAXIMO");
                }
                   
                
                
                
                break;
            case 'S':
                
                break;
            default:
                System.out.println("OPCION NO VALIDA DIGITE LA LETRA DE MANERA CORRECTA");
            }
        }while(rpta!='S');   
        System.out.println("EL JUEGO  HA FINALIZADO GRACIAS POR JUGAR amigo: "+ objd.Verdatos());
      
        
        
    }  //listo
}       
        
       
        
       
        
    
    

