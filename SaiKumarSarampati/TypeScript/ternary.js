var ternary_operator = /** @class */ (function () {
    function ternary_operator() {
    }
    ternary_operator.prototype.condition = function () {
        var first = 7;
        var second = 9;
        var result = (first > second) ? "That is true : 7>9" : "That is false : 7<9";
        console.log(result);
    };
    return ternary_operator;
}());
var obj = new ternary_operator();
obj.condition();
