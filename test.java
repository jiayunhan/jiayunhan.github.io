public ReturnInfo getMaxPath(Node n){
//Base case
if(n==null) return new ReturnInfo();
//This is a bottom up recursion. Info will flow from leaves to root.
//So first recurse and then do the work at this node level
//Recurse left & right
ReturnInfo leftReturnInfo = getMaxPath(n.leftchild);
ReturnInfo rightReturnInfo = getMaxPath(n.rightchild);

//Do work in this recursion or for this node 
ReturnInfo retInfo = new ReturnInfo();

//Update all 4 parameters of returninfo and we are done

retInfo.maxheight = max(leftReturnInfo.maxheight, rightReturnInfo.maxheight) + 1;
//Update retInfo.heightList accordingly
retInfo.heightList = ....

retInfo.maxPathLen = max(leftReturnInfo.maxPathLen, rigthReturnInfo.maxPathLen, leftReturnInfo.maxHeight+rightReturnInfo.maxHeight+1);

//Remember from where maxPathLen came from and update accordingly
retInfo.pathList = .....

return retInfo;//We are done 

}