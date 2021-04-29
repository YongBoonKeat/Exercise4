package Exercise4point2;

public class redApple extends Apple {
	private String color;
	private String taste;
    
    public redApple(){
      super();
      color = "Red";
      taste = "Sweet";
     }

   public redApple(String N, int Q, double P,String C,String T){
     super(N,Q,P); 
     color = C;
     taste = T;

   }
 
  	public double totalprice() {
		return quantity * price;
	 }	
	
	public String toString() //overriding method
	{
		return("Quantity="+quantity+"\n"+"Price=RM"+price+"\n"+"Color of apple is: "+ color +"\n"+"Taste of red apple is "+ taste +"\n"+"Total Price=RM"+totalprice());

	}	
}
