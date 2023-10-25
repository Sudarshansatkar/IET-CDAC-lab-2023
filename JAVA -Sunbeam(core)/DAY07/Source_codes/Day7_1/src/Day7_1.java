enum Color
{
	RED,GREEN,BLUE; // 0  ,  1   , 2 
}
public class Day7_1 {

	public static void main(String[] args) 
	{
		Color value = Color.RED;
		System.out.println("ordinal for red = "+value.ordinal()+" Name = "+value.name());
		
		value = Color.GREEN;
		System.out.println("ordinal for green = "+value.ordinal()+" Name = "+value.name());
		
		value = Color.BLUE;
		System.out.println("ordinal for blue = "+value.ordinal()+" Name = "+value.name());
				
	
		Color cval = Color.valueOf("RED");
		System.out.println("CVAL = "+cval);
		
		
		Color arr[] = Color.values();
		//for(Color clr : arr)
			//System.out.println(clr.name() + "\t"+ clr.ordinal());
		
		int position = arr[0].ordinal();
		String str = arr[0].name();
		System.out.println("Position = "+position +" Str = "+str);
		
		
		
	}

}
