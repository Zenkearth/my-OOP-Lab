package Book;

public class book {
    private int lastPage, bookMark;
    private String[] page;
    private int currentPage = 1;

    public book(String name, int lastPage, int bookMark) {
        if (lastPage <= 0) {
            throw new IllegalArgumentException("The book must have more than or equal to 1 page.");
        }
        if (bookMark <= 0 || bookMark > lastPage) {
            throw new IllegalArgumentException("Bookmarks must be in books only.");
        }
        this.page = new String[lastPage];
        this.page[0] = name;
        for (int i = 0; i < lastPage; i++) {
            this.page[i] = "";
        }
        this.lastPage = lastPage;
        this.bookMark = bookMark;
        this.currentPage = 1;
    }

    // get component ------------------------------------------------------------------------
    public void printComponent() {
        System.out.printf("This is a book name : %s\nThe book has a total of %d pages\nThe bookmark is on page %d\n",
                page[0], lastPage, bookMark);
    }

    // Behavior------------------------------------------------------------------------------
    public String getPageContent(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= lastPage) {
            return this.page[pageNumber - 1];
        } else {
            return "Invalid page number to get content.";
        }
    }

    public void setPageContent(int pageNumber, String content) {
        if (pageNumber >= 1 && pageNumber <= lastPage) {
            this.page[pageNumber - 1] = content;
        } else {
            System.out.println("Invalid page number to set content.");
        }
    }

    public void goToFirstPage() {
        currentPage = 1;
    }

    public void goToLastPage() {
        currentPage = lastPage;
    }

    public void goToPage(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= lastPage) {
            currentPage = pageNumber;
        } else {
            System.out.println("Invalid page number.");
        }
    }

    public void goToBookmarkedPage() {
        currentPage = bookMark;
    }

    public void goToNextPage() {
        if (currentPage < lastPage) {
            currentPage++;
        }
    }

    public void goToPreviousPage() {
        if (currentPage > 1) {
            currentPage--;
        }
    }

    public void placeBookmark(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= lastPage) {
            bookMark = pageNumber;
        } else {
            System.out.println("Invalid page number for bookmark.");
        }
    }

    public int getTotalNumberOfPages() {
        return lastPage;
    }

    public int getCurrentPageNumber() {
        return currentPage;
    }

    public int getBookmarkedPageNumber() {
        return bookMark;
    }

}