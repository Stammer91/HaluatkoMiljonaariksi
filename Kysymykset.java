import java.io.*;
import java.util.*;

public class Kysymykset {
	
	protected static FileReader file;
	protected static BufferedReader br;
	private static String kysymys , A, B, C, D, vastaus;
	
	public static void main(String[] args) {
		}
	
	public void kysymykset()
	{
		try
		{
			file = new FileReader("src/Kysymys.txt");
			br = new BufferedReader(file);
		}
		catch (IOException e)
		{
			
		}
	}
	
	   public String getKysymys()
	      {
	         try
	         {
	            kysymys = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return kysymys;
	      }
	   public String getA()
	      {
	         try
	         {
	            A  = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return A;
	      }
	      public String getB()
	      {
	         try
	         {
	            B  = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return B;
	      }
	      public String getC()
	      {
	         try
	         {
	            C  = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return C;
	      }
	      public String getD()
	      {
	         try
	         {
	            D  = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return D;
	      }
	      public String getVastaus()
	      {
	         try
	         {
	            vastaus  = br.readLine();
	         }
	            catch (IOException e)
	            {

	            }
	         return vastaus;
	      }
	
}
class ResetKysymykset extends Kysymykset {
	public void resetbr ()
	{
		try
		{
			file.close();
			br.close();
			file = new FileReader("src/Kysymys.txt");
			br = new BufferedReader(file);
		}
		catch (IOException e)
		{
			
		}
	}
}