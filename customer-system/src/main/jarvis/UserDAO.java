package src.main.jarvis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UserDAO {
	
	public UserDAO(){
		
	}
	
	public ArrayList<Users> readJsonData()
	{
		ArrayList<Users> users = new ArrayList<Users>();
		
		try {
			JSONParser json_parser = new JSONParser();
			BufferedReader reader = new BufferedReader(new FileReader(getClass().getResource("/test/src/resources/testData.json").getFile()));
			StringBuilder sb = new StringBuilder();
			String line = null;
			
			while((line = reader.readLine()) != null){
				sb.append(line);
			}
			
			reader.close();
			
			JSONArray json_arr = (JSONArray) json_parser.parse(sb.toString());
			
			for(int i=0; i<json_arr.size(); i++){
				JSONObject json_obj = (JSONObject) json_arr.get(i);
				Users user = new Users();
				user.setId(json_obj.get("id").toString());
				user.setName(json_obj.get("name").toString());
				user.setAge(Integer.parseInt(json_obj.get("age").toString()));
				user.setGender(json_obj.get("gender").toString());
				
				users.add(user);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
	
	public boolean saveJsonUserData(ArrayList<Users> users)
	{
		
		return false;
	}
	
	
	
	
	
	
	
	
}
