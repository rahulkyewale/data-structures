package com.study.trees;

public class Tree 
{
	private TreeNode root;
	
	public void insert(int value)
	{
		if(root == null)
		{
			root = new TreeNode(value);
		}
		else
		{
			root.insert(value);
		}
	}
	
	public void traverseInOrder()
	{
		if (root != null) 
		{
			root.traverseInOrder();
		}
	}
	
	public void traversePreOrder()
	{
		if (root != null) 
		{
			root.traversePreOrder();
		}
	}
	
	public TreeNode get(int value)
	{
		if(root != null)
		{
			return root.get(value);
		}
		
		return null;
	}
	
	public TreeNode getMin()
	{
		if(root != null)
		{
			return root.getMin();
		}
		
		return null;
	}
	
	public TreeNode getMax()
	{
		if(root != null)
		{
			return root.getMax();
		}
		
		return null;
	}
	
	public void delete(int value)
	{
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subTreeRoot, int value)
	{
		if(subTreeRoot == null)
		{
			return subTreeRoot;
		}
		
		if(value < subTreeRoot.getData())
		{
			subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
		}
		else if( value > subTreeRoot.getData())
		{
			subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
		}
		else
		{
			// Case 1 or 2: Delete the node with 0 or 1 child
			if(subTreeRoot.getLeftChild() == null)
			{
				return subTreeRoot.getRightChild();
			}
			else if(subTreeRoot.getRightChild() == null)
			{
				return subTreeRoot.getLeftChild();
			}
			// Case 3 : Delete node with 2 childs
			else
			{
				subTreeRoot.setData(subTreeRoot.getLeftChild().getMax().getData());
				subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), subTreeRoot.getData()));
				
				// OR
				
				//subTreeRoot.setData(subTreeRoot.getRightChild().getMin().getData());
				//subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
				
				// OR
				
				//int max = subTreeRoot.getLeftChild().getMax().getData();
				//delete(max);
				//subTreeRoot.setData(max);
			}
		}
		
		return subTreeRoot;
	}
}
