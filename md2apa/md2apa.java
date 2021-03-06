import java.io.*;
import java.nio.file.*;

public class md2apa {
    static FileWriter outputFile;

    static void out(String s) {
        try {
            outputFile.write(s+"\n");
        } catch (Exception e) {
            System.out.println("Can't Write to file! ");
        }
    }

    public static void main(String[] args) throws IOException {
        outputFile = new FileWriter("essay.html");
        out("<html>");
        out("""
                <head>
                    <link rel="stylesheet" type="text/css" href="apa.css">
                    <title>APA-HTML-test</title>
                </head>
                    """);
        out("<body>");

        for (var sectionType : new String[] { "header", "content", "reference" }) {
            out("<section class=\"" + sectionType + "\" >");
            Files.readAllLines(Paths.get(sectionType + ".txt"))
                    .forEach(
                            s -> {
                                out("<p>");
                                out(s);
                                out("</p>");
                            });
            out("</section>");
        }
        outputFile.close();
    }
}