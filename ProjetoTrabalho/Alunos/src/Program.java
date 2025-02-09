import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String name = scanner.nextLine();
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        Student student = new Student(name, nota1, nota2, nota3);

        System.out.println(student);

        scanner.close();
    }
}
