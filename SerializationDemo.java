import java.io.*;

public class SerializationDemo {

public static void main(String[] args) throws Exception {
	try{
		EMP e1 = new EMP();
		System.out.println("serializaton Started");

		FileOutputStream fos = new FileOutputStream("Raj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(e1);
		System.out.println("Serialization ended");

		System.out.println("De-serialization started");

          	FileInputStream fis=new FileInputStream("Raj.txt");
          	ObjectInputStream ois=new ObjectInputStream(fis);

          	EMP e2 = (EMP) ois.readObject();
          	System.out.println("Deserialization ended");
          	System.out.println("Person object data");
         	
		//final result
          	System.out.println(e2.empId + " " + e2.salary);
	} catch (Exception e){ 
		System.out.println("Exception" + e);
	}
}
}
class EMP implements Serializable {

	int empId = 1;
	double salary = 89701;
}