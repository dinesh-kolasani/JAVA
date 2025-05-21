import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
  		al.add("Dinesh");
  		al.add("raj");
  		al.add("kolasani");
		al.add(null);
		al.add(90);
		al.add("raj");
		al.add(90);
  		
		System.out.println("List: " + al);
		System.out.println("index 1: " + al.get(1));
		al.remove(1);
		System.out.println("List: " + al);
		System.out.println("list contains raj: " + al.contains("raj"));


		System.out.println("---------LinkedList---------");

		LinkedList ll = new LinkedList();
  		ll.add("Dinesh");
  		ll.add("raj");
  		ll.add("kolasani");
		ll.add(null);
		ll.add(90);
		ll.add("raj");
		ll.add(90);
  		
		System.out.println("List: " + ll);
		System.out.println("index 1 name: " + ll.get(1));
		ll.remove(1);
		System.out.println("List: " + ll);


		System.out.println("---------Vector---------");

		Vector v = new Vector();
  		v.add("Dinesh");
  		v.add("raj");
  		v.add("kolasani");
		v.add(null);
		v.add(90);
		v.add("raj");
		v.add(90);
  		
		System.out.println("List: " + v);
		System.out.println("index 1 name: " + v.get(1));
		v.remove(1);
		System.out.println("List: " + v);

		
		System.out.println("---------Stack---------");

		Stack s = new Stack();
  		s.push("Dinesh");
  		s.push("raj");
  		s.push("kolasani");
		s.push(null);
		s.push(90);
		s.push("raj");
		s.push(90);
  		
		System.out.println("List: " + s);
		System.out.println("index 1 name: " + s.get(1));
		s.remove(1);
		System.out.println("List: " + s);

	}
}