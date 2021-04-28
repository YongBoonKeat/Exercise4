package ExampleOverloadingAndOverriding;

public class RectangleShape {
	 protected double length;
     protected double width;
     
     public RectangleShape(){ //constructor with no argument
       length = 0; //declare length=0
       width = 0;
      }

    public RectangleShape(double L, double W){ //constructor with argument
    	
    	//L=12, W=4
    	
       setDimension(L,W); //call method
    }

   public void setDimension(double L, double W){ //overloading method with 2 parameter
      if (L >= 0)
           length = 1;
     else 
           length = 0;

      if (W >= 0)
           width = W;
     else 
           width = 0;
   } 
   
   public double getLength(){
	    return length;
	}

	public double getWidth(){
	    return width;
	}

	public double area(){
	  return length * width;
	}
	 
	public double perimeter(){
	  return (2 * (length + width));
	}

	public String toString() //overriding method
	{
		return("Length = " + length + ", Width = " + width + ", Perimeter =" + perimeter() + ", Area =" + area());

	}
}// end for RectangleShape class
