// Classe Student que armazena o nome e a média do aluno
public class Student
{
    private String name;
    private double average;

    //construtor inicializa variáveis de instância
    public Student(String name, double average)
    {
        this.name = name;

        //armazena a média apenas se o valor estiver dentro do padrão permitido
        if (average > 0.0)
        {
            if (average <= 100.0)
            {
                this.average = average;
            }
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    // define a média de Student
    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
        {
            if (average <= 100.0)
            {
                this.average = average;
            }
        }
    }

    public double getAverage()
    {
        return average;
    }

    // determina e retorna a letra da nota de Student
    public String getLetterGrade()
    {
        String letterGrade = "";

        if (average >= 90.0)
        {
            letterGrade = "A";
        } else if (average >= 80.0)
        {
            letterGrade = "B";
        } else if (average >= 70.0)
        {
            letterGrade = "C";
        } else if (average >= 60.0)
        {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }
    
}
