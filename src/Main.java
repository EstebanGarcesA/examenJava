import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorJuegoDescuentoRecurrente = 0;
        double valorJuegoFinal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero al que corresponde su solicitud\n1. Comprar videojuego\n2. Comprar accesorio\n3. Solicitar membresía\n-------------------------");
        String solicutud = sc.nextLine();
        switch (solicutud){
            case "1":
                System.out.println("---------------\nComprar Videojuego\n---------------");
                System.out.println("Escriba -si- o -no- es cliente recurrente: ");
                String recurrente = sc.nextLine();
                System.out.println("Indique el valor del juego");
                double valorJuego = sc.nextDouble();
                if (recurrente.equals("si")){
                    valorJuegoDescuentoRecurrente = valorJuego-(valorJuego*0.05);
                    if (valorJuego>150000){
                        valorJuegoFinal = valorJuegoDescuentoRecurrente - (valorJuego*0.1);
                        System.out.println("-----------\nUsted decidio comprar un video juego, el valor del juego es de "+ valorJuego+"\nComo es cliente recurrente se le aplica un descuento del 5% y el juego al tener un valor superios de 150000 pesos, se le aplica un descuento del 10% al valor base del juego, por lo tanto el valor final es de " +valorJuegoFinal+"\n-----------");
                    } else {
                        System.out.println("-----------\nUsted decidio comprar un video juego, el valor del juego es de "+ valorJuego+"\nComo es cliente recurrente se le aplica un descuento del 5% al valor base del juego, por lo tanto el valor final es de " +valorJuegoDescuentoRecurrente+"\n-----------");

                    }
                } else {
                        if (valorJuego>150000){
                            valorJuegoFinal = valorJuego - (valorJuego*0.1);
                            System.out.println("-----------\nUsted decidio comprar un video juego, el valor del juego es de "+ valorJuego+"\nEl juego al tener un valor superios de 150000 pesos, se le aplica un descuento \ndel 10% al valor base del juego, por lo tanto el valor final es de " +valorJuegoFinal+"\n-----------");
                        } else {
                            System.out.println("-----------\nUsted decidio comprar un video juego, el valor del juego es de "+ valorJuego+"\nNo se le aplica ningun descuento\n-----------");
                    }
                }
                break;
            case "2":
                
                break;
            case "3":
                break;
        }
    }
}