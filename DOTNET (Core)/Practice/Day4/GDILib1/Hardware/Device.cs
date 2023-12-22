namespace hardware;

public class Device: IPrinter,IScanner
{
    public void Print()
    {
        Console.WriteLine("Printer is started");
    }

    public void Scan()
    {
        Console.WriteLine("Scanner is started");
    }
}

