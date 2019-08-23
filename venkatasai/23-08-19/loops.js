var n = ['a1', 'a2', 'a3', 'a4', 'a5'];
for (var key in n) {
    console.log(n[key]);
}
var tuple = [1, "hello", [1, 2, 3], { key: 'value' }];
tuple.forEach(function (item) {
    if (typeof (item) == 'object') {
        try {
            // var temp = <Array<Number>>(item)
            var temp = (item);
            console.log(temp);
        }
        catch (error) {
        }
        //console.log("item is number type:"+item)    }
        //console.log(item);
    }
});
//Union
// let VS var
var abc = 100;
if (abc == 100) {
    var abc = 200;
    console.log(abc); //200
}
console.log(abc); //200
var abc1 = 100;
if (abc1 == 100) {
    var abc1_1 = 200;
    console.log(abc1_1); //200
}
console.log(abc1); //100
