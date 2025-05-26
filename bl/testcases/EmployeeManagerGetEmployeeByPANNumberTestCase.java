import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.enums.*;
import java.util.*;
import java.text.*;
import java.math.*;

class EmployeeManagerGetEmployeeByPANNumberTestCase
{
public static void main(String gg[])
{
try
{
EmployeeManagerInterface employeeManager;
employeeManager = EmployeeManager.getEmployeeManager();
            
String panNumber = "GRD62613V35"; // Replace with an existing Aadhar number
EmployeeInterface employee = employeeManager.getEmployeeByPANNumber(panNumber);
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
String formattedDateOfBirth = sdf.format(employee.getDateOfBirth());
            
System.out.println("Employee Details:");
System.out.println("ID: " + employee.getEmployeeId());
System.out.println("Name: " + employee.getName());
System.out.println("Designation: " + employee.getDesignation().getTitle());
System.out.println("Date of Birth: " + formattedDateOfBirth);
System.out.println("Gender: " + employee.getGender());
System.out.println("Indian: " + employee.getIsIndian());
System.out.println("Basic Salary: " + employee.getBasicSalary());
System.out.println("PAN Number: " + employee.getPANNumber());
System.out.println("Aadhar Card Number: " + employee.getAadharCardNumber());
}
catch (BLException blException)
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
