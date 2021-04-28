package ExampleOverloadingAndOverriding;

public class BoxShape extends RectangleShape   {//sub class
	private double height;
    
    public BoxShape() //constructor for sub class
    {
      super(); //inherit data,method from super class (constructor with no argument)
      height = 0;
     }

   public BoxShape(double L, double W, double H) //constructor sub class with argumnet
  {
     super(L,W);  //called method in superclass with passing parameter
     height = H;
     
     //L=13 W=7 H=2
     setDimension(L,W,H); //method for overloading
   }

  public void setDimension(double L, double W, double H) //overloading method with 3 parameter
 {
     if (H >= 0)
          height = H;
    else 
          height = 0;
 }
  
  public double getHeight(){
	    return height;
	}

	public double area(){
	  return  2     * (getLength() * getWidth() + getLength() * height + getWidth() * height);
	}
	 
	public double volume(){
	  return length * width * height;
	}

	public String toString() //overriding method
	{ 
	  return("Length = " + length + ", Width = " + width + ", Height =" + height + ", Surface Area =" + area() +", Volume =" + volume());

	}// end for class Box extends
}
