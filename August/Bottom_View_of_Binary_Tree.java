package Auguest;

import java.util.*;

public class Bottom_View_of_Binary_Tree {
     class Pair {
          int y; // Vertical level
          int data; // Node value

          Pair(int y, int data) {
               this.y = y;
               this.data = data;
          }
     }

     class Pair {
          int y; // Vertical level
          int data; // Node value

          Pair(int y, int data) {
               this.y = y;
               this.data = data;
          }
     }

     // Method to perform the recursive traversal and populate the map
     public void solve(Node root, int x, int y, TreeMap<Integer, Pair> mp) {
          // Base case: if the current node is null, return
          if (root == null) {
               return;
          }

          // Check if the current horizontal distance is not present in the map
          // or the vertical level is greater or equal to the current stored level
          if (!mp.containsKey(x) || mp.get(x).y <= y) {
               mp.put(x, new Pair(y, root.data));
          }

          // Recur for left and right children
          solve(root.left, x - 1, y + 1, mp);
          solve(root.right, x + 1, y + 1, mp);
     }

     // Function to return a list containing the bottom view of the given tree
     public ArrayList<Integer> bottomView(Node root) {
          TreeMap<Integer, Pair> mp = new TreeMap<>();
          ArrayList<Integer> ans = new ArrayList<>();

          // Populate the TreeMap using the solve function
          solve(root, 0, 0, mp);

          // Extract the values from the map and add them to the result list
          for (Map.Entry<Integer, Pair> entry : mp.entrySet()) {
               ans.add(entry.getValue().data);
          }

          return ans;
     }

     // Method to perform the recursive traversal and populate the map
     public void solve(Node root, int x, int y, TreeMap<Integer, Pair> mp) {
          // Base case: if the current node is null, return
          if (root == null) {
               return;
          }

          // Check if the current horizontal distance is not present in the map
          // or the vertical level is greater or equal to the current stored level
          if (!mp.containsKey(x) || mp.get(x).y <= y) {
               mp.put(x, new Pair(y, root.data));
          }

          // Recur for left and right children
          solve(root.left, x - 1, y + 1, mp);
          solve(root.right, x + 1, y + 1, mp);
     }

     // Function to return a list containing the bottom view of the given tree
     public ArrayList<Integer> bottomView(Node root) {
          TreeMap<Integer, Pair> mp = new TreeMap<>();
          ArrayList<Integer> ans = new ArrayList<>();

          // Populate the TreeMap using the solve function
          solve(root, 0, 0, mp);

          // Extract the values from the map and add them to the result list
          for (Map.Entry<Integer, Pair> entry : mp.entrySet()) {
               ans.add(entry.getValue().data);
          }

          return ans;
     }

     public static void main(String[] args) {

     }

}