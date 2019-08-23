var obj={}

function funny1(){

}

var funny2= function() {

}
// Rule1: obj with key
// rule2 : with index

var complexObj= {
    funny3: function(){
        console.log("In funny3()");
    },
    items : ['mobiles','cables','papers','laptop'],
    subObj: { sk1:1000, sk2:"some value here", sk3: [1,2,3,
                    ["a","b"],  
                    {ssk1:100}
                ]
            }
}

console.log(complexObj.funny3());

console.log(complexObj.items[1]);

console.log(complexObj.subObj.sk2);

console.log(complexObj.subObj.sk3[3][1]);
console.log(complexObj.subObj.sk3[4].ssk1);

function fun(){
    return "infu";
}

function fund(){
    this.NamePropert="reds";
    this. work = function (){
        return "fhfhfh"+this.NamePropert;
    }
}

fun();
var classObj =new fund();
console.log(classObj.NamePropert);
console.log(Object.prototype);