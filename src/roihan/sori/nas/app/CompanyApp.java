package roihan.sori.nas.app;

import roihan.sori.nas.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Roihan Sori");

        Company.Employee employee = company.new Employee();
        employee.setName("Bang");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Test 1");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Test 2");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
