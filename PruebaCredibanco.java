import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PruebaCredibanco {

	public static void main(String[] args) {	
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");	
		System.out.println("Hola esta es mi prueba tecnica");

		System.out.println("Fecha y hora actual: "+dtf2.format(LocalDateTime.now()));
	}

}