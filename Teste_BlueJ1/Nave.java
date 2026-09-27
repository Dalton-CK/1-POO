public class Nave
{
    String nome;
    double combustível;
    int velocidade;
    
    public static void main(String[] args) 
    { 
        Nave primeiro = new Nave(); 
        primeiro.nome = "Horizonte";
        primeiro.combustível = 200; 
        primeiro.velocidade = 100;
        System.out.println(primeiro.nome + " Combustivel: " + primeiro.combustível + " Velocidade " + primeiro.velocidade);
        
        primeiro.combustível = 100; 
        primeiro.velocidade = 50;
        System.out.println(primeiro.nome + " Combustivel: " + primeiro.combustível + " Velocidade " + primeiro.velocidade);
    } 
}