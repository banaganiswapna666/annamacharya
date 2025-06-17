import java.util.*;
class Add{
	void add(int a,int b){
		System.out.println("sum=" +(a+b));
	}
	void add(int a,int b,int c){
		System.out.println("sum=" +(a+b+c));
	}
	void add(float a,float b,float c){
		System.out.println("sum=" +(a+b+c));
	}
}
class RAdd{
	public static void main(String[] args){
		Add obj=new Add();
		obj.add(10,20);
		obj.add(10,20,30);
		obj.add(20,40,30);
	}
}
