//tyepescript= js + datatypes
function class1() {
    this.propertyName = "A js property";
    this.fun = function () { console.log("js fucntion"); };
}
var obj = new class1();
console.log(obj);
console.log(obj.fun());
var a = "A string";
var b = 100;
var arr = ["mobiles", "cables", "laptop"];
var tsobj = { key: 'value' };
function fun() {
    return "trying to have fun";
}
var f = "";
var fundoo = function () {
    return "ha ha";
};
console.log(fun());
console.log(fundoo());
console.log(arr);
