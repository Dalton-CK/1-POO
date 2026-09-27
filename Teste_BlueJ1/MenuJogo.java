public class MenuJogo
{
    public static void mostrarTitulo() 
    {
        System.out.println("==  AVENTURA: ILHA PERDIDA  =="); 
    }
    public static void mostrarOpcoes() 
    { 
        System.out.println("=         Novo jogo          =");
        System.out.println("=         Continuar          =");
        System.out.println("=         Opções             =");
        System.out.println("=         Sair               =");
    }
    public static void mostrarRodape() 
    { 
        System.out.println("==  Boa sorte, aventureiro! =="); 
    }
     public static void main(String[] args) 
    { 
        mostrarTitulo();
        mostrarOpcoes();
        mostrarRodape();
    } 
}