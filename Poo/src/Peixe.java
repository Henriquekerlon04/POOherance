
public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }


    public void dadosPeixe() {
        super.dados(); // Chama o método dados da classe Animal
        System.out.println("Característica: " + caracteristica);
    }
}



