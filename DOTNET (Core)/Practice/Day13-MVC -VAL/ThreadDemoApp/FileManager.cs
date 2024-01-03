namespace Utility;
using System.IO;

public class FileIOManager{

     public  void ReadData( ){
        string data =File.ReadAllText(@"C:\Users\IET\Desktop\Sudarshan&Yogita\10).NET\fruits.json");

     }

    public void WriteData(){
        string data=" ";
        File.WriteAllText(@"C:\Users\IET\Desktop\Sudarshan&Yogita\10).NET\fruits.json",data);

    }
}