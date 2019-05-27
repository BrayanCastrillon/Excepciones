/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5};
        try {
            /*System.out.println(arreglo[-1]);*/
            mostrarArreglo(arreglo);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice no válido");
        }
    }

    public static void mostrarArreglo(int[] a) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[5]);
    }
}
