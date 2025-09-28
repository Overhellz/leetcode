package com.github.rodiond26.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution20250924 {
}

class Solution841 {
    private Set<Integer> visitedRooms = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        traverse(rooms, 0);
        return rooms.size() == visitedRooms.size();
    }

    private void traverse(List<List<Integer>> rooms, int startRoom) {
        visitedRooms.add(startRoom);

        for (Integer nextRoom : rooms.get(startRoom)) {
            if (!visitedRooms.contains(nextRoom)) {
                traverse(rooms, nextRoom);
            }
        }
    }
}
