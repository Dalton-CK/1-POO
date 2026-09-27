public class Equipa
{
     public static void main(String[] args) 
    { 
        MembroEquipa Membro1 = new MembroEquipa(); 
        Membro1.nome = "Luna";
        Membro1.idade = 25;
        Membro1.salario = 1500.50;
        Membro1.comandante = true;
        Membro1.planeta = "L";
        
 
        MembroEquipa Membro2 = new MembroEquipa(); 
        Membro2.nome = "Solar";
        Membro2.idade = 30;
        Membro2.salario = 1800.75;
        Membro2.comandante = false;
        Membro2.planeta = "S";
        
        MembroEquipa Membro3 = new MembroEquipa(); 
        Membro3.nome = "Nova";
        Membro3.idade = 22;
        Membro3.salario = 1350.00;
        Membro3.comandante = false;
        Membro3.planeta = "N";
 
        System.out.println("Ficha completa");
        System.out.println("Nome: " + Membro1.nome);
        System.out.println("Idade: " + Membro1.idade);
        System.out.println("Salario: " + Membro1.salario);
        System.out.println("Comandante: " + Membro1.comandante);
        System.out.println("Planeta: " + Membro1.planeta);
        System.out.println("Nome: " + Membro2.nome);
        System.out.println("Idade: " + Membro2.idade);
        System.out.println("Salario: " + Membro2.salario);
        System.out.println("Comandante: " + Membro2.comandante);
        System.out.println("Planeta: " + Membro2.planeta);
        System.out.println("Nome: " + Membro3.nome);
        System.out.println("Idade: " + Membro3.idade);
        System.out.println("Salario: " + Membro3.salario);
        System.out.println("Comandante: " + Membro3.comandante);
        System.out.println("Planeta: " + Membro3.planeta);
    }
}