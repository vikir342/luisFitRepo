public class Treinador extends Pessoa {
    private String especialidade;

    public Treinador(int id, String nome, int idade, String especialidade) {
        super(id, nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}