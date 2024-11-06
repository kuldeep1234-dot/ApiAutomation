package apifirstdemo;

import file.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js =new JsonPath(Payload.PrintPages());
	int count=	js.getInt("courses.size()");
	System.out.println(count);
	
	//purchase amount
	
	
	int totalAmount =js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmount);
	
	//Print title of the first course
	
	String firstcourse =js.get("courses[0].title");
	System.out.println(firstcourse);
	
	//Print title of the second course 
	
	String secondcourse =js.get("courses[1].title");
	System.out.println(secondcourse);
			
	//Get the list of courses and the title
	
	for(int i =0;i<count;i++)
	{
		String Totalcoursestitles =js.get("courses["+i+"].title");
		System.out.println(Totalcoursestitles);
		int Totalcoursesprice =js.get("courses["+i+"].price");
		   System.out.println(Totalcoursesprice);
	}
   
	//Print the copy of RPA course is present 
	
	for (int i=0;i<count;i++)
	{
	
		String courseTitle=	js.get("courses["+i+"].title");
		if (courseTitle.equalsIgnoreCase("RPA"));
		
	{
		int copies= js.get("courses["+i+"].copies");
		System.out.println(copies);
		break;
	
	}
	
	}
  
	
	}

}
