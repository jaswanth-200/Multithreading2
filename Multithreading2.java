import java.util.Scanner;
//thread1 for printing even numbers
class thread1 extends Thread{
    int t1start;
    int t1end;
    public void run(int t1start,int t1end)
    {   System.out.print("Even numbers between "+t1start+" and "+t1end+": ");
        this.t1start=t1start;
        this.t1end=t1end;
        for(int i=t1start;i<t1end;i++)
        {  if(i%2==0)
        {
            System.out.print(i+" ");
        }
    }
    System.out.println("");
    }
    
}
//thread2 for printing odd numbers
class thread2 extends Thread{
    int t2start;
    int t2end;
    public void run(int t2start,int t2end)
    {    System.out.print("Even numbers between "+t2start+" and "+t2end+": ");
        this.t2start=t2start;
        this.t2end=t2end;
        for(int i=t2start;i<=t2end;i++)
        {  if(i%2!=0)
        {
            System.out.print(i+" ");
        }
    }
}
}

public class Multithreading2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter t1Start,t1end: ");
		int t1start=sc.nextInt();
		int t1end=sc.nextInt();
		System.out.println("Enter t2Start,t2end: ");
		int t2start=sc.nextInt();
		int t2end=sc.nextInt();
		thread1 th1=new thread1();
		thread2 th2=new thread2();
		th1.run(t1start,t1end);
		th2.run(t2start,t2end);
		//thread1 start
		th1.start();
		//thread2 start
		th2.start();
	}
}
