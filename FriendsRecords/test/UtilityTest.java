
import FriendList.FriendConstants;
import FriendList.Utility;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {

    @Test
    public void Test() throws JSONException {
        org.json.simple.JSONArray jsonArray = Utility.readJson(FriendConstants.friendsFilePath);
        Assert.assertNotNull(jsonArray);

    }

}
