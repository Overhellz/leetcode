package com.github.rodiond26.stage_2.ten.p14_graph_intro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

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

class Solution841_2 {
    private Set<Integer> seen = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        seen = new HashSet<>();
        seen.add(0);
        traverse(rooms, 0);

        return seen.size() == rooms.size();
    }

    public void traverse(List<List<Integer>> rooms, int roomNumber) {
        List<Integer> room = rooms.get(roomNumber);
        for (Integer n : room) {
            if (!seen.contains(n)) {
                seen.add(n);
                traverse(rooms, n);
            }
        }
    }
}

class Solution841_stack {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        seen.add(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int room = stack.pop();

            for (Integer roomNumber : rooms.get(room)) {
                if (!seen.contains(roomNumber)) {
                    seen.add(roomNumber);
                    stack.push(roomNumber);
                }
            }
        }

        return seen.size() == rooms.size();
    }
}
