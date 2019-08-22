function class1() {
    this.propertyName = "A js property";
    this.fun = function () { console.log("hureykaa"); };
}
var obj = new class1();
console.log(obj);
console.log(obj.fun);
var a = "a";
var arr = ["a", "b", "c"];
var object = { key: 'value' };
function fun() {
    return "Typing to have fun";
}
var fundoo = function () {
    return " hurrery";
};
console.log(fun());
console.log(fundoo());
console.log(arr);
