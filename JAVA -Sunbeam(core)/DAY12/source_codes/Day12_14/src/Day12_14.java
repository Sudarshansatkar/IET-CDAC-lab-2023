import java.util.LinkedList;

class Product
{
	int pid;
	float price;
	
	public Product() 
	{
		super();
	}

	public Product(int pid, float price) {
		super();
		this.pid = pid;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "product [pid=" + pid + ", price=" + price + "]";
	}
	
}
public class Day12_14 {

	public static void main(String[] args) 
	{
		Product p1 = new Product(123,70000);
		Product p2 = new Product(456,90000);
		Product p3 = new Product(789,80000);
		
		LinkedList<Product> l1 = new LinkedList<Product>();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		System.out.println("L1 "+l1);
		
	}

}
