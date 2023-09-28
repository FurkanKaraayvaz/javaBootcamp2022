package Week1;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'D';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Güzel : Geçtiniz");
			break;
		case 'D':
			System.out.println("Güzel : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Başaramadınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");
		}
	}
}
