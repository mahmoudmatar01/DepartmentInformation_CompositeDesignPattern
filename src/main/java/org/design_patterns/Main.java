package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create three employees
        OrganizationUnit mahmoud = new Employee(1,"mahmoud",12300);
        OrganizationUnit ahmed = new Employee(2,"ahmed",43000);
        OrganizationUnit ziad = new Employee(3,"ziad",256000);

        // create first department
        Department devOopsDepartment = new Department();
        devOopsDepartment.addOrganizationUnit(mahmoud);
        devOopsDepartment.addOrganizationUnit(ahmed);
        double totalDevOopSalary = devOopsDepartment.calculateTotalPrice();
        System.out.println(totalDevOopSalary);

        System.out.println("-------------------------------------");

        // create second department with its sub department
        Department backendDepartment = new Department();
        backendDepartment.addOrganizationUnit(ziad);
        backendDepartment.addOrganizationUnit(devOopsDepartment);
        double totalBackendDepartmentSalary = backendDepartment.calculateTotalPrice();
        System.out.println(totalBackendDepartmentSalary);


    }
}