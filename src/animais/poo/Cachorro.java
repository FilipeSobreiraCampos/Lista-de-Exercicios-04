package animais.poo;

public class Cachorro extends AnimalTerrestreAB {

    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.println(nome + " comeu " + quantidade + " gramas.");
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.println(nome + " se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " dormiu por " + horas + " horas.");
    }
}
