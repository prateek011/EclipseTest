public class Main {
	
	public static void sayHello(String message) {
        System.out.println(message);
    }
	 
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello("Hello World!");
        helloWorld.sayHello("Bye World!");
    }
}