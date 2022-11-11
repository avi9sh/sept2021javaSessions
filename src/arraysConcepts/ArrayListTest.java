package arraysConcepts;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(1000);
		ar.add(1100);
		System.out.println(ar.size());
		
		// print all value of ArrayList by useing  for loop
          for(int i=0;i<ar.size();i++) {
        	  System.out.println(ar.get(i));

          }
          System.out.println("............................");
       // print all value of ArrayList by useing for-each loop
          for(Integer e:ar) {
        	  System.out.println(e);
          }
	}

}
