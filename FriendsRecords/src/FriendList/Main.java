package FriendList;

import org.json.JSONException;

public class Main {

    public static void main(String[] args) throws JSONException {

        org.json.simple.JSONArray jsonArray = Utility.readJson(FriendConstants.friendsFilePath);
        FriendManager friends = new FriendManager(jsonArray);
        friends.sort();
        friends.printStudents(FriendConstants.baseLat, FriendConstants.baseLon, FriendConstants.thresholdDistance);
    }

}
