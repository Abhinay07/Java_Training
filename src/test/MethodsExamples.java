package sample;

public class MethodsExamples {

	public static void main(String[] args) {	// Where JVM will recongnise and execute first. From this it will call any other methods or objects.
		// TODO Auto-generated method stub
		MethodsExamples obj = new MethodsExamples(); // ClassName objName = new ClassName(); To Create a object
		System.out.println("Before calling test Method");
		obj.test();
		System.out.println("After calling test Method");
		obj.test2();
	}

	public void test() {		// To perform a block of code
		System.out.println("I'm in test Method");
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

	public void test2() {
		System.out.println("Im in Test 2 Method");
	}
}
