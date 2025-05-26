import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import com.thinking.machines.enums.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerAddTestCase
{
public static void main(String gg[])
{
try
{
String name="Rahul Patle";
DesignationInterface designation=new Designation();
designation.setCode(3);
String dateString = "6/2/1999";
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Date dateOfBirth = dateFormat.parse(dateString); 
boolean isIndian=true;
BigDecimal basicSalary=new BigDecimal("5000000");
String panNumber="GRD62613V35";
String aadharCardNumber="21963212399320";
EmployeeInterface employee;
employee=new Employee();
employee.setName(name);
employee.setDesignation(designation);
employee.setDateOfBirth(dateOfBirth);
employee.setGender(GENDER.MALE);
employee.setIsIndian(isIndian);
employee.setBasicSalary(basicSalary);
employee.setPANNumber(panNumber);
employee.setAadharCardNumber(aadharCardNumber);
EmployeeManagerInterface employeeManager;
employeeManager=EmployeeManager.getEmployeeManager();
employeeManager.addEmployee(employee);
System.out.printf("Employee added with employee Id. %s\n",employee.getEmployeeId());

}catch(ParseException e)
{
System.out.println(e.getMessage());
}
catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
List<String> properties=blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}

}
}
}