     import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;
public class Decreaasing_string{
	   
	  
public static void main(String args[]) throws IOException {
	
	 InputStreamReader sr=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(sr);
	 		int test=br.read();
	 		for(int j=0;j<test;j++){
					String s=br.readLine();
					int len=s.length();
					char[] a= s.toCharArray();
					char[] b=new char[100];
					int temp=0;
					 
				 for(int i=0;i<len;i++){
					switch(a[i]){
					case '(': break;
					case '+':b[temp++]=a[i];break;
					case '-':b[temp++]=a[i];	break;
					case '*':b[temp++]=a[i];	break;
					case '^':b[temp++]=a[i];	break;
					case ')':System.out.print(b[--temp]);	break;
					default: System.out.print(a[i]); 
					}
				}
				System.out.println(); 
	 		}
}
		}

	  


