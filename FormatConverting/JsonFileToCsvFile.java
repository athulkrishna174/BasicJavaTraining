package org.kodejava.json;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONTokener;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class JsonFileToCsvFile {
    public static void main(String[] args) {
        // Get data.json resource as InputStream, create JSONTokener
        // and convert the tokener into JSONArray object.
        InputStream is = JsonFileToCsvFile.class.getResourceAsStream("/data.json");
        JSONTokener tokener = new JSONTokener(Objects.requireNonNull(is));
        JSONArray jsonArray = new JSONArray(tokener);

        try {
            // Convert JSONArray into csv and save to file
            String csv = CDL.toString(jsonArray);
            Files.write(Path.of("data.csv"), csv.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}