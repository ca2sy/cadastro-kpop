package dev.ca2sy.CadastroDeKpop.Show;
import dev.ca2sy.CadastroDeKpop.Kidol.KIdolModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table (name = "tb_shows")
@AllArgsConstructor //cria automaticamente um construtor com todos os argumentos
@Data //cria automaticamente getters e setters
public class ShowModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String pais;

    @OneToMany (mappedBy = "show") //chave estrangeira: conectei relacionamento
    private KIdolModel cantor;


}
