import java.time.temporal.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.time.*;

public class FilesFind {
    public static void main (String args[]) throws IOException {
        Path directory = Paths.get(".");
        Instant ieri = Instant.now().minus(30, ChronoUnit.MINUTES);
        try (Stream<Path> files = Files.find(directory, 1,
                (path, attributi) -> attributi.creationTime().toInstant().compareTo(ieri) >= 0)) {
            files.forEach(System.out::println);
        }
    }
}