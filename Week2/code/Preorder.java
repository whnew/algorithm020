package week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 */
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        pre(root, res);
        return res;
    }

    public void pre(Node root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        if(root.children != null){
            for(Node node : root.children){
                pre(node, res);
            }
        }
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}