package com.github.rodiond26.stage_2.neetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    int index = 0;

    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        List<Integer> list = new ArrayList<>();
        valueOf(root, list);

        String values = String.join(",", list.stream().map(String::valueOf).toList());
        return "[" + values + "]";
    }

    public void valueOf(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(null);
            return;
        }
        list.add(root.val);
        valueOf(root.left, list);
        valueOf(root.right, list);
    }

    public TreeNode deserialize(String data) {
        this.index = 0;
        String preparedData = data.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] values = preparedData.split(",");

        if (values.length == 0) {
            return null;
        }

        return makeTreeNode(values);
    }

    public TreeNode makeTreeNode(String[] values) {
        if (index >= values.length || values[index].equals("null") || values[index].isBlank()) {
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[index]));
        index++;
        node.left = makeTreeNode(values);
        node.right = makeTreeNode(values);
        return node;
    }
}
