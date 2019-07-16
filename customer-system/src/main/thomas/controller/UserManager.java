package controller;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.User;


public class UserManager {

    private static String DB_PATH = "./testData.json"; 

    private FileManager fileManager;
    private ArrayList<User> userList;

    public UserManager() {
        this.fileManager = new FileManager(DB_PATH);
        this.userList = loadUserList();
    }

    public void finalize(){
        
    }

    public void createUser(String id, String name, int age, String sex) {
        User user = new User(id, name, age, sex);
        userList.add(user);
        saveUserList();
    }

    public void deleteUser(User user) {
        userList.remove(user);
        saveUserList();
    }

    public void updateUser(User user) {
        saveUserList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    private ArrayList<User> loadUserList() {
        userList = new ArrayList<User>();
        JSONArray jsonArr = fileManager.loadFile();
        
        for(int i = 0; i < jsonArr.size(); i++) {
            JSONObject jsonObj = (JSONObject) jsonArr.get(i);
            String id = (String) jsonObj.get("id");
            String name = (String) jsonObj.get("name");
            int age = Integer.parseInt(jsonObj.get("age").toString());
            String sex = (String) jsonObj.get("gender");
            User user = new User(id, name, age, sex);
            userList.add(user);
        }
        return userList;
    }

    private void saveUserList() {
        JSONArray jsonArr = new JSONArray();
        for(User user : userList) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("id", "user.getId()");
            jsonObj.put("name", user.getName());
            jsonObj.put("age", user.getAge());
            jsonObj.put("sex", user.getSex());
            jsonArr.add(jsonObj);
        }
        fileManager.saveFile(jsonArr);
    }

}