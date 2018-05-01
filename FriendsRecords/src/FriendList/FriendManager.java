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
            Friend friend = new Friend((org.json.simple.JSONObject) frndObj);
            friends.add(friend);
        }
    }

    private void keepNearby(double baseLat, double baseLon, int thresholdDistance) {
        ArrayList<Friend> nearbyFriends = new ArrayList<Friend>();
        for (Friend frnd : friends) {
            double frndDistance = frnd.distance(baseLat, baseLon);
            if (frndDistance <= thresholdDistance) {
                nearbyFriends.add(frnd);
            }
        }
        friends= nearbyFriends;
    }

    public void sort() {
        Collections.sort(friends);
    }

    public void printStudents(double baseLat, double baseLon, int thresholdDistance) {

        keepNearby(baseLat, baseLon, thresholdDistance);
        for (Friend frnd : friends) {

            System.out.println(frnd);
        }
    }
}
