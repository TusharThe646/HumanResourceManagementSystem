import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
public class DesignationTitleExistsTestCase
{
public static void main(String gg[])
{
String title=gg[0];   
try
{
DesignationDAOInterface designationDAO;
designationDAO=new DesignationDAO();
System.out.printf(title + " exists : "+designationDAO.titleExists(title));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}

































