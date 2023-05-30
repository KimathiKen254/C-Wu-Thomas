
public class Temperature {
    
    double temperature;
    
    public Temperature(){
        temperature = 0.0;
    }
    
    public void setCelcius(double Celcius){
        Celcius = temperature;
    }
    
    
    public void setFahrenheit(double Fahrenheit){
        Fahrenheit = temperature;
    }
    
    
    public double toCelcius(){
        double Celcius = (temperature - 32)*5/9;
        return Celcius;
    }
    
    
    public double toFahrenheit(){
        double Fahrenheit = (1.8*temperature) + 32;
        return Fahrenheit;
    }
}
