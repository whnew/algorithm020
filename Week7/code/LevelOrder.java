package week7;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return null;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
