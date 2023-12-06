package entities;

public class rectangle {
    public double width;
    public double height;

    public double area(){
        return width*height;
    }
    public double perimeter(){
        return (2*width)+(2*height);
    }

    public double diagonal() {
        double pow_a = Math.pow(width,2);
        double pow_b = Math.pow(height,2);

        return Math.sqrt((pow_a) + (pow_b));
    }
    public String toString(){
        return "AREA = "+String.format("%.2f\n",area())+
                "PERIMETER = "+String.format("%.2f\n",perimeter())+
                "DIAGONAL = "+String.format("%.2f\n",diagonal());
        }
}
