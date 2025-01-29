package examples;
import java.io.File;
class FileOutExample
{
public static void main(String[] args)
{
File f1=new File("fileOut");
f1.mkdir();
File f2=new File("fileout\\Welcome.txt");
f2.createNewFile();
FileOutputStream fos=new FileOutputStream(f2);
String s="Welcome to Java Files";
byte output[]=s.getBytes();
fos.write(output);
fos.flush();
fos.close();
}
}