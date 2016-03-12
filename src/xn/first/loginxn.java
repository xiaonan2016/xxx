package xn.first;
import java.util.*;

public class loginxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base b = new base(args);
		b.login();
	}
}
class check{
	public boolean che(String name,String pwd){
		if((name.equals("xn"))&&(pwd.equals("hh"))){
			return true;
		} else {
			return false;
		}
	}
}
class base{
	private String bs[];
	public base(String bs[]){
		this.bs = bs;
	}
	public void login(){
		check c = new check();
		this.len();
		String name = bs[0];
		String pwd = bs[1];
		if(c.che(name, pwd)){
			System.out.println("right!");
		} else {
			System.out.println("wrong2!");
		}
	}
	public void len(){
		if(this.bs.length!=2){
			System.out.print("wrong1!");
			System.exit(1);
		} 
	}
}