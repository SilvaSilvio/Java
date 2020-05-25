package MutiplaRuntimeException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MutiplaRuntimeException {
	public static void main(String... args) {
		/*
		 * try { //throw new ArrayIndexOutOfBoundsException(); throw new
		 * IllegalArgumentException();
		 * 
		 * }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Detro do ArrayIndexOutOfBoundsException");
		 * }catch(IllegalArgumentException e) {
		 * System.out.println("Dentro do IllegalArgumentException");
		 * }catch(ArithmeticException e) {
		 * System.out.println("dentrou do ArithmeticException"); }
		 */

		try {
			talvezLanceException();
		} catch (SQLException e) {
			System.out.println("Dentro do SQLException");
		} catch (FileNotFoundException e) {
			System.out.println("Dentro do FileNotFoundException");
		}

	}

	public static void talvezLanceException() throws SQLException, FileNotFoundException {

	}
}
