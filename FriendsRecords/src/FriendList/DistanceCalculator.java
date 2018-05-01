/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FriendList;

/**
 *
 * @author sachin
 */
public class DistanceCalculator {

    public static double getDistance(Friend friend, double srcLat, double srcLon) {
        srcLat = Math.toRadians(srcLat);
        srcLon = Math.toRadians(srcLon);
        double lat = Math.toRadians(friend.getLatitude());
        double lon = Math.toRadians(friend.getLongitude());
        double lonDiff = Math.abs(srcLon - lon);
        double sin = Math.sin(srcLat) * Math.sin(lat);
        double cos = Math.cos(srcLat) * Math.cos(lat) * Math.cos(lonDiff);

        double sum = sin + cos;

        double centralAngle = Math.acos(sum); //in degrees
        double arcLength = FriendConstants.radius * centralAngle;
        return arcLength; //kilometer
    }

}
