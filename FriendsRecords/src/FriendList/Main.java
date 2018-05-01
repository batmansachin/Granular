package FriendList;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.simple.JSONArray;

public class Main {

    public static void main(String[] args) throws JSONException {
        JSONArray jsonArray = Utility.readJson(FriendConstants.friendsFilePath);
        FriendManager friendManager = new FriendManager(jsonArray);
        ArrayList<Friend> nearByfriends = friendManager.getNearby(FriendConstants.baseLat, FriendConstants.baseLon, FriendConstants.thresholdDistance);
        friendManager.sort(nearByfriends);
        friendManager.printNearBy(nearByfriends);
    }

}
