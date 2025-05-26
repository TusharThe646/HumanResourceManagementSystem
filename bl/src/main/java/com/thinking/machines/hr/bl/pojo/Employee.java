package com.thinking.machines.hr.bl.pojo;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.enums.*;
import java.util.*;
import java.math.*;
public class Employee implements EmployeeInterface
{
private String name;
private String employeeId;
private DesignationInterface designation;
private BigDecimal basicSalary;
private boolean isIndian;
private  Date dateOfBirth;
private String panNumber;
private String aadharCardNumber;
private char gender;

public Employee()
{
this.name="";
this.employeeId="";
this.designation=null;
this.basicSalary=null;
this.isIndian=false;
this.dateOfBirth=null;
this.panNumber="";
this.aadharCardNumber="";
this.gender=' ';
}
public void setName(java.lang.String name)
{
this.name=name;
}
public java.lang.String getName()
{
return this.name;
}
public void setEmployeeId(java.lang.String employeeId)
{
this.employeeId=employeeId;
}
public java.lang.String getEmployeeId()
{
return this.employeeId;
}
public void setDesignation(DesignationInterface designation)
{
this.designation=designation;
}
public DesignationInterface getDesignation()
{
return this.designation;
}
public void setBasicSalary(java.math.BigDecimal basicSalary)
{
this.basicSalary=basicSalary;
}
public java.math.BigDecimal getBasicSalary()
{
return this.basicSalary;
}
public void setIsIndian(boolean isIndian)
{
this.isIndian=isIndian;
}
public boolean getIsIndian()
{
return this.isIndian;
}
public void setDateOfBirth(java.util.Date dateOfBirth)
{
this.dateOfBirth=dateOfBirth;
}
public java.util.Date getDateOfBirth()
{
return this.dateOfBirth;
}
public void setPANNumber(java.lang.String panNumber)
{
this.panNumber=panNumber;
}
public java.lang.String getPANNumber()
{
return this.panNumber;
}
public void setAadharCardNumber(java.lang.String aadharCardNumber)
{
this.aadharCardNumber=aadharCardNumber;
}
public java.lang.String getAadharCardNumber()
{
return this.aadharCardNumber;
}
public void setGender(GENDER gender)
{
if(gender==GENDER.MALE) this.gender='M';
else this.gender='F';
}
public char getGender()
{
return this.gender;
}
public boolean equals(Object other)
{
if(!(other instanceof EmployeeInterface)) return false;
EmployeeInterface employee=(EmployeeInterface)other;
return this.employeeId.equalsIgnoreCase(employee.getEmployeeId());
}
public int compareTo(EmployeeInterface other)
{
return this.employeeId.compareToIgnoreCase(other.getEmployeeId());
}
public int hashCode()
{
return this.employeeId.toUpperCase().hashCode();
}






} 