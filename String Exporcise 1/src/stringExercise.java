
public class stringExercise
	{

		public static void main(String[] args)
			{
				// challenge one

				String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

				int aLength = alphabet.length();

				System.out.println();

				for (int i = 0; i < aLength; i = i + 2)
					{

						String letter = alphabet.substring(i, i + 1);
						System.out.print(letter);
					}

				System.out.println();

				// challenge two

				int bLength = alphabet.length();

				for (int i = 0; i < bLength; i = i + 4)
					{
						String letter = alphabet.substring(i, i + 1);
						System.out.print(letter + " ");
					}

				// challenge three
				
				
				  int cLength = alphabet.length();
				  
				  
				  for( int i = 2 ; i < cLength ; i = i + 4){
				  
				  String letter = alphabet.substring(i , i + 1);
				  
				  System.out.print(letter);
				  
				   }
				  

				 System.out.println();
				 

				// challenge four

				int dLength = alphabet.length();

				for (int i = 0; i < dLength; i = i + 2)
					{
						String letter = alphabet.substring(i, i + 1);
						System.out.println(letter);
					}

				// challenge five

				int eLength = alphabet.length();

				System.out.println("Total number of charactures: " + eLength);

				// challenge six

				int fLength = alphabet.length();

				int numberOfSpaces = 0;

				for (int i = 0; i < fLength; i++)
					{
						String letter = alphabet.substring(i, i++);
						if (letter.equals(" "))
							{
								numberOfSpaces++;
							}
					}

				System.out.println("Total number of spaces is: " + numberOfSpaces);

			}

	}
