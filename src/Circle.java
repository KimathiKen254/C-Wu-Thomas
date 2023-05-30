
public class Circle {
      double radius;   

    
public Circle(double r){
    radius = r;
}

public double area(){
    return (Math.PI*radius*radius);
}

public double circumference(){
    return (Math.PI*2*radius);
}
}