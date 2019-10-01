public class Retangle extends Shape {
    private double width ,length;

    public Retangle() {
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return  getWidth() * getLength();
    }
    public double getPerimeter(){
        return  (getLength()+ getWidth())*2;
    }
   @Override
   public String toString(){
        return  "A Rectangle  with width ="
                + getWidth()
                + "and length"
                + getLength()
                +" which  is a  subclass of"
                +super.toString();
   }
}
