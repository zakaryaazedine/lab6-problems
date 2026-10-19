package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents = new ArrayList<>();

    public Library(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity < documents.size()) return;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity + ", Documents: " + documents.size();
    }

    public void displayDocuments() {
        if (documents.isEmpty()) System.out.println("The library is empty.");
        for (int i = 0; i < documents.size(); i++) System.out.println(documents.get(i));
    }

    public boolean add(Document doc) {
        if (doc == null || documents.contains(doc) || documents.size() >= capacity) return false;
        return documents.add(doc);
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getNumRec() == numEnrg) return documents.get(i);
        }
        return null;
    }

    public void displayAuthors() {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i) instanceof Book) System.out.println(((Book) documents.get(i)).getAuthor());
        }
    }
}
