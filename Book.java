

public abstract class Book {
		private String title; 
		private double price=0;
				
		Book(String a){
			setTitle();
		}
		
		public void setTitle(String bookTitle){
			title = bookTitle; 
		}
		public abstract void setPrice();
		
		public String getTitle(){ 
			return title; 
		}
		public double getPrice(){
			return price;
		}
}