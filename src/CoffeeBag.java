
public class CoffeeBag {
    
    private static final double PRICE_PER_POUND = 5.99;
    private static final double TAX_RATE = 7.25/100;
    double NumberOfBags;
    double bagWeight;
    double totalSales;

public CoffeeBag(double number,double weight){
      NumberOfBags = number;
      bagWeight = weight;
}

public void setNumberOfBags(double num){
       NumberOfBags = num;
}

public void setBagWeight(double Weight){
       bagWeight = Weight;
}

public double getNumberOfBags(){
    return NumberOfBags;
}

public double getBagWeight(){
    return bagWeight;
}

public double getTotalSales(){
    double totalSales = (bagWeight*NumberOfBags*PRICE_PER_POUND);
     return totalSales;
}

public double  gettotalPriceWithTax(){
    double totalPriceWithTax = (getTotalSales()*TAX_RATE);
    return  totalPriceWithTax;
}

}