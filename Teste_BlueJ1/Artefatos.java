public class Artefatos
{
    public static void main(String[] args)
    {
        Artefacto primeiro = new Artefacto();
        primeiro.codigo = 9617;
        primeiro.descricao = "Cristal raro";
        primeiro.planetaOrigem = "Lua";
        primeiro.valor = 80;
        primeiro.perigoso = true;

        Artefacto segundo = new Artefacto();
        segundo.codigo = 1234;
        segundo.descricao = "Esfera misteriosa";
        segundo.planetaOrigem = "Marte";
        segundo.valor = 100;
        segundo.perigoso = false;

        Artefacto terceiro = new Artefacto();
        terceiro.codigo = 1332;
        terceiro.descricao = "Pedra brilhante";
        terceiro.planetaOrigem = "Sol";
        terceiro.valor = 100;
        terceiro.perigoso = false;

        System.out.println("O artefacto " + primeiro.codigo + " é um " + primeiro.descricao + ", veio da " + primeiro.planetaOrigem + " e vale " + primeiro.valor + " créditos. Perigoso: " + primeiro.perigoso);

        System.out.println("Foi encontrado o artefacto " + segundo.codigo + ", uma " + segundo.descricao + " proveniente de " + segundo.planetaOrigem + ". O seu valor é " + segundo.valor + " créditos. Perigoso: " + segundo.perigoso);

        System.out.println("O terceiro artefacto, código " + terceiro.codigo + ", é uma " + terceiro.descricao + " com origem no " + terceiro.planetaOrigem + ". Vale " + terceiro.valor + " créditos. Perigoso: " + terceiro.perigoso);
    }
}