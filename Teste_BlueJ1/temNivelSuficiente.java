public class temNivelSuficiente
{
    public static boolean temNivelSuficiente(int nivelAtual, int nivelMinimo) 
    {
        return (nivelAtual >= nivelMinimo);
    }
    public static void main(String[] args)
    {
        boolean resultado = temNivelSuficiente(0, 1);
        System.out.println(resultado);
    } 
}