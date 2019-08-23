// fucntion with diff params

function usingParams(pRequired: boolean, pOptional?: number ,pDefault:String="default",...pRest: string[]){

    console.log(pRequired);
    console.log(pDefault);
    console.log(pOptional);
    console.log(pRest);
}

usingParams(true);
usingParams(false,null,undefined,"rest2","rest1","rest3");


// fucntion that returns another

function complex(){
    console.log("complex");
    return function(){ console.log("int he functtion")
                            return function( name: string){console.log("in 3"+name)}}
}

var result= complex();

result();
complex()()("babu");
console.log(result);

// self invocation functions
(function(){
    console.log("anonymus function");
})();

var ano =(function(){
    console.log("anonymus function");
})();

(function(){
    console.log("complex");
    return function(){ console.log("int he functtion")
                            return function( name: string){console.log("in 3"+name)}}
})()()("self invoked");

// Lamda functions

() => {
    console.log("a lamda function");
    return "a value"
};

() => "a value";

var out = (a) => (x,y) => x+y+a;
out(10)(20,30)

// BODMAS

var str :string ="3*2+5";
var i, k=0;
for ( i=0;i<str.length;i++){

    if( i%2==0){

        
    }
    //console.log("for ")
    if(i%2!=0){
    
        if( str[i]=="+"){
            console.log("add");
            if(k==0){
            var a= +str[i-1];
            var b= +str[i+1];
            //(str[i-1],str[i+1]) => str[i-1]+str[i+1];
            var out1 =(x,y) => x+y;
            
            k=out1(a,b);
            console.log(k)
            console.log( "(",str[i-1],",",str[i+1],")=>","(", out1(a,b),")");
            }


        }
        else if(str[i]=='*'){
            //console.log("add");
            var a= +str[i+1];
            var b= k;
            //(str[i-1],str[i+1]) => str[i-1]+str[i+1];
            var out2 =(x,y) => (x*y) ;
            k=out2(a,b)
            console.log("mult" , out2(a,b));

        }

    }
}




