import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        int ptsJugador = 0;
        int ptsBanca = 0;
        int LIMITE = 21;
        int LimiteBanca = 16;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al juego de BlackJack");
        System.out.println("Comienzan los turnos del jugador");
        while (ptsJugador < LIMITE) {
            System.out.println("Tus puntos actuales son: " + ptsJugador);
            System.out.print("¿Quieres pedir una carta? (si/no): ");
            String respuesta = entrada.nextLine();
            
            if (respuesta.equalsIgnoreCase("si")) {
                int carta = (int) (Math.random() * 10) + 1;
                ptsJugador += carta;
            } else {
                break;
            }

        }//fin while jugador
        if(ptsJugador > LIMITE){
            System.out.println("Tus puntos son: "+ ptsJugador + " te has pasado de " + LIMITE + " puntos. Has perdido.");
        }else{
            System.out.println("Turno de la banca");
            while (ptsBanca <= LimiteBanca) {
                int carta = (int) (Math.random() * 10) + 1;
                ptsBanca += carta;
            }//fin while banca
            System.out.println("Puntos del jugador: " + ptsJugador);
            System.out.println("Puntos de la banca: " + ptsBanca);
            if (ptsBanca > LIMITE || ptsJugador > ptsBanca) {
                System.out.println("¡Felicidades! Has ganado.");
            } else if (ptsJugador < ptsBanca) {
                System.out.println("La banca gana. Has perdido.");
            } else {
                System.out.println("Empate.");
            }
        }
        entrada.close();
    }//fin main

}//fin clase