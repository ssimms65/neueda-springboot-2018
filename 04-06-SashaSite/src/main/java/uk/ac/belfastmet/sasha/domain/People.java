package uk.ac.belfastmet.sasha.domain;

public class People {
	
	private String name;
	private String author;
	private String image;
	
	
	public People() {
		super();
	}

	public People(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	
	}
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getImage() {
			return image;
		}


		public void setImage(String image) {
			this.image = image;
		}


		
		
		
	}
