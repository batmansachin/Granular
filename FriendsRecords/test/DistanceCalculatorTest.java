
import FriendList.DistanceCalculator;
import FriendList.Friend;
import FriendList.FriendConstants;
import FriendList.FriendManager;
import FriendList.Utility;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.junit.Test;

public class DistanceCalculatorTest {

    @Test
    public void testDistance() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("latitude", "12.986375");
        object.put("longitude", "77.043701");
        object.put("name", "Chris");
        object.put("user_id", 12);
        Friend friend = new Friend(object);
        Assert.assertEquals(DistanceCalculator.getDistance(friend, FriendConstants.baseLat, FriendConstants.baseLon), 64.26480291995638);

    }
}
