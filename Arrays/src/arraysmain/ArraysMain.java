
package arraysmain;
import dominio.Personas;
/**
 *
 * @author jonat
 */
public class ArraysMain {
    
    public static int alea(int li, int ls){//función de JAVA
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
    
    public static void main(String[] args){
        int num [] = {12,32,19};
        int numBi[][] = new int [3][4];
        
        
        Personas p1 = new Personas();
        Personas p2 = new Personas();
        Personas p3 = new Personas();
        Personas p4 = new Personas();
        Personas p [] = {p1, p2, p3};
        Personas pMatriz[][] = {{p1,p2},{p3,p4}};
        
        System.out.println("Array de numeros enteros");
        /*for(int i=0; i<num.length; i++){
            System.out.println("Posicion " + (i+1) + ": " + num[i]);
        }*/
        imprimir(num);
        
        System.out.println("\nArray de Personas");
        for(int i=0; i<p.length; i++){
            System.out.println(p[i]);
        }
        
        //System.out.println(numBi.length);Filas [i]
        //System.out.println(numBi[0].length);Colomnas [j]
        System.out.println("\nMatriz de numeros enteros");
        for(int i=0; i<numBi.length; i++){
            for(int j=0; j<numBi[0].length; j++){
                numBi[i][j] = alea(0,9);
                System.out.print("\t" + numBi[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz de Personas");
        for(int i=0; i<pMatriz.length; i++){
            for(int j=0; j<pMatriz[0].length; j++){
                System.out.println(pMatriz[i][j]+"\n");
            }
        }
    }
    
    public static void imprimir(int vector[]){
        for(int i=0; i<vector.length; i++){
            System.out.println("Edad numero " + (i+1) + ": " + vector[i]);
        }
    }
    
    public static void imprimir(Personas p[][]){
        
    }
}
