public class CalculadoraDeMissão
{
    public static int CalculadoraDeMissão(int DuracaooDaMissao)
    {
        return DuracaooDaMissao;
    }
    
    public static double CalculadoraDeMissão(double Combustivel)
    {
        return Combustivel;
    }
    
    public static String CalculadoraDeMissão( String MensagemFinal)
    {
        return MensagemFinal;
    }
    
    public static void main(String[] args)
    {
        System.out.println("===========RELATORIO DE MISSAO============");
        int DuracaooDaMissao = CalculadoraDeMissão(20);
        System.out.println("Duração: " + DuracaooDaMissao + " dias");
        
        double Combustivel = CalculadoraDeMissão(200);
        System.out.println("Combustível: " + Combustivel + " litros");
        
        String MensagemFinal = CalculadoraDeMissão("Missão concluída com sucesso");
        System.out.println(MensagemFinal);
    }
}