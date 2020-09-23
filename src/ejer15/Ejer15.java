
package ejer15;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejer15 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int nFilas,nCol;
        int matriz[][]=new int[3][3];
        
        JOptionPane.showMessageDialog(null, "No se olvide para q sea transpuesta tiene q ser n.fila=n.columnas\n"
                                          + "                                                GRACIAS :)");
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas: "));
        
        
        //
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //transponer la matriz
        int aux;
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
                
            }
        }
            System.out.println("La matriz transpuesta es: ");
            for(int i=0;i<nFilas;i++){
                for(int j=0;j<nCol;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
       //ordenar la matriz transpuesta, metodo de la burbuja... 
            for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                for(int x=0;x<nFilas;x++){
                    for(int y=0;y<nCol;y++){
                        if(matriz[i][j] < matriz[x][y]){
                            int  t;
                           t= matriz[i][j];
                           matriz[i][j]=matriz[x][y];
                           matriz[x][y]=t;
                        }
                    }
            }
            }    
            }
            System.out.println("");
            System.out.println("La matriz transpuesta ordenada es: ");
            //mostramnos el ordenamiento de la matriz 
            for(int i=0;i<nFilas;i++){
                for(int j=0;j<nCol;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            
            
        }
        
    }
    

