public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);// what is this ?
        // super is used to call the constructor of the parent class (Box) with parameters l, h, and w. It initializes the length, height, and width of the BoxWeight object using the constructor of the Box class. // basically it calls the parent class constructor to initialize the values in parent class 
        // it can still not access the private members of the parent class directly, but it can use the constructor to set their values.
        this.weight = weight;
    }
}