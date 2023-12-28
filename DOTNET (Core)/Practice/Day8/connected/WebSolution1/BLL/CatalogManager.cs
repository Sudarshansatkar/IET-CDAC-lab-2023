using BOL;
namespace BLL;

using DAL.Connected;

public class CatalogManager
{
    public List<ProductsDNET> GetAllProducts()
    {

        List<ProductsDNET> allProducts=new List<ProductsDNET>();
        allProducts=DBManager.GetAllProducts();
        return allProducts;

    }


}
