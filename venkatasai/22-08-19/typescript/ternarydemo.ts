class TernaryOperator  
{  
    check(first:number,second:number)  
    {  
          
        var res = (first > second) ? first+" is greater than "+second : second+" is greater than "+first;  
        console.log(res); 
    }  
}  
var obj = new TernaryOperator();  
obj.check(4,5);   
