import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Imposto: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Funcionário: " + employee);
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = scanner.nextDouble();

        employee.IncreaseSalary(percentage);

        System.out.println("Dados atualizados: " + employee);

        scanner.close();
    }
}
