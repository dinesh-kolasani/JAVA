class GrandFather {
	void hairColor(){
		System.out.println("Hair color black");
	}
}

class Father extends GrandFather{
	void faceShape(){
		System.out.println("Face is round");
	}
}

class Son extends Father{
	void skinColor(){
		System.out.println("Skin color white");
	}
}


public class InheritanceMultiLevelDemo {
	public static void main(String[] args){

		Son raj = new Son();
		raj.hairColor();
		raj.faceShape();
		raj.skinColor();
	}
}