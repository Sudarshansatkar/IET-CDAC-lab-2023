namespace DAL.DisConnected;
using BOL;
using System.Data;
using MySql.Data.MySqlClient;
public class DBManager{

   public static string conString=@"server=Localhost;port=3306;user=root; password=Kundalik@1992;database=dotnet";       
    public  static List<ProductsDNET> GetAllProducts(){
        List<ProductsDNET> allProducts=new List<ProductsDNET>();
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=conString;
        try{
            DataSet ds=new DataSet();  //empty data set
            MySqlCommand cmd=new MySqlCommand();
            cmd.Connection=con;
            string query="SELECT * FROM productsdnet";
            cmd.CommandText=query;
            //disconnected Data Access logic
            MySqlDataAdapter da=new MySqlDataAdapter();
            da.SelectCommand = cmd;
            da.Fill(ds);  // this method would fetch data from backend mysql and 
                          //fill results into dataset collection
                          //deal with data which has been fetched from back end
            
            DataTable dt=ds.Tables[0];
            DataRowCollection rows=dt.Rows;
            foreach( DataRow row in rows)
            {
                int id = int.Parse(row["product_id"].ToString());
                string title = row["product_title"].ToString();
                string description = row["description"].ToString();
                double price =double.Parse(row["price"].ToString());
                ProductsDNET pro1=new ProductsDNET();
              
                    pro1.ID=id;
                    pro1.Title=title;
                    pro1.Description=description;
                    pro1.Price=price;
                    allProducts.Add(pro1);
            }
            
        }
        catch(Exception ee){
                Console.WriteLine(ee.Message);
        }
        return allProducts;
    }

}
