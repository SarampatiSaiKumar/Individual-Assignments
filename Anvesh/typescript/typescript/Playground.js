var obj={};
function funny1(){

    return "In funny1()";
}

var funny2=function(){
return "In funny2()";
}
funny1();
funny2();
//rule1:to access object item use key eg:obj.key
//rule2:to access array item, use position eg:arr[0]
var complexObj={

funny3:function(){

    console.log("in funny3()");
},
items: ["mobiles","cables","papers","Laptop"],
subObj: { sk1:1000,
          sk2:"some value here",
          sk3:[1,2,3,
                  ["a","b"],
                    {ssk1:100}
                ]
        }

}
console.log("displaying funny2")
console.log(complexObj.funny3());
console.log("displaying cables")
console.log(complexObj.items[1]);
//get value of sk2
console.log("displaying sk2")
console.log(complexObj.subObj.sk2);
console.log("displaying b")
//get value of sk3 item ["a","b"] item "b"
console.log(complexObj.subObj.sk3[3][1])
//get value of ssk1
console.log("displaying ssk1")
console.log(complexObj.subObj.sk3[4].ssk1)

//tweaking function
 function fun(){
     return "In fun()";
 }
 function fundoo(){

    this.NameProperty = "ashish";
    this.work=function(){

        return this.NameProperty+ "works!";
    }
 }
 
 var classObj = new fundoo();
 console.log("viewing fundoo as class instance");
 console.log(classObj);
 console.log(classObj.NameProperty);
 console.log(classObj.work());


 var funObj= new fun(); 
 console.log(funObj);