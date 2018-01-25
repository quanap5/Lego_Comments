package reply.sclab.ac.chonnam.copy;

public class MyReply {

	private String id;
	private String author;
	private String replies_count;
	private String created_at;
	private String comment;
	private String user_vote;

	public MyReply (Results re){
				
		this.author=re.getAuthor().getAlias();
		this.id=re.getAuthor().getId();
		this.comment=re.getComment();
		this.created_at=re.getCreated_at();
		this.user_vote=re.getUser_vote().getCount();
		this.replies_count=re.getReplies_count();

		}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	

	public String getReplies_count() {
		return replies_count;
	}

	public void setReplies_count(String replies_count) {
		this.replies_count = replies_count;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUser_vote() {
		return user_vote;
	}

	public void setUser_vote(String user_vote) {
		this.user_vote = user_vote;
	}

}