class  Box
{
    double height;
    double width;
    double depth;

    Box(Box ob)
    {
        height=ob.height;
        width=ob.width;
        depth=ob.depth;
    }

    Box(double d,double w,double h)
    {
        width=w;
        height=h;
        depth=d;
    }

    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }

    Box(double length)
    {
        height=width=depth=length;
    }

    double volume()
    {
        return width*height*depth;
    }

}

class WeightBox extends Box
{
    double weight;

    WeightBox(double w,double h, double d, double m)
    {
        width =w;
        depth= d;
        height=h;
        weight=w;
    }
}

class DemoBoxWeight
{
    public static void main(String[] args)
    {
        var mybox1 = new WeightBox(10,20,25.5,23.6);
        var mybox2 = new WeightBox(2,5,8,9.2);
        double vol;

        vol=mybox1.volume();
        System.out.println(vol);

        vol=mybox2.volume();
        System.out.println(vol);
    }
}
