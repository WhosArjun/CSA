public class MyComplex
{
    // 1) private variables
    private double real;
    private double img;

    // 2) default constructor: 0 + 0i
    public MyComplex()
    {
        real = 0.0;
        img = 0.0;
    }

    // 3) constructor with parameters
    public MyComplex(double a, double b)
    {
        real = a;
        img = b;
    }

    // 4) getters
    public double getReal()
    {
        return real;
    }

    public double getImg()
    {
        return img;
    }

    // setters
    public void setReal(double real)
    {
        this.real = real;
    }

    public void setImg(double img)
    {
        this.img = img;
    }

    // 5) toString
    public String toString()
    {
        if (img < 0)
        {
            return "(" + real + " - " + (-img) + "i)";
        }
        else
        {
            return "(" + real + " + " + img + "i)";
        }
    }

    // 6) isReal and isImaginary
    public boolean isReal()
    {
        return img == 0;
    }

    public boolean isImaginary()
    {
        return real == 0;
    }

    // 7) add c to this complex number
    public void add(MyComplex c)
    {
        real = real + c.real;
        img = img + c.img;
    }

    // 8) multiply this complex number by c
    public void multiply(MyComplex c)
    {
        double newReal = real * c.real - img * c.img;
        double newImg = real * c.img + img * c.real;

        real = newReal;
        img = newImg;
    }

    // 9) conjugate
    public void conjugate()
    {
        img = -img;
    }

    // 10) argument (angle in radians)
    public double argument()
    {
        return Math.atan2(img, real);
    }

    // 11) magnitude
    public double magnitude()
    {
        return Math.sqrt(real * real + img * img);
    }

    // Static methods

    // 1) addNew
    public static MyComplex addNew(MyComplex a, MyComplex b)
    {
        return new MyComplex(a.real + b.real, a.img + b.img);
    }

    // 2) multiplyNew
    public static MyComplex multiplyNew(MyComplex a, MyComplex b)
    {
        double realPart = a.real * b.real - a.img * b.img;
        double imgPart = a.real * b.img + a.img * b.real;

        return new MyComplex(realPart, imgPart);
    }
    
    public static void main(String[] args){
        MyComplex a = new MyComplex(6.7, -4.1);
        System.out.println(a);
        MyComplex b = new MyComplex(4.1, -6.7);
        System.out.println(b);
    }
}