// Yunning ZHOU, MACS. A Tree Printer class extending the abstract TreeAction class.
package dataStructure;

public class TreePrinter extends TreeAction {

	@Override
	// Notice: Use Tree.TreeNode instead of TreeNode.
	public void run(Tree.TreeNode n) {
		// TODO Auto-generated method stub
		System.out.println(n.value);
	}

}