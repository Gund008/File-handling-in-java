import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//write a java Program to accept file name from user and open that file and display the Contents on screen



class DisplayFile
{
    public static void main(String arg[]) {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the File name:");
        String str=sobj.nextLine();

        Display dobj;
        dobj=new Display();

        dobj.Display_Content(str);
    }
}
class Display
{

    public void Display_Content(String Filename) {

        try  {
            FileReader fobj = new FileReader(Filename);
            int i=0;
            while((i=fobj.read())!=-1)
            {
                System.out.print((char)i);
            }
            }


        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       
    }
}
