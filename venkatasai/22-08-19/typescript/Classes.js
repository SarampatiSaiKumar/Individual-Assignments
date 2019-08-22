// class Greetings{
//     public strProp:string;
//     private numProp: number;
//     protected safeProp: any=" safe prop"; // accessble only in the derived clases
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.setName = function (name) {
        this.name = name;
    };
    Person.prototype.getName = function () {
        return this.name;
    };
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Employee.prototype.setId = function (id) {
        this.empId = id;
    };
    Employee.prototype.getId = function () {
        return this.empId;
    };
    Employee.prototype.setName = function (name) {
        this.name = "in EMP: " + name;
    };
    return Employee;
}(Person));
var em = new Employee();
em.setName("acd");
em.setId(123);
console.log(em.getId());
console.log(em.getName());
