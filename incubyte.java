package LinkedListExample;

import java.util.*;

public class incubyte {
   public static int addition(String s) {
	   int sum=0;
	   
	   String alpha="*abcdefghijklmnopqrstuvwxyz";
	   
	   List<Integer> negarr=new ArrayList<Integer>();
	   
	   if(s.length()==0) {
		   sum=0;
	   }
	   String[] numarr=s.split(",");
	  
	   for(String num : numarr) {
		   if (!num.trim().isEmpty()) {
			   
				if(alpha.contains(num)) 
				{
					   sum+=alpha.indexOf(num);
				}
				else 
				{
	            int convertInt = Integer.parseInt(num.trim());
	            if (convertInt < 0) 
	            {
                    negarr.add(convertInt);
                } 
	            else if (convertInt <= 1000) 
	            {
                    sum += convertInt;
	            }
	            }
		}
	    if (negarr.size() > 0) {
	        throw new RuntimeException("Negatives not allowed: " + negarr.toString());
	    }
	
	
	}
	return sum;
	   
   }

	public static void main(String[] args) {
		System.out.println(addition("1,2,a,c"));

	}

}
