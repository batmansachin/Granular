
import FriendList.FriendConstants;
import FriendList.FriendManager;
import FriendList.Utility;
import junit.framework.Assert;
import org.json.JSONException;
import org.junit.Test;

public class FriendManagerTest {

    @Test
    public void Test() throws JSONException {
        org.json.simple.JSONArray jsonArray = Utility.readJson(FriendConstants.friendsFilePath);
        FriendList.FriendManager friends = new FriendManager(jsonArray);
        
        Assert.assertEquals(friends.getFriends().size(), 32);
        friends.printStudents(FriendConstants.baseLat, FriendConstants.baseLon, FriendConstants.thresholdDistance);
        Assert.assertEquals(friends.getFriends().size(), 11);
    }

}
