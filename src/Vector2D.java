import java.text.DecimalFormat;
import java.util.Locale;

import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class Vector2D {
    double x=1;
    double y=1;
    public static int count=0;
    public Vector2D() {
        this.x=1.00;
        this.y=1.00;
        count+=1;

    }
    public Vector2D(Vector2D a) {
        this.x=a.x;
        this.y=a.y;
        count+=1;
    }
    public Vector2D(double x,double y){
        this.x=x;
        this.y=y;
        count+=1;
    }


    double length(){
        double a=pow(x*x+y*y,0.5);
        if (Math.ceil(a)==1.0)
            return 1.0;
        else
            return a;
    }
    void add(Vector2D v){
        x+=v.x;
        y+=v.y;
    }
    void sub(Vector2D v){
        x-=v.x;
        y-=v.y;
    }
    void scale(double scaleFactor){
        x*=scaleFactor;
        y*=scaleFactor;
    }
    void normalized(){
        double a=pow(x*x+y*y,0.5);
        //x=(x*a)/(x*x+y*y);
        //y=(y*a)/(x*x+y*y);
        x/=a;
        y/=a;
    }
    double dotProduct(Vector2D v){
        return x*v.x+y*v.y;
    }
    int count(){
        return count;
    }
    void print(){
        System.out.println("("+String.format(Locale.US, "%.2f", x)+", "+String.format(Locale.US, "%.2f", y)+")");
    }
}
