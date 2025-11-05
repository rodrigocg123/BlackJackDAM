package main;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        int ptsJugador = 0;
        int ptsBanca = 0;
        int LIMITE = 21;
        int limiteBanca = 16;

        Scanner entrada = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de BlackJack!");
        System.out.println("Comienzan los turnos del jugador");
        while (ptsJugador < LIMITE || ptsBanca < limiteBanca) {
            System.out.println("Tus puntos actuales son: " + ptsJugador);
            System.out.println("Puntos actuales de la banca: " + ptsBanca);
            System.out.print("¿Quieres pedir una carta? (si/no): ");
            String respuesta = entrada.nextLine();
            if (ptsBanca < limiteBanca) {
                int cartaBanca = (int) (Math.random() * 10) + 1;
                ptsBanca += cartaBanca;
            }// fin if banca

            if (respuesta.equalsIgnoreCase("si")) {
                int cartaJugador = (int) (Math.random() * 10) + 1;
                ptsJugador += cartaJugador;
            } else {
                break;
            }// fin if jugador
        } // fin while

        System.out.println("Puntos del jugador: " + ptsJugador);
        System.out.println("Puntos de la banca: " + ptsBanca);
        if (ptsBanca > LIMITE && ptsJugador < LIMITE) { // SE PASA LA BANCA
            System.out.println("¡Felicidades! Has ganado.");
        } else if (ptsJugador > LIMITE && ptsBanca < LIMITE) { // SE PASA EL JUGADOR
            System.out.println("La banca gana. Has perdido.");
        } else if (ptsJugador < ptsBanca) { // COMPARA PUNTUACIONES GANA BANCA
            System.out.println("La banca gana. Has perdido.");
        } else if (ptsJugador > ptsBanca) { // COMPARA PUNTUACIONES GANA JUGADOR
            System.out.println("¡Felicidades! Has ganado.");
        } else { // EMPATE
            System.out.println("Empate.");
        }

        entrada.close();
    }// fin main
}// fin clase