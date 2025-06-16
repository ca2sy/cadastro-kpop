package dev.ca2sy.CadastroDeKpop.Kidol;

import java.util.List;

import dev.ca2sy.CadastroDeKpop.Show.ShowModel;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_cadastro")
public class KIdolModel { //classe é um modelo pra um objeto
   
    //parei: preciso transformar classe em entidade, baixar dependencia
    //para isso, JPA com @Entity
    //Entity transforma classes em entidades do banco de dados

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //id cresce muito, melhor usar long
    private String nome;
    private String email;
    private int idade;
    @ManyToOne 
    @JoinColumn(name = "shows_id") //chave estrangeira
     private ShowModel show;

    
    public KIdolModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //preciso transformar isso em uma tabela que vai pro banco de dados! isso que significa criar entidades
}
