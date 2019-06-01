/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

/**
 *
 * @author Oscar
 */
import java.util.*;

public class ColorfulWalk {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadCasas = teclado.nextInt();
        int[] coloresCasas = new int[cantidadCasas];
        for (int i = 0; i < cantidadCasas; i++) {
            coloresCasas[i] = teclado.nextInt();

        }
        int cantidadAMover = cantidadCasasARecorrer2(cantidadCasas, coloresCasas);
        System.out.println(cantidadAMover);
    }

    public static int cantidadCasasARecorrer(int cantidadCasas, int[] coloresCasas) {
        int opcion1 = cantidadCasas - 1;
        while (opcion1 >= 0) {
            if (coloresCasas[0] != coloresCasas[opcion1]) {
                break;
            }
            opcion1--;
        }
        int opcion2 = 0;
        while (opcion2 < cantidadCasas) {
            if (coloresCasas[opcion2] != coloresCasas[cantidadCasas - 1]) {
                opcion2 = (cantidadCasas - 1) - opcion2;
                break;
            }
            opcion2++;
        }
        int cantidadAMover = Math.max(opcion1, opcion2);
        return cantidadAMover;

    }

    public static int cantidadCasasARecorrer2(int cantidadCasas, int[] coloresCasas) {
        int opcion1 = 0;
        int opcion2 = 0;
        int contadorOpcion1 = 0;
        int contadorOpcion2 = cantidadCasas - 1;
        int cantidadAMover;
        while (true) {
            if (opcion1 != 0 && opcion2 != 0) {
                break;
            }
            if (opcion1 == 0) {
                if (coloresCasas[contadorOpcion1] != coloresCasas[cantidadCasas - 1]) {
                    opcion1 = (cantidadCasas - 1) - contadorOpcion1;
                }
            }
            if (opcion2 == 0) {
                if (coloresCasas[0] != coloresCasas[contadorOpcion2]) {
                    opcion2 = contadorOpcion2;
                }
            }
            contadorOpcion1++;
            contadorOpcion2--;
        }
        cantidadAMover = Math.max(opcion1, opcion2);
        return cantidadAMover;
    }

}
