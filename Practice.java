public class Practice{
	public static void main(string[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();
   System.out.print("Enter the time: ");
    double time = input.nextDouble();
    double interest = (principal * time * 7) / 100;
    System.out.println("Simple Interest: " + interest);
    input.close();
  }
}

