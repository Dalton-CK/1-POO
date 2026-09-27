public class criarMensagem
{
    public static String criarMensagem(String nome, String planeta)
    {
        return (nome + planeta);
    }
    public static void main(String[] args)
    {
        String nomes = criarMensagem("Dalton Castro ", "Bem-vindo!");
        System.out.println(nomes);
    }
}