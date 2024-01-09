package Book;

public class playground {

    public static void main(String[] args) {
        book myBook = new book("The Great Book", 100, 10);
        // Test 1: Go to the first page
        myBook.goToFirstPage();
        System.out.println("Test 1 - Current Page should be 1: " + myBook.getCurrentPageNumber());
        
        // Test 2: Go to the last page
        myBook.goToLastPage();
        System.out.println("Test 2 - Current Page should be 100: " + myBook.getCurrentPageNumber());
        
        // Test 3: Go to page number 50
        myBook.goToPage(50);
        System.out.println("Test 3 - Current Page should be 50: " + myBook.getCurrentPageNumber());
        
        // Test 4: Go to the bookmarked page
        myBook.goToBookmarkedPage();
        System.out.println("Test 4 - Current Page should be 10: " + myBook.getCurrentPageNumber());
        
        // Test 5: Go to the next page from the bookmarked page
        myBook.goToNextPage();
        System.out.println("Test 5 - Current Page should be 11: " + myBook.getCurrentPageNumber());
        
        // Test 6: Go back to the previous page
        myBook.goToPreviousPage();
        System.out.println("Test 6 - Current Page should be 10: " + myBook.getCurrentPageNumber());
        
        // Test 7: Place a bookmark at page 75
        myBook.placeBookmark(75);
        System.out.println("Test 7 - Bookmarked Page should be 75: " + myBook.getBookmarkedPageNumber());
        
        // Test 8: Show the total number of pages
        System.out.println("Test 8 - Total Number of Pages should be 100: " + myBook.getTotalNumberOfPages());
        
        // Test 9: Show the current page number
        System.out.println("Test 9 - Current Page should be 10: " + myBook.getCurrentPageNumber());
        
        // Test 10: Show the bookmarked page number
        System.out.println("Test 10 - Bookmarked Page should be 75: " + myBook.getBookmarkedPageNumber());

        myBook.setPageContent(1, "This is First page");
        myBook.setPageContent(2, "I want this work to be rated 10 out of 10.");
        myBook.setPageContent(3, "page 3 jaaaaaaa");
        myBook.setPageContent(4, "page 4");
        myBook.setPageContent(5, "page 5555555");
        
        // Displaying content of pages 1-5
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Content of Page " + i + ": " + myBook.getPageContent(i));
        }
    }
}