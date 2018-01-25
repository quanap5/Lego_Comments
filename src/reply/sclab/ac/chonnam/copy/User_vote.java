package reply.sclab.ac.chonnam.copy;

public class User_vote
{
    private String count;

    private String value;

    private String sum;

    private Distribution distribution;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getSum ()
    {
        return sum;
    }

    public void setSum (String sum)
    {
        this.sum = sum;
    }

    public Distribution getDistribution ()
    {
        return distribution;
    }

    public void setDistribution (Distribution distribution)
    {
        this.distribution = distribution;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [count = "+count+", value = "+value+", sum = "+sum+", distribution = "+distribution+"]";
    }
}