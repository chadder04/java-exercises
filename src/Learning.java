class Learning {

	public static Boolean isPalindrome(String input) {
		String reverse = new StringBuilder(input).reverse().toString();

		if (input.equals(reverse))
			return true;

		return false;
	}

	public static Boolean isPalindrome(Integer input) {
		Integer reverse = 0;
		Integer n = input;

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		if (input.equals(reverse))
			return true;

		return false;
	}

	public static Boolean isPrimeNumber(Integer input) {
		Integer n;

		if (input <= 1)
			return false;

		for (n = 2; n <= input / 2; n++) {
			if (input % n == 0)
				return false;
		}

		return true;
	}

	public static void main(String args[]) {
		for (Integer i = 1; i <= 10000; i++) {
			if (isPalindrome(i) && isPrimeNumber(i))
				System.out.println(i + " is a Palindrome and Prime Number!");
		}
	}

}
