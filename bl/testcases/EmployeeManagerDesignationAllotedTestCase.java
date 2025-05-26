import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.exceptions.*;
import java.util.*;

class EmployeeManagerDesignationAllotedTestCase 
{
public static void main(String gg[])
{
try
{
int designationCode = 6; 
            
EmployeeManagerInterface employeeManager = EmployeeManager.getEmployeeManager();
boolean isAlloted = employeeManager.designationAlloted(designationCode);
            
if (isAlloted) 
{
System.out.println("Designation code " + designationCode + " is allotted to employees.");
} 
else 
{
System.out.println("Designation code " + designationCode + " is not allotted to any employee.");
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
