 class Untitled {
	public static void main(String[] args) {
		
		String one = "3";
		String two = "4";
		
		int result = one.compareTo(two);
		
		if (result < 0)
		{
			System.out.println(one + " is less than " + two);
		}
		else if (result == 0)
		{
			System.out.println(" Two strings are equal ");

		}
		else {
			System.out.println(one + " is larger than " + two);
		}
	}
}