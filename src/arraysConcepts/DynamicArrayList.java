package arraysConcepts;

import java.util.ArrayList;

public class DynamicArrayList {

	public static void main(String[] args) {
        ArrayList ar = new ArrayList(20);
        System.out.println(ar.size());
        
        ar.add(100);
        ar.add(200);
        System.out.println(ar.size());
        
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());
        
        ar.add(500);
        ar.add(600);
        ar.add(700);
        System.out.println(ar.size());
        
        ar.add(800);
        ar.add(900);
        ar.add(1000);
        System.out.println(ar.size());
        
        ar.add(1100);
        System.out.println(ar.size());
        
        ar.add(1100);
        ar.add(1200);
        ar.add(1300);
        ar.add(1400);
        ar.add(1500);
        ar.add(1600);
        ar.add(1700);
        ar.add(1800);
        ar.add(1900);
        System.out.println(ar.size());
        
        ar.add(5555);
        System.out.println(ar.size());
	}
	

}
