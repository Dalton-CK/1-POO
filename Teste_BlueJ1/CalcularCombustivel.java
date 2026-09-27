public class CalcularCombustivel
{
    public static double calcularCombustivel(double distancia, double consumoPorKm)
    {
        return distancia / consumoPorKm;
    }

    public static void main(String[] args)
    {
        double combustivel = calcularCombustivel(100, 14);
        System.out.println("Quantidade: " + combustivel + " litros");
    }
}