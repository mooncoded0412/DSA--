public class Box {
    double l, b, h;

    Box(){
        this.l = this.b = this.h = -1;
    }

    Box(double side){
        this.l = this.b = this.h = side;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box B){
        this.l = B.l;
        this.b = B.b;
        this.h = B.h;
    }
    
}
