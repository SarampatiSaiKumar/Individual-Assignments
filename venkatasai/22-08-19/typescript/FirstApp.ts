
function class1(){
    this.propertyName="A js property";
this.fun = function(){console.log("hureykaa");}

}

var obj= new class1();
console.log(obj);
console.log(obj.fun);

var a:string ="a";
var arr:string[] =["a","b","c"];

var object: any = { key : 'value'};


function fun(): string{

    return "Typing to have fun";
}
var fundoo: any = function() : string{
    return " hurrery"
};
console.log(fun());
console.log(fundoo())
console.log(arr)