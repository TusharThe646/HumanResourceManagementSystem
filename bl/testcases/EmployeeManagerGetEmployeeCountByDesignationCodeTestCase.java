import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.exceptions.*;
import java.util.*;

class EmployeeManagerGetEmployeeCountByDesignationCodeTestCase
{
public static void main(String gg[]) 
{
try
{
int designationCode = 6;
            
EmployeeManagerInterface employeeManager = EmployeeManager.getEmployeeManager();
int count = employeeManager.getEmployeeCountByDesignationCode(designationCode);
System.out.println("Number of employees with designation code " + designationCode + ": " + count);
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
