package com.learning3;
import java.util.*;


public class HashSetDemo {
	String name,loc;
	
	
	HashSetDemo(String name, String loc){
		this.name = name;
		this.loc = loc;
		
	}
	
	public static void main(String[] args) {
		
		HashSet<HashSetDemo> hs =new HashSet();
		
		HashSetDemo hs1 = new HashSetDemo("Mithun","Hyd");
	    HashSetDemo hs2 = new HashSetDemo("Keerthana","Hyd");
		HashSetDemo hs3 = new HashSetDemo("Sirisha","Hyd");
		HashSetDemo hs4 = new HashSetDemo("Mithun","Hyd");
		
		hs.add(hs1);
		hs.add(hs2);
		hs.add(hs3);
		hs.add(hs4);
		
		
		
		Iterator<HashSetDemo> itr = hs.iterator();
		
		itr.forEachRemaining(a->{
			System.out.println(a.name+" "+a.loc);
		});
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
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
		HashSetDemo other = (HashSetDemo) obj;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
