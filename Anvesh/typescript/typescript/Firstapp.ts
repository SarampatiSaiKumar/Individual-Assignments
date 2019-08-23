//tyepescript= js + datatypes
function class1(){
    this.propertyName="A js property";
    this.fun=function(){console.log("js fucntion")};
    
}

var obj= new class1();
console.log(obj);
console.log(obj.fun());


var a:string ="A string";
var b:number=100;
var arr:string[]=["mobiles","cables","laptop"];
var tsobj:any={key:'value'};


function fun():string{
return "trying to have fun";
}

var f:string="";
var fundoo= function():string{
    return "ha ha";
}
console.log(fun());
console.log(fundoo());
console.log(arr);