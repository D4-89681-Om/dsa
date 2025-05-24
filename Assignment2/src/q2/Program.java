package q2;

import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int searchByEmpId(Employee arr[], int empId) {
		int index = -1;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i].getEmployeeId() == empId) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	public static int searchByName(Employee arr[], String name) {
		int index = -1;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i].getName().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}
	

	public static void main(String[] args) {
		Employee arr[] = {
				new Employee(5,"Mukesh", 20000),
				new Employee(10, "Suresh", 10000),
				new Employee(7, "Mahesh", 15000),
				new Employee(3, "Anil", 10000)	
		};
		
		for(Employee e : arr)
			System.out.println(e);
		System.out.println();
		System.out.print("Enter Employee Id : ");
		int id = sc.nextInt();
		System.out.printf("%d employee Id is found at index %d",id, searchByEmpId(arr, id) );
		System.out.println();
		System.out.print("Enter Employee Name : ");
		System.out.print(sc.nextLine());
		String name = sc.nextLine();
		System.out.printf("%s employee name is found at index %d",name, searchByName(arr, name) );
		sc.close();
	}

}
