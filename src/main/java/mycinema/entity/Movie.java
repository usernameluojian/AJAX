package mycinema.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Movie {
	public Movie(){}
	public Movie(int id, String title, String movieCode, String director, Date dateReleased, int categoryId,
			String categoryName) {
		super();
		this.id = id;
		this.title = title;
		this.movieCode = movieCode;
		this.director = director;
		this.dateReleased = dateReleased;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	private int id;
	private String title;
	private String movieCode;
	private String director;
	private Date dateReleased;
	private int categoryId;
	private String categoryName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMovieCode() {
		return movieCode;
	}
	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Date getDateReleased() {
		return dateReleased;
	}
	public void setDateReleased(Date dateReleased) {
		this.dateReleased = dateReleased;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
