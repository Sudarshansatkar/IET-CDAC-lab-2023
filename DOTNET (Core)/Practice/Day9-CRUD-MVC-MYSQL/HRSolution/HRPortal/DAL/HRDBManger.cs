using HRPortal.Models;
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
                string title=reader["name"].ToString();
               

                Employee emp1=new Employee();
              
                    emp1.Id=id;
                    emp1.Name=title;
                  
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


        //////////////INSERT EMPLOYEEEE
        ///
 public static bool Insert(Employee emp)         //insertion of employee table data 
    {
        bool status = false;
        MySqlConnection con = new MySqlConnection();
        con.ConnectionString = conString;
        try
        {
            string query = "Insert into EMPDNET (id,name) Values( '" + emp.Id + "','"
            + emp.Name +"')";
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
            string query = "UPDATE EMPDNET SET name='" + emp.Name + "' WHERE id=" + emp.Id;
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
