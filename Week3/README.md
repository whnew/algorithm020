回溯：一种递归实现，在递归的过程中需要进行一些清除操作
public void function(level, params){
	//1、递归终止条件.
	if(level){
		return;
	}

	//2、处理当前层的逻辑

	//3、进入下一层
	func(level + 1, params)

	//4、revert current level state
}
