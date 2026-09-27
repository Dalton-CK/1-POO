public class converterMinutos
{
    public static int converterMinutos(int horas, int minutos)
    {
        return (horas * minutos);
    } 
    public static void main(String[] args)
    {
        int hora = converterMinutos(3, 60); 
        System.out.println("Minutos: " + hora);
    } 
}