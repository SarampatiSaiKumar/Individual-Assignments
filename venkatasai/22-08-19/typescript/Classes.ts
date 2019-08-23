// class Greetings{
//     public strProp:string;
//     private numProp: number;
//     protected safeProp: any=" safe prop"; // accessble only in the derived clases

//     anonProp:any; //=> public property
//     static aStaticProp= "Static Prop";
// }

// class SpecialGreetings extends Greetings{
//     constructor(){
//         super();

//     }

//     public getSafeProp(){
//         return this.safeProp;
//     }
// }

// interface iDidSmtg{

//     Worked(): string;


// }
// var objGreetings = new SpecialGreetings();
// console.log(objGreetings.getSafeProp());
// console.log(Greetings.aStaticProp);

interface IOOperations{

    setName(string) ;
    getName(): string;

    setId(number);
    getId():number;
    
}

class Person {

    name: string;
    age: number;
    setName( name:string){
        this.name=name;
    }
    getName(){
        return this.name;
    }

}


class Employee extends Person implements IOOperations{

    empId: number;

    setId(id: number){

        this.empId=id;
    }
    getId(){
        return this.empId;
    }
    setName(name:string){
        this.name="in EMP: "+name;
    }
    

}

var em= new Employee();
  em.setName("acd");
  em.setId(123)
  console.log (em.getId());
  console.log(em.getName());
