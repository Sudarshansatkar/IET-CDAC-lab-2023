namespace Notifications;

public static class NotificationService
{

    public static void SendSMS(string to, string content)
    {
        Console.WriteLine(to +"  "+content);
    }

    public static void SendEmail(string to, string content)
    {
       Console.WriteLine(to +"  "+content);
    }

    public static void WhatsappMsg(string to, string content)
    {
       Console.WriteLine(to +"  "+content);
    
    }

}



