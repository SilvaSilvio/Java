package WrapersTest;

public class WrapersTest {
public static void main(String... args) {
	byte byteprimitivo = 1;
	short shortprimitivo = 1;
	int intprimitivo = 10;
	long longprimitivo = 10L;
	float floatprimitivo = 10F;
	double doubleprimitivo = 10D;
	//char charprimitivo = "A";
	boolean booleanprimitivo = true;
	
	Byte bytewrapper = 1;
	Short shortwrapper = 1;
	Integer integerwrapper = 10;
	Long longwrapper = 10L;
	Float floatwrapper = 10F;
	Double doublewrapper = 10D;
	//Character characterwrapper = "A";
	Boolean booleanwrapper = new Boolean("true");
	System.out.println(booleanwrapper);
	
	String valor = "10";
	Float f = Float.parseFloat(valor);
	System.out.println(f);
	
	System.out.println(Character.isDigit('2'));
	System.out.println(Character.isLetter('a'));
	System.out.println(Character.isLetterOrDigit('*'));
	System.out.println(Character.isUpperCase('A'));
	System.out.println(Character.isLowerCase('A'));
	System.out.println(Character.toUpperCase('s'));
	System.out.println(Character.toLowerCase('s'));

}
}
