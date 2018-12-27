package Java.Sample;

public class IntergersToWords {

	// Java program to print a given number in words. The 
			// program handles numbers from 0 to 999

	public static  String convertIntegersToWords(char[] num)
	{
		String str="";
			int len = num.length; 
 
			if (len > 3) 
			{ 
					
				return "Length more than 3 is not supported"; 
			} 

		
			String[] single_digits = new String[]{ "", "one", 
												"two", "three", "four", 
												"five", "six", "seven", 
													"eight", "nine"}; 

			String[] two_digits = new String[]{"", "ten", "eleven", "twelve", 
												"thirteen", "fourteen", 
												"fifteen", "sixteen", "seventeen", 
												"eighteen", "nineteen"}; 

			
			String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", 
													"fifty","sixty", "seventy", 
													"eighty", "ninety"}; 

			String[] tens_power = new String[] {"hundred"}; 

			
			

			/* For single digit number */
			if (len == 1) 
			{ 
		
 			 return single_digits[num[0] - '0'] ; 
			} 

		
			int x = 0; 
			while (x < num.length) 
			{ 

				/* Code path for first 2 digits */
				if (len == 3) 
				{ 
					
					if (num[x]-'0' != 0) 
					{ 
						//System.out.print(single_digits[num[x] - '0']+" "); 
					//	System.out.print(tens_power[len - 3]+" "); 
						str = single_digits[num[x] - '0']+" " + tens_power[len - 3]+" ";
						System.out.print(str);
					} 
					--len; 
				} 

				/* Code path for last 2 digits */
				else
				{ 
					/* Need to explicitly handle 
					10-19. Sum of the two digits 
					is used as index of "two_digits" 
					array of strings */
					if (num[x] - '0' == 1) 
					{ 
						int sum = num[x] - '0' + 
							num[x] - '0'; 
						//System.out.println(two_digits[sum]); 
						str = str + two_digits[sum];
						return str; 
					} 

					/* Need to explicitely handle 20 */
					else if (num[x] - '0' == 2 && 
							num[x + 1] - '0' == 0) 
					{ 
						//System.out.println("twenty"); 
						str= "twenty";
						return str; 
					} 

					/* Rest of the two digit 
					numbers i.e., 21 to 99 */
					else
					{ 
						int i = (num[x] - '0'); 
						if(i > 0) 
					//	System.out.print(tens_multiple[i]+" "); 
							str= tens_multiple[i]+" ";
						else
						//System.out.print(""); 
							str= str + "";
						++x; 
						if (num[x] - '0' != 0) 
							// System.out.println(single_digits[num[x] - '0']); 
							str = str + single_digits[num[x] - '0'];
					} 
				} 
				++x; 
			}
			return str; 
		}

	
}
