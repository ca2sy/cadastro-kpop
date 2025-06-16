package dev.ca2sy.CadastroDeKpop.Show;
import dev.ca2sy.CadastroDeKpop.Kidol.KIdolModel;
import jakarta.persistence.*;


@Entity
@Table (name = "tb_shows")
public class ShowModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String pais;

    @OneToMany (mappedBy = "show") //chave estrangeira: conectei relacionamento
    private KIdolModel cantor;

    public ShowModel(String nome, String pais){
        this.nome = nome;
        this.pais = pais;
    }

    public KIdolModel getCantor() {
        return cantor;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public void setCantor(KIdolModel cantor) {
        this.cantor = cantor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
