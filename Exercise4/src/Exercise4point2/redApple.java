package Exercise4point2;

public class redApple extends Apple {
	private String color;
	private String taste;
    
    public redApple(){//constructor for sub class
      super();//inherit data,method from super class (constructor with no argument)
      color = "Red";
      taste = "Sweet";
     }

   public redApple(String name, int Q, double P,String C,String T){
     super(name,Q,P); 
     color = C;
     taste = T;
     
     //Q=10 P=2.5
     setFruit(name,Q,P,C); //method for overloading
   }

  public void setFruit(String name, int Q, double P,String C) { //overloading method
     if (C == "Red")
          color = C;
     else 
    	  color = "-";
 }
 
  	public double totalprice() {
		return quantity * price;
	 }	
	
	public String toString() //overriding method
	{
		return("Quantity="+quantity+"\n"+"Price=RM"+price+"\n"+"Color of apple is: "+ color +"\n"+"Taste of red apple is "+ taste +"\n"+"Total Price=RM"+totalprice());

	}	
}
