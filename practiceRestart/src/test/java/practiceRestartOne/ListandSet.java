package practiceRestartOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListandSet {
	
	
	public static void main(String[] args)
	{
		ListandSet lst = new ListandSet();
		lst.middleMen();
	}
	
	
	public void middleMen()
	{
		//practiceList();
		practiceSet();
	}
	
	
	public void practiceList()
	{
		//List is an Interfae - ArrayList,LinkedList,Vector
		ArrayList<Object> alist = new ArrayList<Object>();

		System.out.println("Default size of ArrayList:"+alist.size());
		
		alist.add("Peter Griffin");
		alist.add(123.123f);
		alist.add('c');
		alist.add(9404300301l);
		
		System.out.println("Printing ArrayList Elements using SOP");
		System.out.println(alist);
		
		System.out.println("Printing ArrayList Element using for loop");
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		
		System.out.println("Printing ArrayList Element using Iterator");
		
		Iterator<Object> itr = alist.iterator();
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
		
		
		System.out.println("Printing ArrayList Element using for each loop");
		
		for(Object obj: alist)
		{
			System.out.println(obj);
		}
		
		
		
	}
	
	
	public void practiceSet()
	{
		// set is an interface - HashSet,LinkedHashSet,TreeSet are its implmentation classes
		//TreeSet is sorted set - we can add only same type of elements in it
		
		HashSet<Object> hSet= new HashSet<Object>();
		
		System.out.println("Default size of set:"+ hSet.size());
		// duplicates are not allowed - insertion order is not preserved
		hSet.add("brewie");
		hSet.add('r');
		hSet.add("Ragnar Lothbrok");
		hSet.add(234);
		hSet.add(45243.2432432d);
		System.out.println("we Cannot Print Set Elements using for loop");
		System.out.println("Printing Set Element using SOP");
		System.out.println(hSet);
		System.out.println("Printing Set Elements using for each loop");
		for(Object obj:hSet)
		{
			System.out.println(obj);
		
		}
		System.out.println("Printing Set Elements using Iterator");
		
		Iterator<Object> itr = hSet.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
