//write a program to Accept file from user and create new File of that name if it is not existing.

import java.lang.*;
import java.io.*;
import java.util.*;

class Create_File
{
  public static void main(String  arg[]) {

    Scanner sobj=new Scanner(System.in);

    System.out.println("Enter the File name:");
    String str=sobj.nextLine();

    Create cobj;  //refrence
    cobj=new Create();

    cobj.CreateFile(str); 

  }
}

////////////////////////////////////////////////////////////////////////////

class Create
{
  //Business Logic
public void CreateFile(String Filename) {

  File fobj=new File(Filename);

  try
  {
  if(fobj.createNewFile()==true)
 {
   System.out.println("File created:"+fobj.getName());
 }
 else
 {
  System.out.println("File is Already exist");
 }  
}
catch(IOException e)
{
  System.out.println();
}
}
}
