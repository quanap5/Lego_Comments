package reply.sclab.ac.chonnam.copy;

public class In_reply_to
{
    private String id;

    private Author author;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Author getAuthor ()
    {
        return author;
    }

    public void setAuthor (Author author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", author = "+author+"]";
    }
}
			
			