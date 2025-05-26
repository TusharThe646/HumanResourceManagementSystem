import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.enums.*;
import java.util.*;
import java.text.*;
import java.math.*;
public class EmployeeManagerGetEmployeesTestCase 
{
public static void main(String gg[]) 
{
try 
{
EmployeeManagerInterface employeeManager = EmployeeManager.getEmployeeManager();
Set<EmployeeInterface> employees = employeeManager.getEmployees();
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
for (EmployeeInterface employee : employees)
{
System.out.println("Employee Id : " + employee.getEmployeeId());
System.out.println("Name : " + employee.getName());
System.out.println("Designation Code : " + employee.getDesignation().getCode());
System.out.println("Designation Title : " + employee.getDesignation().getTitle());
System.out.println("Date Of Birth : " + simpleDateFormat.format(employee.getDateOfBirth()));
System.out.println("Gender : " + (employee.getGender() == 'M' ? "Male" : "Female"));
System.out.println("Is Indian : " + employee.getIsIndian());
System.out.println("Basic Salary : " + employee.getBasicSalary().toPlainString());
System.out.println("PAN Number : " + employee.getPANNumber());
System.out.println("Aadhar Card Number : " + employee.getAadharCardNumber());
System.out.println("***************************************************");
}
} catch (BLException blException)
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




