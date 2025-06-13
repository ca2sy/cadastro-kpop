

public class KIdolModel { //classe é um modelo pra um objeto
   
    //parei: preciso transformar classe em entidade, baixar dependencia

    Long id; //id cresce muito, melhor usar long
    String nome;
    String email;
    int idade;
    
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
