package problem3;

public class Document {
    private static int count = 0;
    private final int numRec;
    private String title;

    public Document(String title) {
        numRec = ++count;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Number: " + numRec + ", Title: " + title;
    }

}
