package FriendList;

import org.json.JSONException;
import org.json.simple.JSONObject;

public class Friend implements Comparable {

    private String name;
    private int id;
    private double latitude;
    private double longitude;

    public Friend(JSONObject friend) throws JSONException {
        this.name = (String) friend.get("name");
        this.id = Integer.parseInt(String.valueOf(friend.get("user_id")));
        this.latitude = Double.parseDouble(String.valueOf(friend.get("latitude")));
        this.longitude = Double.parseDouble(String.valueOf(friend.get("longitude")));
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(final double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(final double longitude) {
        this.longitude = longitude;
    }

    @Override
    public int compareTo(Object frnd) {
        int compareId = ((Friend) frnd).getId();
        return this.id - compareId;
    }

    @Override
    public String toString() {
        return "[ name=" + name + ", id=" + id + "]";
    }
}
