package corejava.client;
import java.util.ArrayList;

import corejava.model.Employee;
public class User {

	public static void main(String[] args) {
	  ArrayList<Employee> employess=new ArrayList<Employee>();
	  employess.add(new Employee(1,"aaa",50000));
	  employess.add(new Employee(2,"bbb",50000));
     
	  for(Employee e:employess) {
		  e.showIdName();
		  
		  
	  }
	}

}
