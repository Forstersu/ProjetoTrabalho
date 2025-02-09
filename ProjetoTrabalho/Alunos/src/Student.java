public class Student {
    private String name;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String name, double nota1, double nota2, double nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculaNF() {
        return nota1 + nota2 + nota3;
    }

    public boolean checaAprovacao() {
        return calculaNF() >= 60.0;
    }

    public double calculaPF() {
        return checaAprovacao() ? 0.0 : 60.0 - calculaNF();
    }

    @Override
    public String toString() {
        return String.format("NOTA FINAL = %.2f%n%s", calculaNF(),
                checaAprovacao() ? "PASS" : String.format("FAILED%nFALTARAM %.2f PONTOS", calculaPF()));
    }
}
