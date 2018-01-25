package reply.sclab.ac.chonnam.copy;

public class Author
{
    private String id;

    private String avatar_url;

    private String alias;

    private String avatar_thumbnail_url;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getAvatar_url ()
    {
        return avatar_url;
    }

    public void setAvatar_url (String avatar_url)
    {
        this.avatar_url = avatar_url;
    }

    public String getAlias ()
    {
        return alias;
    }

    public void setAlias (String alias)
    {
        this.alias = alias;
    }

    public String getAvatar_thumbnail_url ()
    {
        return avatar_thumbnail_url;
    }

    public void setAvatar_thumbnail_url (String avatar_thumbnail_url)
    {
        this.avatar_thumbnail_url = avatar_thumbnail_url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", avatar_url = "+avatar_url+", alias = "+alias+", avatar_thumbnail_url = "+avatar_thumbnail_url+"]";
    }
}
			
			