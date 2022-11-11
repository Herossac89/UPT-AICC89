
import java.util.Scanner;

public class juegoUno {
    static int cantidadJugadores;
    static int jugador1[] = new int[8];
    static int jugador2[] = new int[8];
    static int jugador3[] = new int[8];
    static int jugador4[] = new int[8];
    static int cartasAsignadas[] = new int[120];

    static int 


    public static void main(String[] args) {

        Scanner modo = new Scanner(System.in);
        System.out.println("Selecciona el modo de juego \n 1.- Modo con amigos \n 2.- Modo solitario");
        int modoJuego = modo.nextInt();

        if (modoJuego == 1) {

            System.out.println("El modo seleccionado es \n 1.- Modo con amigos");
            Scanner jugadores = new Scanner(System.in);

            System.out.println("Selecciona la cantidad de jugadores maximo 4 jugadores");
            cantidadJugadores = jugadores.nextInt();
            if (cantidadJugadores > 1) {
                if (cantidadJugadores <= 4) {
                    // jugadores();
                    repartirCartas();
                    // partida();

                }

            } else {
                System.out.println("Cantidad de jugadores no permitida");
            }
        }
    }

    public static void barajaear() {
        for (int i = 0; i < cartasAsignadas.length; i++) {
            cartasAsignadas[i] = (int) (Math.random() * 11) + 0;
            // System.out.print(" " + cartasAsignadas[i]);
        }
    }

    public static void repartirCartas() {
        barajaear();
        switch (cantidadJugadores) {
            case 1:
                System.out.println("No se puede");
            case 2:
                System.out.println("Esta son tus cartas jugador 1");
                for (int i = 1; i <= 7; i++) {
                    jugador1[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador1[i]);
                }
                System.out.println("Esta son tus cartas jugador 2");
                for (int i = 1; i <= 7; i++) {
                    jugador2[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador2[i]);
                }
                break;
            case 3:
                System.out.println("Esta son tus cartas jugador1");
                for (int i = 1; i <= 7; i++) {
                    jugador1[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador1[i]);
                }
                System.out.println("Esta son tus cartas jugador 2");
                for (int i = 1; i <= 7; i++) {
                    jugador2[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador2[i]);
                }
                System.out.println("Esta son tus cartas jugador 3");
                for (int i = 1; i <= 7; i++) {
                    jugador3[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador3[i]);
                }
                break;
            case 4:
                System.out.println("Esta son tus cartas jugador1");
                for (int i = 1; i <= 7; i++) {
                    jugador1[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador1[i]);
                }
                System.out.println("Esta son tus cartas jugador 2");
                for (int i = 1; i <= 7; i++) {
                    jugador2[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador2[i]);
                }
                System.out.println("Esta son tus cartas jugador 3");
                for (int i = 1; i <= 7; i++) {
                    jugador3[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador3[i]);
                }
                System.out.println("Esta son tus cartas jugador 4");
                for (int i = 1; i <= 7; i++) {
                    jugador4[i] = cartasAsignadas[i];
                    System.out.println(" Carta " + i + " : " + jugador4[i]);
                }
                break;
        }
    }
}
