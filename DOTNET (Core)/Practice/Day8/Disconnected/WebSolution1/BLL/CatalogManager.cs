using BOL;
namespace BLL;

//using DAL.Connected;
using DAL.DisConnected;

public class CatalogManager
{
    public List<ProductsDNET> GetAllProducts()
    {

        List<ProductsDNET> allProducts=new List<ProductsDNET>();
        allProducts=DBManager.GetAllProducts();
        return allProducts;

    }


}
