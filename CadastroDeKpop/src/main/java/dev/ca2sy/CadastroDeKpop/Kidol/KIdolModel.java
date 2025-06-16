package dev.ca2sy.CadastroDeKpop.Kidol;
import dev.ca2sy.CadastroDeKpop.Show.ShowModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor //cria automaticamente um construtor com todos os argumentos
@Data //cria automaticamente getters e setters
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


}
