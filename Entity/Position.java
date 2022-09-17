package BCE.Entity;

public class Position {

	private int id;
	private Boolean free;

	private Student s;


	public Position(Boolean free, int id){
		this.free = free;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Boolean isFree() {
		return free;
	}

	public void assign(Student s) {
		this.s = s;
		s.setP(this);
		free = false;
	}

	public void remove() {
		free = true;
		s.setP(null);
		s = null;
	}
}

