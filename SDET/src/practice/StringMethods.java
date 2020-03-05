package practice;

public class StringMethods {

	public static void main(String[] args) {

		String name="Kranthi";
		String s1="Mamidala";
		//length
		System.out.println(name.length());
		
		//Concat
		System.out.println(name.concat(" "+s1));
		
		//trim
		name="  Kranthi  ";
		System.out.println(name.trim());
		
		//charAt
		name="Mamidala Kranthi";
		System.out.println(name.charAt(1));
		
		//Contains
		System.out.println(name.contains("Mam"));
		
		//equals
		System.out.println(name.equals("Mamidala"));
		
		//equalsIgnore
		System.out.println(name.equalsIgnoreCase("mamidala"));
		
		//replace
		System.out.println(name.replace('a', 'A'));
		System.out.println(name.replace("Kranthi", "KRANTHI"));
		
		//SubString
		System.out.println(name.substring(3, 8));
		
		//lower Case
		System.out.println(name.toLowerCase());
		
		//Upper Case
		System.out.println(name.toUpperCase());
		
		//Split Method
		String name1="My name is Kranthi";
		String s[] = name1.split(" ");
		for(String m:s) {
			System.out.println(m);
		}
	}

}
