package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class FileManager {

    private File file;

    public FileManager(String path) {
        file = new File(path);
    }

    public void finalize() {

    }

    public JSONArray loadFile() {
        try {
            Scanner scan = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (scan.hasNextLine()) {
                sb.append(scan.nextLine());
            }
            scan.close();
            String jsonStr = sb.toString();
            JSONParser parser = new JSONParser();
            try {
                return (JSONArray) parser.parse(jsonStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return null;
    }

    public boolean saveFile(JSONArray fileObj) {
        try{
            FileWriter fw = new FileWriter(file);
            fw.write(fileObj.toJSONString());
            fw.close();
            return true;
        }catch(IOException e){
            System.out.println(e);
        }
        return false;
    }
}