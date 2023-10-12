public class Account {
    private String name; // declarado uma variável to tipo string de escopo privado, só pode ser acessível aos métodos declarados nesta classe

    public void setName(String name) // variável iniciada e passada como parâmetro | atribui o valor de parâmetro main a variável de instância da classe | possuí o valor padão null
    {
        // variável local simulando uma variável de instância no corpo do método
        // this referência a variável de instância simulada explicitamente, poderia ser criado uma segunda variável antes de vazer uma atribuição para evitar o uso do this
        this.name = name;
    }

    public String getName() // o tipo de dado retornado ao chamador será uma string, método que retorna string
    {
        return name;
    }

}
