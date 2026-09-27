public class TerminalEspacial
{
        public static void Cabeçalho() 
    { 
        System.out.println("MISSÃO ESPACIAL"); 
    } 
 
    public static void tripulação() 
    { 
        System.out.println("Tripulação a bordo:");
        System.out.println("Capitão: Alex");
        System.out.println("Piloto: Miguel");
        System.out.println("Engenheira: Sofia"); 
    }
    
        public static void destino() 
    { 
        System.out.println("Destino: Sol"); 
    } 
 
    public static void EstadoDaNave() 
    { 
        System.out.println("Estado: Todos os sistemas estão operacionais.");
        System.out.println("Combustível: Suficiente para a viagem.");
        System.out.println("Missão: Pronta para começar.");
    }
    
    public static void MensagemFinal() 
    { 
        System.out.println("Boa viagem, tripulação! A missão Horizonte começa agora."); 
    }
    
    public static void main(String[] args) 
    { 
        Cabeçalho();
        tripulação();
        destino();
        EstadoDaNave();
        MensagemFinal();
        MensagemFinal();
    }
}