 
 public class UseBook { 
	 public static void main(String[] args) { 
		 Fiction fictionBook = new Fiction(); 
		 fictionBook.setTitle("Book A: Fiction"); 
		 System.out.print(fictionBook.getTitle() + " costs " + fictionBook.getPrice() + "\n"); 
		 fictionBook.setPrice();
		 
		 NonFiction nonFictionBook = new NonFiction(); 
		 nonFictionBook.setTitle("Book B: NonFiction"); 
		 System.out.print(nonFictionBook.getTitle() + " costs " + nonFictionBook.getPrice() + "\n"); 
		 nonFictionBook.setPrice(); 
	 }
 }