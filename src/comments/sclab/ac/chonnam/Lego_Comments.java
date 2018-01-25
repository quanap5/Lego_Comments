package comments.sclab.ac.chonnam;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import reply.sclab.ac.chonnam.copy.MyReply;
import reply.sclab.ac.chonnam.copy.MyPojo;

public class Lego_Comments {
	public static void main(String[] args) throws MalformedURLException, IOException {
		String project = "2331436d-a3e1-4bc6-b563-8a99b8bf7dd1";
		String limit = "101";
		String url1 = "https://ideas.lego.com/comments/project/" + project
				+ "/comments?order=oldest&from=min&style=children&max_id=&min_id=&limit=" + limit
				+ "&id=comments-query-/comments" + "/project/"+project+"/comments";
		
		String next_index = "";
		int reply = 0;
		int comment = 0;
		ArrayList<MyComments> comments_Data = new ArrayList<MyComments>();

		while (true) {

			String url = url1 + next_index;
			String json = IOUtils.toString(new URL(url));
			Gson gson = new GsonBuilder().create();
			MyPojo myPojo = gson.fromJson(json, MyPojo.class);

			if (myPojo.getResults().length == 0) {
				break;
			}

			for (int i = 0; i < myPojo.getResults().length; i++) {
				MyComments myData1 = new MyComments(myPojo.getResults()[i]);
				comments_Data.add(myData1);

				System.out.println("======" + comment + "==========");
				System.out.print("Author: ");
				System.out.println(myPojo.getResults()[i].getAuthor().getAlias());
				System.out.print("Author_id: ");
				System.out.println(myPojo.getResults()[i].getAuthor().getId());
				System.out.print("Comment: ");
				System.out.println(myPojo.getResults()[i].getComment());
				System.out.print("Created_at: ");
				System.out.println(myPojo.getResults()[i].getCreated_at());
				System.out.print("User_vote: ");
				System.out.println(myPojo.getResults()[i].getUser_vote().getCount());
				System.out.print("Replies_count: ");
				System.out.println(myPojo.getResults()[i].getReplies_count());
				reply = reply + Integer.parseInt(myPojo.getResults()[i].getReplies_count());
				comment = comment + 1;
				System.out.print(myPojo.getResults()[i].getUser_vote().getDistribution().get_minus1());
				System.out.print(myPojo.getResults()[i].getUser_vote().getDistribution().get_zero0());
				System.out.println(myPojo.getResults()[i].getUser_vote().getDistribution().get_plus1());
				if (myPojo.getResults()[i].getReplies_count().equals("0")==false) {
					// extract reply
					String limit_reply = "10";
					String url_reply1 = "https://ideas.lego.com/comments/project/" + project
							+ "/comments/"+myPojo.getResults()[i].getId()+"/replies?order=oldest&from=min&style=flat"
							+ "&max_id=&min_id=&limit=21&id=comments-query-/comments/project/"+project+"/comments";
					
					String next_index_reply = "";
					
					//ArrayList<MyReply> replys_Data = new ArrayList<MyReply>();

					while (true) {

						String url_reply = url_reply1 + next_index_reply;
						System.out.println(url_reply);
						String json_reply = IOUtils.toString(new URL(url_reply));
						Gson gson_reply = new GsonBuilder().create();
						MyPojo myPojo_reply = gson_reply.fromJson(json_reply, MyPojo.class);

						if (myPojo_reply.getResults().length == 0) {
							break;
						}

						for (int j = 0; j < myPojo_reply.getResults().length; j++) {
							MyComments myData_reply1 = new MyComments(myPojo_reply.getResults()[j]);
							comments_Data.add(myData_reply1);

							System.out.println("======" + comment + "==========");
							System.out.print("AuthorReply: ");
							System.out.println(myPojo_reply.getResults()[j].getAuthor().getAlias());
							System.out.print("Author_idReply: ");
							System.out.println(myPojo_reply.getResults()[j].getAuthor().getId());
							System.out.print("CommentReply: ");
							System.out.println(myPojo_reply.getResults()[j].getComment());
							System.out.print("Created_atReply: ");
							System.out.println(myPojo_reply.getResults()[j].getCreated_at());
							System.out.print("User_voteReply: ");
							System.out.println(myPojo_reply.getResults()[j].getUser_vote().getCount());
							System.out.print("Replies_countReply: ");
							System.out.println(myPojo_reply.getResults()[j].getReplies_count());
							comment = comment + 1;
							System.out.print(myPojo_reply.getResults()[j].getUser_vote().getDistribution().get_minus1());
							System.out.print(myPojo_reply.getResults()[j].getUser_vote().getDistribution().get_zero0());
							System.out.println(myPojo_reply.getResults()[j].getUser_vote().getDistribution().get_plus1());
							
						}

						next_index_reply = "&min_id=" + myPojo_reply.getResults()[myPojo_reply.getResults().length - 1].getId();
						
					}
				}
			}

			next_index = "&min_id=" + myPojo.getResults()[myPojo.getResults().length - 1].getId();
			System.out.println("Reply + Comment=" + reply + " + " + comment + " = " + (reply + comment));
		}

		Gson gson1 = new Gson();
		String json1 = gson1.toJson(comments_Data);

		System.out.println(json1);
		// Date and current time
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
		Calendar cal = Calendar.getInstance();
		String mynamefile = "CommentsLego" + dateFormat.format(cal.getTime()) + ".txt";
		// String
		// mynamefileTotal="InfluenceTotal_quirky"+dateFormat.format(cal.getTime())+".txt";
		try {
			FileWriter writer = new FileWriter(mynamefile);
			writer.write(json1);
			writer.close();
			System.out.println("Write file: Success");
			System.out.print("Length_Fluence: ");

		} catch (Exception e) {
			// TODO: handle exception

		}

	}
}
