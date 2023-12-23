namespace Banking1;

public class Account
{

    public event NotificationOperation underBalance;
    public event TaxationOperation overBalance;
    public float Balance{get;set;}
    
    public void Deposit(float amount)
    {
        this.Balance=this.Balance+amount;
        if(this.Balance >= 250000)
        {
            // your event fired
            overBalance(5000);

        }
    }

    public void  Withdraw(float amount)
    {
        this.Balance=this.Balance-amount;
        if(this.Balance < 10000)
        {

            //Everd Fired
            underBalance("SKS","Your account is blocked");

        }
    }


}
