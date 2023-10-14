package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();

		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
	
		Address address = new Address(email, phone);
		Department dept = new Department(name, payDay, address);

		System.out.print("Quantos funcionarios tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionario " + i + ":");
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(name, salary);
			
			employees.add(emp);
		
		}
		
		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.print("Departamento " + dept.getName() + " = " + dept.payroll() + "\n");
		System.out.print("Pagamento realizado no dia " + dept.getPayDay() + "\n");
		System.out.printf("Funcionarios: " + dept.getEmplyoee() + "\n");
		System.out.print("Para duvidas favor entrar em contato: " + dept.getAddress().getEmail());
	
		
	}

}
