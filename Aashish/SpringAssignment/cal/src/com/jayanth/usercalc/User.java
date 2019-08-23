/**
 * 
 */
package com.jayanth.usercalc;

/**
 * @author Abridge
 *
 */
public class User {
String name;
Calc calc;
/**
 * @return the name
 */
public String getName() {
	return name;
}
public User() {
	super();
	
}
public User(String name, Calc calc) {
	super();
	this.name = name;
	this.calc = calc;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the calc
 */
public Calc getCalc() {
	
	return calc;
}
/**
 * @param calc the calc to set
 */
public void setCalc(Calc calc) {
	this.calc = calc;
}

public void addFromCalc(int a,int b)
{
	
	calc.add(a,b);
}


}
