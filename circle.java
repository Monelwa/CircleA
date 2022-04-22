
 
package za.
        ac.wsu.s220093652;

// asavela monelwa
public class circle {
    // ATTRIBUTES
    private double radius;
    private int x;
    private int y;
    // return area of the circle
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    // return the circumference of the circle
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    // return the diameter of the circle
    public double calculateDiameter(){
        return 2*radius;
    }
    
    // setter for radius
  public void setradius(double radius){ 
      // check if radius cannot be less than zero
      if(radius<0){
          this.radius=0;
      } else{
          this.radius=radius;
      }
  } 
// setter for radius 
public void setx(int x){
    this.x=x;
      
}

//setter for radius 
public void sety(int y){
    this.y=y;
    
}
}



       
    
    
    
    
