public class Cliente {
    String nome;
    int idade;

    public Cliente(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return   nome +", "+ idade + "anos";
    }
}
