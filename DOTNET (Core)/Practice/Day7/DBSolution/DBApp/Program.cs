using System.Data;
using MySql.Data.MySqlClient;
Console.WriteLine("Welcome to database App");


MySqlConnection connection = new MySqlConnection();
connection.ConnectionString ="server=192.168.10.150;port=3306;user=dac25;password=welcome;database=dac25";


 //string query ="select * from productsDNET";
//string query="select count(*) from productsDNET";
//Console.WriteLine("Enter the id of product to be deleted:");
//int id=int.Parse(Console.ReadLine());

//Console.WriteLine("Enter the description of product to be deleted:");
//string description=Console.ReadLine();

//string query="update productsDNET set product_title='iPhone' where product_id=2";



//Parameterized Query


// string query="delete from productsDNET where product_id=@id";
//string query="delete from productsDNET where description=@description";


//command.Parameters.AddWithValue("@id",id);

//command.Parameters.AddWithValue("@description",description);
//To invoke Stored Procedure
string query="Insert1";
MySqlCommand command = new MySqlCommand(query, connection);
command.CommandType=CommandType.StoredProcedure;
//command.CommandText="Display";

try{
    connection.Open();
 MySqlDataReader reader=command.ExecuteReader();
   while(reader.Read()){
        int id=int.Parse(reader["product_id"].ToString());
      string title=reader["product_title"].ToString();
        string description=reader["description"].ToString();
       double price= double.Parse(reader["price"].ToString());
        Console.WriteLine(id+ " "+ title+ " "+ description+" "+price);
     }
    reader.Close();
    


   command.ExecuteNonQuery();
   //int count=int.Parse((command.ExecuteScalar()).ToString());
  // Console.WriteLine( " Number of products available for sale "+ count);
   

}
catch(Exception e){
    Console.WriteLine(e.Message);
}
finally{
    connection.Close();
}