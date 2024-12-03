package Challenges11;

public class SampleEmployee {
    private String employeeName;
    private String employeeID;
    private double employeeSalary;
    public SampleEmployee(String employeeName, String employeeID, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    String displayAccountDetails(){
        return "Employee Name: "+getEmployeeName()+
                " Employee ID: "+getEmployeeID()
                +" Employee Salary: "+getEmployeeSalary();
    }
}
