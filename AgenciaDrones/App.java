public class App
{
    public static void mostrarTitulo()
    {
        System.out.println("=== AGÊNCIA DE DRONES ===");
    }
    public static void mostrarSeparador()
    {
        System.out.println("----------------------");
    }
    public static void mostrarMensagemFinal()
    {
        System.out.println("Obrigado por utilizar a Agência de Drones!");
    }
    public static int calcularTempoTotal(int ida, int volta)
    {
        return ida + volta;
    }
    public static boolean temAutonomia(double autonomia, double distancia)
    {
        return autonomia >= distancia;
    }
    public static void main(String[] args)
    {
        Drone um = new Drone();
        Drone dois = new Drone();
        Drone tres = new Drone();

        mostrarTitulo();
        mostrarSeparador();
        
        um.identificador = "D001";
        um.modelo = "DJI Mini";
        um.autonomia = 100;
        um.altitudeMaxima = 500;
        um.disponivel = true;
        
        dois.identificador = "D002";
        dois.modelo = "DJI Air";
        dois.autonomia = 150;
        dois.altitudeMaxima = 1000;
        dois.disponivel = true;

        tres.identificador = "D003";
        tres.modelo = "DJI Mavic";
        tres.autonomia = 200;
        tres.altitudeMaxima = 1500;
        tres.disponivel = false;
        
        System.out.println("Drone 1: " + um.identificador + " Modelo: " + um.modelo + " Autonomia: " + um.autonomia + " Altitude Maxima: " + um.altitudeMaxima + " Disponivel: " + um.disponivel);
        System.out.println("Drone 2: " + dois.identificador + " Modelo: " + dois.modelo + " Autonomia: " + dois.autonomia + " Altitude Maxima: " + dois.altitudeMaxima + " Disponivel: " + dois.disponivel);
        System.out.println("Drone 3: " + tres.identificador + " Modelo: " + tres.modelo + " Autonomia: " + tres.autonomia + " Altitude Maxima: " + tres.altitudeMaxima + " Disponivel: " + tres.disponivel);

        mostrarSeparador();

        int tempoTotal = calcularTempoTotal(30, 40);
        System.out.println("Tempo total: " + tempoTotal);

        boolean resultado = temAutonomia(um.autonomia, 80);
        System.out.println("Tem autonomia: " + resultado);

        mostrarSeparador();

        System.out.println("Antes: " + um.disponivel);

        um.disponivel = false;

        System.out.println("Depois: " + um.disponivel);
        
        mostrarSeparador();
        
        mostrarMensagemFinal();
    }
}