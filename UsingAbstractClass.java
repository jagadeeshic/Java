abstract class UsingAbstractClass
{
    double dim1;
    double dim2;

    UsingAbstractClass(double a, double b)
    {
        dim1=a;
        dim2=b;
    }

    abstract double area();
}
class  Rectangle extends UsingAbstractClass
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        System.out.println("INSIDE RECTANGLE");
        return  dim1*dim2;
    }
}
class Triangle extends  UsingAbstractClass
{
    Triangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        System.out.println("INSIDE TRIANGLE");
        return dim1*dim2;
    }
}

class AbstractAreas
{
    public static void main(String[] args)
    {
        // 3++++++++
        // var obj = new UsingAbstractClass(23,56);
        // CANNOT CREATE OBJECTS FOR ABSTRACT CLASS
        Rectangle r = new Rectangle(23,56);
        Triangle t = new Triangle(89,780);

        // CREATING REFERENCE VARIABLES FOR ABSTRACT CLASS IS FINE
        // HERE ABSTRACT CLASS IS SUPER CLASS
        UsingAbstractClass refvariable;
        refvariable =r;
        System.out.println("REFERENCE VARIABLE WITH RECTANGLE OBJECT IS=="+refvariable.area());

        refvariable=t;
        System.out.println("REFERENCE VARIABLE WITH TRIANGLE OBJECT IS --"+refvariable.area());

    }
}
// ALL SUBCLASSES OF AN ABSTRACT MUST OVERRIDE THE METHODS IN SUPER CLASS(ABSTRACT CLASS)
// YOU CANNOT CREATE A SUBCLASS FOR ABSTRACT CLASS WITHOUT OVERRIDING ALL THE METHODS IN ABSTRACT CLASS
// WE CANNOT CREATE OBJECTS FOR AN ABSTRACT CLASS
// WE CAN CREATE REFERENCE VARIABLES FOR ABSTRACT CLASS in above eg "refvariable"