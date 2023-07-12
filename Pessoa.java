
public class Pessoa {

    private String nome;
    private int idade = 0;
    private int telefone = 0;

    public void lerNome() {
        this.nome = "Assiria";
        System.out.println(nome);
    }

    public void lerIdade() {
        this.idade = 26;
        System.out.println(idade);
    }
    
    public void lerTelefone() {
        this.telefone = 12345678;
        System.out.println(telefone);
    }
}