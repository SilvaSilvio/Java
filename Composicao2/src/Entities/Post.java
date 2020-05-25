package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer like;

	private List<Comment> comment = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer like) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void addComment(Comment comments) {
		comment.add(comments);
	}

	public void removeComment(Comment comments) {
		comment.remove(comments);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(like + "Likes");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();

	}

}
