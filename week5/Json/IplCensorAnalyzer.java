package Day2;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.*;
import java.io.*;
import java.util.*;

class Match {
    public String team1;
    public String team2;
    public String player_of_match;

    public Match() {}
    public Match(String team1, String team2, String player_of_match) {
        this.team1 = team1;
        this.team2 = team2;
        this.player_of_match = player_of_match;
    }
}

public class IplCensorAnalyzer {
    public static void main(String[] args) {
        processJson("ipl_input.json", "ipl_output.json");
        processCsv("ipl_input.csv", "ipl_output.csv");
    }

    static void processJson(String inputPath, String outputPath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Match[] matches = mapper.readValue(new File(inputPath), Match[].class);
            for (Match m : matches) {
                m.team1 = maskTeamName(m.team1);
                m.team2 = maskTeamName(m.team2);
                m.player_of_match = "REDACTED";
            }
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File(outputPath), matches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void processCsv(String inputPath, String outputPath) {
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            MappingIterator<Match> it = csvMapper.readerFor(Match.class).with(schema).readValues(new File(inputPath));
            List<Match> matches = it.readAll();
            for (Match m : matches) {
                m.team1 = maskTeamName(m.team1);
                m.team2 = maskTeamName(m.team2);
                m.player_of_match = "REDACTED";
            }
            CsvSchema outSchema = csvMapper.schemaFor(Match.class).withHeader();
            csvMapper.writer(outSchema).writeValue(new File(outputPath), matches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String maskTeamName(String name) {
        int index = name.indexOf(' ');
        if (index > 0) {
            return name.substring(0, index) + " ***";
        }
        return "***";
    }
}
