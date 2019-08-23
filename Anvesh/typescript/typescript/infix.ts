InfixToPostfix = function(expression){
	var pfixString = "";
	var infixStack = new EX.LinkedStack();
	
	// Helper function to get the precedence of the operator
	var precedence = function(operator){
		switch(operator){
		case "^":
			return 3;
		case "*":
		case "/":
			return 2;
		case "+":
		case "-":
			return 1;
		default:
			return 0;
		}
	}
	
	for(var i=0; i<expression.length; i++){
		var c = expression.charAt(i);
		if(!isNaN(parseInt(c))){
			pfixString += c;
		}else if(c === "+" || c==="-" || c === "*" || c==="/" || c==="^"){
			while(c != "^" && !infixStack.isStackEmpty() && (precedence(c) <= precedence(infixStack.stackTop()))){
				pfixString += infixStack.popFromStack().item;
			}
			infixStack.pushToStack(c);
		}
	}
	while(!infixStack.isStackEmpty()){
		pfixString += infixStack.popFromStack().item;
	}
	
	
	
	this.getPostfix = function(){
		return pfixString;
	}
}



console.log("INFIX to POSTFIX");
var in1 = new EX.InfixToPostfix("2+3*4"); //234*+
console.log("Postfix 2+3*4 ==> "+in1.getPostfix());