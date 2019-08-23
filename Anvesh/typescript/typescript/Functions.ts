//function with different types of parameters

function UsingParams(pRequired:boolean,pDefault:string="DBS-ID",pOptional?:number, ...pRest:string[]){

    console.log(pRequired);
    console.log(pDefault);
    console.log(pOptional);
    console.log(pRest);
}

UsingParams(true);
UsingParams(false,"DBS-387273",100,"rest","rest1","rest3","rest4");

function arrayparams(pArr:string[]){console.log(pArr);}
function restparams(...pRest:string[]){console.log(pRest);}

var arry=['1','2','3'];
arrayparams(arry);
restparams('1','2','3',);

//function that returns another function

function complicated(){
    console.log("inside complicated");
    return function(){
        console.log("i will display if invoked only!");
        return function(){
            console.log("i am inside");
        }
    };
}

var result=complicated();
result();
//complicated()()();
console.log(result);

//self invlokable functions

(function(){

    console.log(" A fucntion");
})();
var output=(function(){

    console.log(" A fucntion");
    return "a value";
})();

console.log(output);
console.log(
(function(){
    console.log("inside complicated");
    return function(){
        console.log("i will display if invoked only!");
        return function(){
            console.log("i am inside");
            return"ended";
        }
    }
})()()());

//lambda fucntions


()=>{
    console.log("a function");
    return "a value";
};

()=>"a value";

var out = (a)=>(x,y)=>x+y+a;
console.log(out(10)(20,30));

//reverse engineering
console.log((function(a){
    return function(x,y){
        return x+y+a;
    }
})(10)(20,30));

//BODMAS\
var ch="3+2*4";
for(var i=0;i<ch.length;i++){
   
    if(ch[i]=='+'){
        console.log((ch[i-1],ch[i+1])=>(ch[i-1],ch[i+1]);
    }

