package BCE.Entity;

import java.util.*;

public class Laboratory {

	public ArrayList<Student> students = new ArrayList<>();
	public ArrayList<Position> positions = new ArrayList<>();
	public static Laboratory lab = null;




	public ArrayList<Position> getPositions() {
		return positions;
	}

	public void addPosition(Position position) {
		this.positions.add(position);
	}
	public static Laboratory getLaboratory() {
		if(lab == null) {
			lab = new Laboratory();
		}
		return lab;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public Student VerifyStudent(String number) {
		if(number.length() != 10){
			return null;
		}
		for(Student s : students) {
			if(s.getNumber().equals(number)) {
				return s;
			}
		}
		return null;
	}

	public int findFreePositions(){
		int n = 0;
		for(Position p : positions) {
			if(p != null) {
				if(p.isFree()) {
					return p.getId();
				}
			}
		}
		return -1;
	}

	public Position findPositionId(int id) {
		for (Position p : positions) {
			if(p != null) {
				if(p.getId() == id) {
					return p;
				}
			}
		}
		return null;
	}

}