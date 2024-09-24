package com.learning;
import java.util.ArrayList;
import java.util.Collection;

public class Collecti {
	
	int empid;
	String name;
	Collecti(int empid, String name){
		this.empid=empid;
		this.name=name;
	}
	
	public String toString() {
		return " "+name;
		
	}
	
public static void main(String args[]) {
ArrayList<Collecti> al = new ArrayList();
	
Collecti cl1 = new Collecti(1,"Mithun");
Collecti cl2 = new Collecti(2,"Anand");
Collecti cl3 = new Collecti(3,"Maruthi");


al.add(cl1);
al.add(cl2);
al.add(cl3);




ArrayList<Collecti> all = new ArrayList();

Collecti cll1 = new Collecti(1,"Mithun");
Collecti cll2 = new Collecti(2,"Anand");
Collecti cll3 = new Collecti(3,"Maruthi");


all.add(cll1);
all.add(cll2);
all.add(cll3);



System.out.println(al.equals(all));

for(Collecti c: al) {
	System.out.println(c.empid+" "+c.name);
	}
System.out.println();

for(Collecti cll:all) {
	System.out.println(cll.empid+" "+cll.name);
}


}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Collecti other = (Collecti) obj;
	if (empid != other.empid)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
	
	
}


}
