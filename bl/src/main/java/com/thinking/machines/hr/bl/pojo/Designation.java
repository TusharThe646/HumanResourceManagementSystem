package com.thinking.machines.hr.bl.pojo;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
public class Designation implements DesignationInterface
{
private String title;
private int code;
public Designation()
{
this.title=null;
this.code=0;
}
public void setTitle(String title)
{
this.title=title;
}
public String getTitle()
{
return this.title;
}
public void setCode(int code)
{
this.code=code;
}
public int getCode()
{
return this.code;
}
public int hashCode()
{
return code;
}
public boolean equals(Object object)
{
if(!(object instanceof DesignationInterface)) return false;
DesignationInterface designation=(DesignationInterface)object;
return this.code==designation.getCode();
}
public int compareTo(DesignationInterface designation)
{
return this.code-designation.getCode();
}

}