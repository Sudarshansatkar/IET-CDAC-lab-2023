using Taxation;
using Notifications;
using Banking1;


Console.WriteLine("Delegates / Synchronous call / Asynchronous Call / C# Events");


Account acc=new Account();

NotificationService.SendSMS("SKS","sms about salary");
TaxationService.PayIncomeTax(5000);


TaxationOperation ds=new TaxationOperation(TaxationService.PayServiceTax);
ds(3900);
//dsa.Invoke(5400);   // SYNCHRNOUS

TaxationOperation ds1=new TaxationOperation(TaxationService.PayIncomeTax);
TaxationOperation ds2=new TaxationOperation(TaxationService.PaysalesTax);
TaxationOperation ds3=new TaxationOperation(TaxationService.PayGSTTax);

TaxationOperation proxy=null;

proxy+=ds;
proxy+=ds1;
proxy+=ds2;
proxy+=ds3;

proxy.Invoke(5400);

Console.WriteLine("---------------------------------------------------------------------------");


Account eve1=new Account();

eve1.overBalance+= TaxationService.PayIncomeTax;
eve1.overBalance+= TaxationService.PayGSTTax;


eve1.underBalance+= NotificationService.SendSMS;
eve1.underBalance+= NotificationService.SendEmail;

eve1.underBalance+= NotificationService.WhatsappMsg;

eve1.Balance=167000;
//eve1.Withdraw(166000);

eve1.Deposit(450000);
