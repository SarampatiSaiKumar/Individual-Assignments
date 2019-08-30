import { Maths } from './maths';

// describe('Maths', () => {
//   it('should create an instance', () => {
//     expect(new Maths()).toBeTruthy();
//   });
// });

describe('test add',() => {
  it("should add 2 numbers",()=>{
    let obj=new Maths();
    let n1=10;let n2=20;
    expect(obj.Add(n1,n2)).toEqual(30);

}

)});
describe('Test Subtract', () => {
  it("True equals True",()=>{
  expect(true).toBeTruthy();
  });
  
  it("should add 2 numbers",()=>{
  let obj=new Maths();
  let n1=10;let n2=20;
  expect(obj.Add(n1,n2)).toEqual(30);
  })
  
  it("should substract 2 numbers if one number is negative",()=>{})
  });

  describe('Test add', () => {
  it("True equals True",()=>{
  expect(true).toBeTruthy();
  });
  
  it("should add 2 numbers",()=>{
  let obj=new Maths();
  let n1=20;let n2=10;
  expect(obj.Subtract(n1,n2)).toEqual(10);
  })


})