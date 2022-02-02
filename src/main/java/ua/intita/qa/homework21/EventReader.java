package ua.intita.qa.homework21;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventReader {
    Stream<String> lineStream;

    public List<Event> readFromCsv(String path) {
        List<Event> eventList = new ArrayList<>();
        List<String[]> lines = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
            lines = csvReader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        if (!lines.isEmpty()) {
            return lines.stream()
                    .map(line -> new Event(
                            line[0],
                            line[1],
                            LocalDateTime.of(
                                    Integer.parseInt(line[2].split(",")[0]),
                                    Integer.parseInt(line[2].split(",")[1]),
                                    Integer.parseInt(line[2].split(",")[2]),
                                    Integer.parseInt(line[2].split(",")[3]),
                                    Integer.parseInt(line[2].split(",")[4]),
                                    Integer.parseInt(line[2].split(",")[5])),
                            line[3]))
                    .collect(Collectors.toList());
        }
        return null;
    }
}
