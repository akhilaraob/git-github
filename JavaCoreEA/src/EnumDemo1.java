
public class EnumDemo1 {
	public  enum Season  {WINTER,SPRING,SUMMER,FALL}
	        enum Color
	        {
	        	RED,GREEN,BLUE
	        }

	        enum Days
	        {
	        	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,
	        	FRIDAY,SATURSDAY;
	        }
	public static void main(String[] args) {
		
		//System.out.println(Season.SUMMER);
		//System.out.println(Season.FALL);
		  
		System.out.println(Color.GREEN);
		
		for(Season sn: Season.values())
			
			System.out.println(sn);
		
		for(Color c:Color.values())
			System.out.println(c);

		 for(Days d: Days.values())
			 System.out.println(d);
	   
		
	} 

}
