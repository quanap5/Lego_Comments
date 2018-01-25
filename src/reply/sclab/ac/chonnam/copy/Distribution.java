package reply.sclab.ac.chonnam.copy;

public class Distribution
{
    private String plus1;

    private String zero0;

    private String minus1;

    public String get_plus1 ()
    {
        return plus1;
    }

    public void set1 (String plus1)
    {
        this.plus1 = plus1;
    }

    public String get_zero0 ()
    {
        return zero0;
    }

    public void set_zero0 (String zero0)
    {
        this.zero0 = zero0;
    }

    public String get_minus1 ()
    {
        return minus1;
    }

    public void set_minus1 (String minus1)
    {
        this.minus1 = minus1;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [1 = "+1+", 0 = "+0+", -1 = "+-1+"]";
    }
}
			
			