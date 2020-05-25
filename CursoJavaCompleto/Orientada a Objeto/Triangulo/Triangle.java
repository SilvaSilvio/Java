package Triangulo;

public class Triangle {
public double a;
public double b;
public double c;

public double area() {
	double p = (a + b + c) / 2;
	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
