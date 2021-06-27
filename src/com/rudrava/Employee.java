package com.rudrava;

public class Employee {
        private String name;
        private String address;
        private String department;
        private String designation;
        private double salary;

        public void getDetails() {
            System.out.println("name: " + this.name  +"\naddress: " + this.address + "\ndepartment: " + this.department + "\ndesignation" + this.designation + "\nsalary " + (this.salary) + "\n----------" );
        }

        public Employee(String name,String address, String department, String designation,  double salary){
            this.name = name;
            this.address = address;
            this.department = department;
            this.designation = designation;
            this.salary = salary;
        }
    public static void main(String[] args){
        Employee[] employees = new Employee[10];
        for (int i = 0; i<= employees.length - 1; i++) {
            employees[i] = new Employee("Rudrava", "Siliguri", "Develeper", "Junior",Math.round(Math.random() * 100000));
        }
        double maxSalary = 0, minSalary = employees[0].salary;
        for ( Employee employee :
             employees) {
            employee.getDetails();
           maxSalary = employee.salary > maxSalary ? employee.salary:maxSalary;
           minSalary = employee.salary < minSalary ? employee.salary : minSalary;
         }
        System.out.println("Max salary: " + maxSalary);
        System.out.println("Min salary: " + minSalary);
    }
}

