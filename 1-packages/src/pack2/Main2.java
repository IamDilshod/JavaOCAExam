package pack2;

public class Main2 {

	public static void main(String[] args) {
		byte b1 = 12;
		byte b2 = 0b1100;
		byte b3 = 014;
		byte b4 = 0XC;

		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

		short s1 = -1300;
		short s2 = -0b010100010100;
		short s3 = -02424;
		short s4 = -0X514;

		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

		int i1 = 0;
		int i2 = 0b0;
		int i3 = 00;
		int i4 = 0X0;

		System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);

		long l1 = 123456789;
		long l2 = 0b0111010110111100110100010101;
		long l3 = 0726746425;
		long l4 = 0X75BCD15;

		System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);

		System.out.println("--------------------------------------");

		char c1 = 'a';
		char c2 = 97;
		char c3 = '\u0061';
		System.out.println(c1 + " " + c2 + " " + c3);

		System.out.println("--------------------------------------");

	}
}
