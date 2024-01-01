namespace DAL;
using BOL;
using MySql.Data.MySqlClient;

public class DBManager
{
    
    public List<Product> GetAllProducts()
    {
    List<Product> lp = new List<Product>();
        
    MySqlConnection conn = new MySqlConnection();
    conn.ConnectionString ="server=192.168.10.150;port=3306;user=dac25;password=welcome;database=dac25";
    string query ="select * from productDNET";

    MySqlCommand command = new MySqlCommand(query, conn);

conn.Open();

try
{
    MySqlDataReader reader=command.ExecuteReader();
    while(reader.Read()){
       int i=int.Parse(reader["pid"].ToString());
       string nm=reader["pname"].ToString();
       int pr=int.Parse(reader["price"].ToString());
       Product p = new Product{id=i,name=nm,price=pr};
       lp.Add(p);
}
    reader.Close();

}

catch(Exception e){
    Console.WriteLine(e.Message);
}
finally{
    conn.Close();
} 
return lp;
    }





    public void Signupuser(string email,string user,string pass)
    {
    MySqlConnection conn = new MySqlConnection();
    conn.ConnectionString ="server=192.168.10.150;port=3306;user=dac30;password=welcome;database=dac30";
    string query ="insert into login(username,emailid,password)"+"values('"+user+"','"+email+"','"+pass+"')";

    MySqlCommand command = new MySqlCommand(query, conn);

conn.Open();

try
{
command.ExecuteNonQuery();

}

catch(Exception e){
    Console.WriteLine(e.Message);
}
finally{
    conn.Close();
} 

    }

    public bool LoginUser(string user,string pass)
    {
        MySqlConnection conn = new MySqlConnection();
    conn.ConnectionString ="server=192.168.10.150;port=3306;user=dac30;password=welcome;database=dac30";
    string query ="select * from login where username='"+user+"' "+"and"+" "+"password='"+pass+"'";
    bool status = false;
    MySqlCommand command = new MySqlCommand(query, conn);

    conn.Open();

    try
{

MySqlDataReader reader=command.ExecuteReader();
while(reader.Read()){
if(reader != null)
{
    Console.WriteLine(reader["username"].ToString());
    status=true;
    return status;
}
}

}

catch(Exception e){
    Console.WriteLine(e.Message);
}
finally{
    conn.Close();
} 

return false;
    }
    }

