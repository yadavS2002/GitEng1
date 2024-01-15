
class Emp{
	private String Name;
	private int id;
	private Double sal;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
  		this.id = id;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(int i) {
		this.sal = (double) i;
	}
	
}

public class pojo {
	public static void main(String[] args) {
		Emp e= new Emp();
		
		e.setName("Rex");
		e.setId(07);
		e.setSal(777777);
		
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSal());
		
	}

}
