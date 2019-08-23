import ididsomething from './interf';

export class Greetings{
    public strProp:string;
    private numProp:number;
    protected safeProp:any="some safe locker here";
      static aStaticProp:string="Im in static";
    anonProp:any; //public property 
}

export function sample(){

}
export class SpecialGreetings extends Greetings implements ididsomething{

    constructor(){
        super();
    }

    public getSafeProp(){
        return this.safeProp;
    }
    public worked(){
        return "i am working";
    }
}

var objGreetings=new SpecialGreetings();
console.log(objGreetings.getSafeProp());
console.log(Greetings.aStaticProp);