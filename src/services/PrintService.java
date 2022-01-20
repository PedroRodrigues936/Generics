package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{
	private List <T> list = new ArrayList<>();
	
	public void addValues(T values) {
		list.add(values);
	}
	    public T first() {
	    	if(list.isEmpty()) {
	    		throw new IllegalStateException("List is empty");
	    	}
	    	return list.get(0);
	    }
	    public void print() {
	    	System.out.println("[");
	    	if(!list.isEmpty()) {
	    		System.out.println(list.get(0));
	    	}
	    	for(int i = 1;i < list.size(); i++) {
	    		System.out.println(" , " + list.get(i));
	    	}
	    	System.out.println("]");
	        }
	    
}