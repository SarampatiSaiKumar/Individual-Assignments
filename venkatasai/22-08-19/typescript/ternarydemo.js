var TernaryOperator = /** @class */ (function () {
    function TernaryOperator() {
    }
    TernaryOperator.prototype.check = function (first, second) {
        var res = (first > second) ? first + "is greater than" + second : second + "is greater than" + first;
        console.log(res);
    };
    return TernaryOperator;
}());
var obj = new TernaryOperator();
obj.check(4, 5);
