import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorJuegoDescuentoRecurrente = 0;
        double valorJuegoFinal = 0;
        double valorAccesorioFInal = 0;
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
                System.out.println("---------------\nComprar Accesorio\n---------------");
                System.out.println("Indica el tipo de accesorio");
                String accesorio = sc.nextLine();
                System.out.println("Indique el valor del accesorio");
                double valorAccesorio = sc.nextDouble();
                if (valorAccesorio>200000){
                    valorAccesorioFInal= valorAccesorio-(valorAccesorio*0.08);
                    System.out.println("-----------\nEl accesorio escogido fue "+accesorio+"\nTiene un valor base de "+valorAccesorio+"\nDebido a esto tiene un descuento del 8%, por lo tanto su valor final es de:\n"+valorAccesorioFInal+"\n-----------");
                } else if ((valorAccesorio>50000)&&(valorAccesorio<200000)) {
                    valorAccesorioFInal= valorAccesorio-(valorAccesorio*0.05);
                    System.out.println("-----------\nEl accesorio escogido fue "+accesorio+"\nTiene un valor base de "+valorAccesorio+"\nDebido a esto tiene un descuento del 5%, por lo tanto su valor final es de:\n"+valorAccesorioFInal"\n-----------");
                }else {
                    System.out.println("-----------\nEl accesorio escogido fue "+accesorio+"\nTiene un valor base de "+valorAccesorio+"\nDebido a esto, no tiene ningun descuento, por lo tanto su valor final es de:\n"+valorAccesorio"\n-----------");
                }
                break;
            case "3":
                System.out.println("---------------\nSolicitar membresia\n---------------");
                System.out.println("Ingrese la edad del cliente");
                int edad = sc.nextInt();
                if (edad<18){
                    System.out.println("Usted tiene"+edad+"Los menores de 18 años no tienen permitido solicitar una membresia");
                }
                break;
        }
    }
}