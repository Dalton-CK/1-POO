public class BoletimMeteorológico
{
    public static void mostrarCidade()
    {
        System.out.println("Lisboa");
    }

    public static void mostrarTemperatura()
    {
        System.out.println("22 graus");
    }

    public static void mostrarEstadoCeu()
    {
        System.out.println("Céu parcialmente nublado");
    }

    public static void mostrarAviso()
    {
        System.out.println("Sem avisos meteorológicos.");
    }

    public static void main(String[] args)
    {
        mostrarCidade();
        mostrarTemperatura();
        mostrarEstadoCeu();
        mostrarAviso();
    }
}