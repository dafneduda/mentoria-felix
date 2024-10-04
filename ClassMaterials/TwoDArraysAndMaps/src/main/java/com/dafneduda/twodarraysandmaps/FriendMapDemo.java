package com.dafneduda.twodarraysandmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class FriendMapDemo {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> friendMap;
        friendMap = new HashMap<String, ArrayList<String>>();
        friendMap.put("Jason", new ArrayList<String>());
        System.out.println(friendMap);
        ArrayList<String> jasonsFriends = friendMap.get("Jason");
        jasonsFriends.add("Aaron");
        System.out.println(friendMap);

        friendMap.get("Jason").add("JP");
        System.out.println(friendMap);

        friendMap.put("Felix", new ArrayList<String>());
        friendMap.get("Felix").add("Dafne");
        friendMap.get("Felix").add("Marcelo");
        friendMap.get("Felix").add("Pri");
        System.out.println(friendMap);
    }

}
