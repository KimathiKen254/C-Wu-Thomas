
public class weightconverter {
 double gravity;
    
    public weightconverter(double Gravity){
        gravity = Gravity;
    }
    
    public double convert(double weight){
        return (weight*gravity);
    }
    
}
