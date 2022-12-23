
public class MainClass {

	public static void main(String[] args) {
		double sum=0;

		Product[] arr = new Product[3];
		arr[0]= new Book();
		arr[1]=new ChildrenBook();
		arr[2]=new Book();
		
		for (int i = 0 ; i<arr.length; i++) {
			double price= arr[i].prices();
			sum=sum+price;
		}
		System.out.println("The sum is: "+ sum);
		

	}

}
