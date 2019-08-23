var ternary_operator = /** @class */ (function () {
    function ternary_operator() {
    }
    ternary_operator.prototype.condition = function () {
        var first = 9;
        var second = 9;
        var result = (first > second) ? "TRUE" : "FALSE";
        console.log(result);
    };
    return ternary_operator;
}());
var obj = new ternary_operator();
obj.condition();
