import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    public List<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        contaList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }
}
