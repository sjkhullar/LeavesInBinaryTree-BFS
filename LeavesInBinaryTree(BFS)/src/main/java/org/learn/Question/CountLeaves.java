
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeaves {
	public static int countLeaves(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		int nLeaves = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			
			if(node.left == null && node.right == null) {
				nLeaves++;
				continue;
			}			
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		System.out.println("Leaves in Binary Tree is : " + nLeaves);
		return nLeaves;
	}
}
