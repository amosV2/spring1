package cn.demo.spring.beans;

public class HelloWorld {

	private String name;

	public void say(){
		System.out.println("name:"+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
