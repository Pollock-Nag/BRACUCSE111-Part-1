public class  Circle{
  private double radius= 1.0;
    private String color="red";
  double area;
    public void setRadius(double r){
      radius=r;
    }
    public void setColor(String s){
      color=s;
    }
    public double getRadius(){
      return radius;
    }
    public String getColor(){
      return color;
    }
    public double getArea(){
      area= (3.1416)*(radius*radius);
      return area;
    }
}