// this is a change
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Subject
{
    private int maths = 90;
    private int eng = 95;
    private int tamil = 80;
    
    public int getMaths()
    {
        //n = (maths/10)%10;
        //maths = maths + n;
        return maths;
    }
    public int getEng()
    {
        return eng;
    }
    public int getTamil()
    {
        return tamil;
    }
    
    public void setMaths(int maths)
    {
        this.maths = maths;

    }
    public void setEng(int eng)
    {
        this.eng = eng;
    }
    public void setTamil(int tamil)
    {
        this.tamil = tamil;
    }
    
}
class Codechef
{
    public static void changeMarks()
    {
        int n;
        Subject b = new Subject();
        n = (b.getMaths()/10)%10;
        b.setMaths(b.getMaths()+n);
        System.out.println(b.getMaths());
        n = (b.getEng()/10)%10;
        b.setEng(b.getEng()+n);
        System.out.println(b.getEng());
        n = (b.getTamil()/10)%10;
        b.setTamil(b.getTamil()+n);
        System.out.println(b.getTamil());
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Subject a = new Subject();
		System.out.println(a.getMaths());
		changeMarks();
		//System.out.println(a.getMaths());
		
	}
}
