package constructor;

public class ConstructorProg {
    private String nomeCurso;

    public ConstructorProg(String nome)
    {
        nomeCurso = nome;
    }

    public String getNome()
    {
        return "Nome co Curso retornado " +nomeCurso;
    }
}
