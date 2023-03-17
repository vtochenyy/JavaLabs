package Lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Page {
    private final Collection<String> paragraphs;

    public Page(){
        this.paragraphs = new ArrayList<>();
        System.out.println("Page was created");
    }

    public void addParagraph(Paragraph paragraph){
        this.paragraphs.add(paragraph.text);
    }

    public void printParagraphs(){
        System.out.println("Paragraphs: \n");
        this.paragraphs.forEach(System.out::println);
    }
}
