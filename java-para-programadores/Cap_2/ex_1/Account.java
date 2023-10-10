public class Account {
    private String name; // declarado uma variável to tipo string de escopo privado, só pode ser acessível aos métodos declarados nesta classe

    public void setName(String name) // passagem de parâmetros? método void não retornará nenhema informação ao seu chamador, este método apenas armazena dados
    {
        this.name = name;
    }

    public String getName() // o tipo de dado retornado ao chamador será uma string, método que retorna string
    {
        return name;
    }

}
