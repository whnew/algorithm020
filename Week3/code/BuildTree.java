package week3;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, preorder.length, 0, inorder.length, map);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd, Map<Integer, Integer> map){
        if (pStart > pEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        int index = map.get(preorder[pStart]);
        int len = index - iStart;
        root.left = buildTree(preorder, inorder, pStart + 1, pStart + len, iStart, index - 1, map);
        root.right = buildTree(preorder, inorder, pStart + len + 1, pEnd, index + 1, iEnd, map);
        return root;
    }
}
