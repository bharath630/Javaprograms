import java.util.*;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 C a =new C();
		Bk a1=new Bk();
		 a.start();
		 a1.start();
	}

}
class C extends Thread
{
	public void run()
	{
		 B b1=new B();
		 b1.b();
	}
}
class Bk extends Thread
{
	public void run()
	{
		Bm n=new Bm();
		n.bm1();
	}
}
class Bm
{
	synchronized void bm1()
	{
		for(int j=1;j<9;j++)
		{
			System.out.println(j);
		}
	}
}
class B
{
	 void b()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}