public class Sample1
{
	public static void main(String[] args) {
		
		/*String s1= "SoftwareEngineer";
		
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.charAt(10));
		System.out.println(s1.substring(8));
		System.out.println(s1.toString());
		System.out.println(s1.valueOf(3));
		System.out.println(s1.equalsIgnoreCase(s1));*/
		
		
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.append("Java");//now original string is changed  
			System.out.println(sb);//prints Hello Java
			
			sb.insert(2,"INDIA");//now original string is changed  
			System.out.println(sb);//
			
			sb.replace(2,4,"BANGALORE");  
			System.out.println(sb);
			 
			sb.delete(2,14);  
			System.out.println(sb);
			
			sb.reverse();  
			System.out.println(sb);

	}
}
