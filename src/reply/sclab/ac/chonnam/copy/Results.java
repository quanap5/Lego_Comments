package reply.sclab.ac.chonnam.copy;

public class Results
{
    private String id;

    private Author author;

    private String legacy_id;

    private String updated_at;

    private String content_uuid;

    private String replies_count;

    private String censored_replies_count;

    private String created_at;

    private String replies_count_descendants;

    private String[] attachments;

    private String comment;

    private User_vote user_vote;

    private String censored_replies_count_descendants;

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

    public String getLegacy_id ()
    {
        return legacy_id;
    }

    public void setLegacy_id (String legacy_id)
    {
        this.legacy_id = legacy_id;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getContent_uuid ()
    {
        return content_uuid;
    }

    public void setContent_uuid (String content_uuid)
    {
        this.content_uuid = content_uuid;
    }

    public String getReplies_count ()
    {
        return replies_count;
    }

    public void setReplies_count (String replies_count)
    {
        this.replies_count = replies_count;
    }

    public String getCensored_replies_count ()
    {
        return censored_replies_count;
    }

    public void setCensored_replies_count (String censored_replies_count)
    {
        this.censored_replies_count = censored_replies_count;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getReplies_count_descendants ()
    {
        return replies_count_descendants;
    }

    public void setReplies_count_descendants (String replies_count_descendants)
    {
        this.replies_count_descendants = replies_count_descendants;
    }

    public String[] getAttachments ()
    {
        return attachments;
    }

    public void setAttachments (String[] attachments)
    {
        this.attachments = attachments;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    public User_vote getUser_vote ()
    {
        return user_vote;
    }

    public void setUser_vote (User_vote user_vote)
    {
        this.user_vote = user_vote;
    }

    public String getCensored_replies_count_descendants ()
    {
        return censored_replies_count_descendants;
    }

    public void setCensored_replies_count_descendants (String censored_replies_count_descendants)
    {
        this.censored_replies_count_descendants = censored_replies_count_descendants;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", author = "+author+", legacy_id = "+legacy_id+", updated_at = "+updated_at+", content_uuid = "+content_uuid+", replies_count = "+replies_count+", censored_replies_count = "+censored_replies_count+", created_at = "+created_at+", replies_count_descendants = "+replies_count_descendants+", attachments = "+attachments+", comment = "+comment+", user_vote = "+user_vote+", censored_replies_count_descendants = "+censored_replies_count_descendants+"]";
    }
}