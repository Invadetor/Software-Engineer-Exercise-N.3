package BCE.Control;

import BCE.Entity.Laboratory;
import BCE.Entity.Position;
import BCE.Entity.Student;

import java.util.ArrayList;

public class Controller {

	public static void richiediPostazione(String number) {
		Student s = Laboratory.getLaboratory().VerifyStudent(number);
		if(s == null) {
			throw new RuntimeException("Errore, Studente non isctitto o inesistente");
		}
		int pos = Laboratory.getLaboratory().findFreePositions();
		if(pos >= 0) {
			Position p = Laboratory.getLaboratory().findPositionId(pos);
			p.assign(s);
		} else {
			throw new RuntimeException("Errore, Nessuna posizione libera");
		}
	}

	public static void liberaPostazione(int id) {
		Laboratory.getLaboratory().findPositionId(id).remove();
	}

	public static ArrayList<Position> mostraPosizioni() {
		return Laboratory.getLaboratory().getPositions();
	}

}