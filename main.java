package BCE;

import BCE.Control.Controller;
import BCE.Entity.Laboratory;
import BCE.Entity.Position;
import BCE.Entity.Student;

import java.util.ArrayList;

public class main {
    public static void main (String[] args) {
        Laboratory lab = Laboratory.getLaboratory();
        ArrayList<Student> students = new ArrayList<>();
        for(int i = 0; i < 40; i++) {
            Position p = new Position(true, i);
            lab.addPosition(p);
        }
        for(int i = 0; i < 51; i++) {
            Student t = new Student("ttt", "mmm", "1313131313");
            students.add(t);
            lab.addStudent(t);
            try {
                Controller.richiediPostazione(t.getNumber());
                System.out.println("Iscritto");
            } catch (RuntimeException r) {
                System.out.println(r.getMessage());
            }
        }


    }
}
