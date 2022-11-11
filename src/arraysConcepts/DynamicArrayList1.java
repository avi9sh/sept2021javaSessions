package arraysConcepts;

import java.util.ArrayList;

public class DynamicArrayList1 {

	public static void main(String[] args) {
       ArrayList<Object> namesList= new ArrayList<Object>();
       namesList.add("Deepak");
       namesList.add("Vipul");
       namesList.add("Avinash");
       namesList.add("Rajnish");
       namesList.add("vijay");
       System.out.println(namesList.size());
       
       namesList.remove(1);
       System.out.println(namesList.size());
       
       // print all value of ArrayList by useing for loop
       for(int k=0; k<namesList.size();k++) {
    	   System.out.println(k);
    	   
       }
       for(Object e:namesList) {
    	   System.out.println(e);
    	   
       }


       
       
	}

}
