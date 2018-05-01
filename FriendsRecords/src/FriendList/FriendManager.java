package FriendList;

import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FriendManager {

    private ArrayList<Friend> friends;

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }

    public FriendManager(JSONArray friendsArr) throws JSONException {
        friends = new ArrayList<Friend>();
        for (Object frndObj : friendsArr) {
            Friend friend = new Friend((JSONObject) frndObj);
            friends.add(friend);
        }
    }

    public ArrayList<Friend> getNearby(double baseLat, double baseLon, int thresholdDistance) {
        ArrayList<Friend> nearByFriends = new ArrayList<Friend>();
        for (Friend frnd : friends) {
            double frndDistance = DistanceCalculator.getDistance(frnd, baseLat, baseLon);
            if (frndDistance <= thresholdDistance) {
                nearByFriends.add(frnd);
            }
        }
        return nearByFriends;
    }

    public void sort(ArrayList<Friend> nearByfriends) {
        Collections.sort(nearByfriends);
    }

    public void printNearBy(ArrayList<Friend> nearByfriends) {
        for (Friend frnd : nearByfriends) {
            System.out.println(frnd);
        }
    }
}
