package pack2;

import pack1.Class1;

public class Class3 extends Class1
{

	public Class3(int a, int b) 
	{
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Class3 obj = new Class3(1000, 2000);
		obj.add();
		obj.sub();
	}

}
