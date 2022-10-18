
public class Z14_JavaMethods {

	public static void main(String[] args) {
		
		//methods = a block of code that is executed whenever it is called upon
		
				String name = "WhisKey";
				int age = 20;
				
				hello(name, age);
			}
			
			//Argument = An argument is a value passed to a function when the function is called
			
			//Parameter = A parameter is a variable used to define a particular value during a function definition
			//            Whenever we define a function we introduce our compiler with some variables that are being 
			//            used in the running of that function. These variables are often termed as Parameters.
			//            The parameters and arguments mostly have the same value but theoretically, are different from each other.
			
			static void hello(String fuck, int age) {           //method should be in lower case 
				
				System.out.println("Hello "+fuck);
				System.out.println("you are "+age+" yrs old!");

	}

}
