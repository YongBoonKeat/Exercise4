package Exercise4point2;

public class greenApple  extends Apple {
	private String color;
	private String taste;
    
    public greenApple(){
      super();
      this.color = "Green";
      this.taste = "Sour";
     }

   public greenApple(String N, int Q, double P,String C,String T){
     super(N,Q,P); 
     this.color = C;
     this.taste = T;
   }
 
  	public double totalprice() {
		return this.quantity * price;
	 }	
	
	public String toString() //overriding method
	{
		return("Quantity="+quantity+"\n"+"Price=RM"+price+"\n"+"Color of apple is: "+ color +"\n"+"Taste of green apple is "+ taste +"\n"+"Total Price=RM"+totalprice());

	}	
}
