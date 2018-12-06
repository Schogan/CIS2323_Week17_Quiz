 
 public class UseBook { 
	 public static void main(String[] args) { 
		 Fiction fictionBook = new Fiction(); 
		 NonFiction nonFictionBook = new NonFiction(); 
		 fictionBook.setTitle("Book A Fiction"); 
		 nonFictionBook.setTitle("Book B NonFiction"); 
		 System.out.print(fictionBook.getTitle() + " costs "); 
		 fictionBook.setPrice(); 
		 System.out.print(nonFictionBook.getTitle() + " costs "); 
		 nonFictionBook.setPrice(); 
	 }
 }