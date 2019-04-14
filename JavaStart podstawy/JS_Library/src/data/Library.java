package data;

public class Library {
    public static final int MAX_PUBLICATIONS = 2000;
    private Publication[] publications;
    private int publicationNumbers;

    public Library() {
        publications = new Publication[MAX_PUBLICATIONS];
    }

    public Publication[] getPublications() {
        return publications;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }

    public int getPublicationNumbers() {
        return publicationNumbers;
    }

    public void setPublicationNumbers(int publicationNumbers) {
        this.publicationNumbers = publicationNumbers;
    }

    public void addBook(Book book) {
        addPublication(book);

    }
    public void addMagazine(Magazine magazine){
        addPublication(magazine);
    }

    public void addPublication(Publication pub) throws ArrayIndexOutOfBoundsException{
        if(publicationNumbers==MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("MAX PUBLICATIONS "+MAX_PUBLICATIONS);

        }
        publications[publicationNumbers]=pub;
        publicationNumbers++;
    }



}
