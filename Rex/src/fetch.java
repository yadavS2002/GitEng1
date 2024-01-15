
class A {

	String Name;
	int id;

	public A(String Name, int id) {
		this.Name = Name;
		this.id = id;
	}@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("deleted");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}

public class fetch {
	public static void main(String[] args) {
     A a= new A("rex", 12);
     a=null;
     System.gc();
     System.out.println(a);
     
     A a1= new A("rex", 12);
     A a2= new A("rex", 12);
     System.out.println(a1);
     
     System.out.println(a1.equals(a2));     
	}

}
