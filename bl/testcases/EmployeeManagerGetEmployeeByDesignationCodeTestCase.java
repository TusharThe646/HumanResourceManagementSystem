import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.enums.*;
import java.util.*;
import java.text.*; // Import SimpleDateFormat

class EmployeeManagerGetEmployeeByDesignationCodeTestCase
{
public static void main(String gg[])
{
try
{
int designationCode = 3; 
            
EmployeeManagerInterface employeeManager = EmployeeManager.getEmployeeManager();
Set<EmployeeInterface> employees = employeeManager.getEmployeesByDesignationCode(designationCode);
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
            
if (employees.isEmpty())
{
System.out.println("No employees found for designation code: " + designationCode);
}
else
{
System.out.println("Employees with designation code " + designationCode + ":");
for (EmployeeInterface employee : employees) 
{
System.out.println("Employee ID: " + employee.getEmployeeId());
System.out.println("Name: " + employee.getName());
System.out.println("Date Of Birth: " + simpleDateFormat.format(employee.getDateOfBirth()));
System.out.println("Designation: " + employee.getDesignation().getTitle());
System.out.println("Gender: " + (employee.getGender() == 'M' ? "Male" : "Female"));
System.out.println("Is Indian: " + employee.getIsIndian());
System.out.println("Basic Salary: " + employee.getBasicSalary());
System.out.println("PAN Number: " + employee.getPANNumber());
System.out.println("Aadhar Card Number: " + employee.getAadharCardNumber());
System.out.println("-----------------------------------");
}
}
}catch (BLException blException)
{
if (blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
List<String> properties = blException.getProperties();
for (String property : properties)
{
System.out.println(blException.getException(property));
}
}
}
}
