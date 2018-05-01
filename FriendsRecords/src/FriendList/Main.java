
package FriendList;

import org.json.JSONArray;
import org.json.JSONException;
//import org.json.simple.JSONException;

public class Main {

	public static void main(String[] args) throws JSONException {
		
           
            org.json.simple.JSONArray jsonArray = Utility.readJson(FriendConstants.friendsFilePath);
            FriendManager friends = new FriendManager(jsonArray); 
            friends.sort();
            friends.printStudents(FriendConstants.baseLat, FriendConstants.baseLon, FriendConstants.thresholdDistance);
	}
	
}
