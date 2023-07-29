package week4CodingAssignment;

public class Week4Assigning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ages Array
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		//have to use .length - 1 to access last element of an array
		int agesResult = ages[ages.length - 1] - ages[0];
		System.out.println("Last Age - First Age : " + agesResult);
		
		//filling newAges Array with a for loop
		//not a string so it is .length, not .length()
		int[] newAges = new int[ages.length + 1];
		for (int i = 0; i < ages.length; i++) {
			newAges[i] = ages[i];
		}
		//i changed the last element of the Array to be a number of my choosing
		newAges[8] = 35;
		int newAgesResult = newAges[newAges.length - 1] - newAges[0];
		System.out.println("Last Age - First Age : " + newAgesResult);
		
		//loop through ages for an average
		//average will be calculated by establishing a sum variable and the length of ages and storing it in a new variable
		int sumOfAges = 0;
		for (int age : ages) {
			sumOfAges +=  age;
		}
		int averageAge = sumOfAges / ages.length;
		
		System.out.println("Average age : " + averageAge);
		
		//names String Array
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		//this is a String so we will use .length() method
		//was using int but result was 3, switched to double as the result was incorrect
		double totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = totalLetters / names.length;
		System.out.println("Average Letters : " + averageLetters);
		
		//concatenate all names together separated by spaces with a loop
		//start with a StringBuilder
		StringBuilder concatenatedNames = new StringBuilder();
		
		//enhanced for loop and .append for the each name in names and .append for spaces
		for (String name : names) {
			concatenatedNames.append(name).append(" ");
		}
		//.toString() method to print the concatenated names correctly
		System.out.println("Concatenated Names : " + concatenatedNames.toString());
		
		//access last element of an Array
		//more complex than accessing first element and have to assign last value to a variable and use that variable to get the element stored
		int lastIndex = names.length - 1;
		String lastElement = names[lastIndex];
		System.out.println("Last Element : " + lastElement);
		
		//access first element of an Array
		//very simple as all array are zero-indexed
		String firstElement = names[0];
		System.out.println("First Element : " + firstElement);
		
		//nameLengths array and use a loop to add the length of each name to an array
		//since its a pre-established array and getting different info we can use the length of the names array for the length of nameLengths
		int[] nameLengths = new int[names.length];
		//iterate through the names array and add the length of each name
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//use a loop to calculate the sum of all the elements in nameLengths array
		//establish a sum variable that can be used in the body of the enhanced for loop
		int sumOfLengths = 0;
		for (int length : nameLengths) {
			sumOfLengths += length;
		}
		System.out.println("Sum of nameLengths : " + sumOfLengths);
		
		//establishing variables in the Main class for repeatWord Method
		//we have to use sysout in the main class to get the method return to print to console
		String hello = "Hello";
		int count = 3;
		String concatenatedWord = repeatWord(hello, count);
		System.out.println(concatenatedWord);
		
		//establishing variables in the Main class for method that returns a full name
		//we have to use sysout in the main class to get the method to print to console
		String firstName = "William";
		String lastName = "Kleinman";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		//establishing an array for boolean method
		//we have to use sysout in the main class to get the method return to print to console
		int[] numbers = {10, 20, 30, 40, 50, 60};
		boolean resultOfSum = isSumGreaterThan100(numbers);
		System.out.println("Is the sum greater than 100? : " + resultOfSum);
		
		//establishing an array for double method
		//we have to use sysout in the main class to get the method return to print to console
		double[] decimals = {2.7, 6.4, 9.5, 4.1};
		double average = findTheAverage(decimals);
		System.out.println("Average of decimals Array : " + average);
		
		//establishing two arrays for a comparison
		//this will be boolean as it is a comparison but both values will have to actually be ran through a method before a comparison can be made
		double[] arrayOne = {2.9, 7.4, 1.5, 5.1};
		double[] arrayTwo = {3.7, 4.8, 2.5, 4.7};
		boolean compareArray = compareAverages(arrayOne, arrayTwo);
		System.out.println("Is the average of arrayOne greater than arrayTwo : " + compareArray);
		
		//establishing a boolean to return value true in a method
		//will return true or false
		boolean isHotOutside = true;
		double moneyInPocket = 16.23;
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Will I buy a drink : " + willBuyDrink);
		
		//creating my own method problem
		//finding my favorite band between two arrays (its pre-established)
		//establishing arrays
		String[] groupOne = {"Metallica", "Periphery", "Vianova", "Bring Me The Horizon"};
		String[] groupTwo = {"Animals as Leaders", "Polyphia", "Gutherie Goven", "Ghost"};
		String favoriteBand = "Vianova";
		//establishing the method to find which group the band is in
		boolean foundInGroupOne = findValueInArray(groupOne, favoriteBand);
		boolean foundInGroupTwo = findValueInArray(groupTwo, favoriteBand);
		//will print true for the correct group, false for the incorrect group
		System.out.println("Found in Group One : " + foundInGroupOne);
		System.out.println("Found in Group Two : " + foundInGroupTwo);
	}
	//method needs to be establish as the method repeat words does not work when not used for a class method
	public static String repeatWord(String hello, int count) {
		//we use a StringBuilder as the method needs to return a String as a String is called in the method and to concatenate the word
		StringBuilder sb = new StringBuilder();
		//for loop the amount of times stored in the variable and appends the word in each iteration
		for (int i = 0; i < count; i++) {
			sb.append(hello);
		}
		//return the string established in StringBuilder so the concatenated String prints to the console
		System.out.print("Concatenated String method returns: ");
		return sb.toString();
	}
	//method was establish to pull the createFullName method and allow it to be use here
	public static String createFullName(String firstName, String lastName) {
		System.out.print("Full Name : ");
		return firstName + " " + lastName;
	}
	//method to check if sum is greater than 100
	//we use boolean so the return is true or false
	//since this is an array we can use an enhanced for loop
	public static boolean isSumGreaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		//will only return true or false as there is a boolean operator and within a boolean method
		return sum > 100;
	}
	//method to find the average of the decimals array
	public static double findTheAverage(double[] array) {
		double sum = 0.0;
		for (double num : array) {
			sum += num;
		}
		//we want sum / length of each element in the array to find the average
		//we can use equations in the return statements
		return sum / array.length;
	}
	//method to find the boolean return
	//as another method is involved will have to use a double to calculate, but can run both through our previously establish findTheAverage method
	public static boolean compareAverages(double[] arrayOne, double[] arrayTwo) {
		double averageOne = findTheAverage(arrayOne);
		double averageTwo = findTheAverage(arrayTwo);
		return averageOne > averageTwo;
	}
	//method to find the boolean return
	//an easy comparison method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	//the string labeled in the method has to be the targeted value of "favoriteBand"
	public static boolean findValueInArray(String[] array, String favoriteBand) {
		for (String value : array) {
			//an if statement has to be used as there is two statements in which one will be true and one will be false
			//the array with the targeted value needs to show true
			if (value.equals(favoriteBand)) {
				return true;
			}
		}
		return false;
	}

}
