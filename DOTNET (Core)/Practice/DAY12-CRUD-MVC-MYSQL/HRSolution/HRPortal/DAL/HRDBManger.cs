using BOL;
using MySql.Data.MySqlClient;
namespace DAL;
public static class HRDBManager
{
    public static string conString=@"server=192.168.10.150;port=3306;user=dac25; password=welcome;database=dac25";

public static List<Employee> GetAllEMP()
    {

        List<Employee> allEmp =new List<Employee>();
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
                string title=reader["username"].ToString();
               

                Employee emp1=new Employee();
              
                    emp1.Id=id;
                    emp1.username=title;
                  
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



    public static bool RegisterEMP(Employee emp)
    {
        bool status=false;
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=conString;

        try{
            
            string query="Insert into empdnetREG (username,password) values( '"+emp.username+ "','"+emp.Password+"')";
            MySqlCommand cmd=new MySqlCommand(query,con);
            con.Open();
            cmd.ExecuteNonQuery();

            return true;
        }
        catch(Exception e)
        {
            throw e;
        }
        finally
        {
            con.Close();
        }

        return status;

    }

///Validate Emp

    public static bool ValidateEmp(Employee e)
    {
        bool status=false;
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=conString;
        string query="Select * from empdnetreg where username=('"+e.username+"') and password=('"+e.Password+"')";
    
        MySqlCommand command = new MySqlCommand(query, con);
       try{
            con.Open();

            MySqlDataReader reader=command.ExecuteReader();

           while(reader.Read())
           {
            if(reader != null)
            {
                Console.WriteLine(reader["username"].ToString());
                status=true;
                return status;
            }
           
           }
           reader.Close();
       }
       catch(Exception e1)
         {
             Console.WriteLine(e1.Message);
        }
        finally
        {
            con.Close();
        } 

        return false;
     }



        //////////////INSERT EMPLOYEEEE
       
 public static bool Insert(Employee emp)         //insertion of employee table data 
    {
        bool status = false;
        MySqlConnection con = new MySqlConnection();
        con.ConnectionString = conString;
        string query = "Insert into EMPDNET (id,username) Values( '" + emp.Id + "','"
            + emp.username + "')";
        try
        {
            
            MySqlCommand cmd = new MySqlCommand(query, con);
            con.Open();
            cmd.ExecuteNonQuery();

            status = true;
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            con.Close();
        }
        return status;

    }


    public static bool Update(Employee emp)
    {
        bool status = false;
        MySqlConnection con = new MySqlConnection();
        con.ConnectionString = conString;
        try
        {
            string query = "UPDATE EMPDNET SET name='" + emp.username + "' WHERE id=" + emp.Id;
            MySqlCommand command = new MySqlCommand(query, con);
            con.Open();
            command.ExecuteNonQuery();
            status = true;
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            con.Close();
        }
        return status;
    }


    ///////////////////////DELETE EMPLOYEE
    ///
     public static bool Delete(Employee emp)                  //delete employee table data
    {
        bool status = false;
        MySqlConnection con = new MySqlConnection();
        con.ConnectionString = conString;

        try
        {
            string query = " DELETE FROM EMPDNET WHERE id =" + emp.Id;
            MySqlCommand cmd = new MySqlCommand(query, con);
            con.Open();
            cmd.ExecuteNonQuery();
              status = true;
        }
        catch (Exception ee)
        {
            throw ee;
        }
        finally
        {
            con.Close();
        }
        return status;
    }

}


















    // public static  List<Employee> GetAllEmployees(){
    //     List<Employee> employees=new List<Employee>();
    //     employees.Add(new Employee{Id=23,Name="SachinTendulkar"});
    //     employees.Add(new Employee{Id=24,Name="SunilGavaskar"});
    //     employees.Add(new Employee{Id=56, Name="SachinPatil"});
    //     employees.Add(new Employee{Id=33,Name="JeevanSharma"});
    //     employees.Add(new Employee{Id=99,Name="RajKumar"});
    //     return employees;
    // }
