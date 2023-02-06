import java.io.FileOutputStream;    
public class Resources{    
public static void main(String args[])
{      
         
try(FileOutputStream fileOutputStream =newFileOutputStream("/java7-new-features/src/abc.txt"))
{      
String msg = "welcome";      
byte byteArray[] = msg.getBytes();      
fileOutputStream.write(byteArray);  
System.out.println("successfuly!");      
}
catch(Exception exception)
{  
System.out.println(exception);  
}      
}      
}    