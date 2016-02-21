What is leaf node in binary tree?
A node in a binary tree which do have any child nodes is called leaf node. The leaf node do have any children i.e. left and right reference both null. We have to count the number of leaves nodes in the binary tree. In other ways we need to find out all the nodes in the binary tree which do not have any child.

	As an example, consider the tree:
	
					   100   ------Level 0
					  /  \
					50    150 -----Level 1
					/ \    \
				   25  80  160 ---Level 2
							 
							  
						  

	As shown in Binary Tree, what 3 leaves nodes.

	
We can go through the complete code. We have created 3 packages
1.) org.learn.PrepareTree : Under this package we are creating the tree (This tree we will Traverse to find out number of leaves node in binary tree).
2.) org.learn.Question: Under this question package, we will have CountLeaves class which is responsible for traversing the tree using level order traversal, to calculate the number of leaves in binary tree,
3.) org.learn.Client: Under this package we have main function, where we are constructing the tree and then we are traversing the whole tree using level order traversal.