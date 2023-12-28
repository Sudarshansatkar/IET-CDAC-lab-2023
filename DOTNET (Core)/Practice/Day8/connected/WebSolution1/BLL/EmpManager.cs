using BOL;
using DAL.Connected;
namespace BLL;

public class EmpManager
{
    public List<EmpDNET> GetAllEMP()
    {

        List<EmpDNET> allEMP=new List<EmpDNET>();
        allEMP=DBManager.GetAllEMP();
        return allEMP;

    }




}