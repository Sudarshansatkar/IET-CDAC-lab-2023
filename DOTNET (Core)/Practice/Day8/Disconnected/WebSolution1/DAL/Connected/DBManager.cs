using BOL;
namespace DAL.Connected;

using MySql.Data.MySqlClient;


public class DBManager
{

    public static string conString=@"server=Localhost;port=3306;user=root; password=Kundalik@1992;database=dotnet";

    public static List<ProductsDNET> GetAllProducts()
    {

        List<ProductsDNET> allProducts =new List<ProductsDNET>();
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=conString;
        string query="Select * from ProductsDNET";

        try
        {
            con.Open();
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection=con;
            cmd.CommandText=query;
            MySqlDataReader reader=cmd.ExecuteReader();

            while(reader.Read())
            {
                int id=int.Parse(reader["product_id"].ToString());
                string title=reader["product_title"].ToString();
                string description=reader["description"].ToString();
                double price=double.Parse((reader["price"]).ToString());

                ProductsDNET pro1=new ProductsDNET();
              
                    pro1.ID=id;
                    pro1.Title=title;
                    pro1.Description=description;
                    pro1.Price=price;
                    allProducts.Add(pro1);
            
           
        }
         reader.Close();
        }

            catch(Exception ee)
            {
                Console.WriteLine(ee.Message);
            }
            finally{
                    con.Close();
            }

            return allProducts;




        }


        public static List<EmpDNET> GetAllEMP()
    {

        List<EmpDNET> allEmp =new List<EmpDNET>();
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=conString;
        string query="Select * from empdnet";

        try
        {
            con.Open();
            MySqlCommand cmd = new MySqlCommand();
            cmd.Connection=con;
            cmd.CommandText=query;
            MySqlDataReader reader=cmd.ExecuteReader();

            while(reader.Read())
            {
                int id=int.Parse(reader["id"].ToString());
                string title=reader["name"].ToString();
               

                EmpDNET emp1=new EmpDNET();
              
                    emp1.Id=id;
                    emp1.Ename=title;
                  
                    allEmp.Add(emp1);
            
           
        }
         reader.Close();
        }

            catch(Exception ee)
            {
                Console.WriteLine(ee.Message);
            }
            finally{
                    con.Close();
            }

            return allEmp;




        }


} 








