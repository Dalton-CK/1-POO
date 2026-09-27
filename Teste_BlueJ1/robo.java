public class robo
{
    public static void main(String[] args)
    { 
        RobOsDeManutencao primeiro = new RobOsDeManutencao();
        primeiro.nome = "Atlas";
        primeiro.modelo = "RX-1";
        primeiro.bateria = 300;
        primeiro.operacional = true;
        
        RobOsDeManutencao segundo = new RobOsDeManutencao();
        segundo.nome = "Bolt"; 
        segundo.modelo = "MT-2"; 
        segundo.bateria = 200; 
        segundo.operacional = false;

        System.out.println(primeiro.nome + " - modelo " + primeiro.modelo); 
        System.out.println(segundo.nome + " - modelo " + segundo.modelo);
    }
}