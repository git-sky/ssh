package cn.com.sky.spring.ioc.factory_initial;


public class HelloImpl2 implements HelloApi {

	private String message;

	public HelloImpl2() {
		this.message = "Hello World!";
	}

	public HelloImpl2(String message) {
		this.message = message;
	}

	@Override
	public void sayHello() {
		System.out.println(message);
	}
}
