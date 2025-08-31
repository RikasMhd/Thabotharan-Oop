public class Cylinder0 extends Circle0{
	private double height;

	public Cylinder0(){
		super();
		this.height=15;
	}
	public Cylinder0(double height){
		super();
		this.height=height;
	}
	public Cylinder0(double height,double radius){
		super(radius);
		this.height=height;
	}
	public Cylinder0(double height,double radius,String colour){
		super(radius,colour);
		this.height=height;
	}
	
	public double getHeight(){
		return this.height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getVolume(){
		return Math.PI*getRadius()*getHeight();
	}
	public String toString(){
		return super.toString()+"\nThe Height of the Cylinder is : "+this.getHeight()+"\nThe volume of the cylinder is : "+this.getVolume();
	}
}