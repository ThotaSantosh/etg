
public class StringBufferedExample {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());  
		sb.append("Hello");  
		System.out.println(sb);
		System.out.println(sb.capacity());   
		System.out.println(sb.capacity());
		sb.reverse();  
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.replace(1,3,"CoreJava");  
		System.out.println(sb);
		}
}
