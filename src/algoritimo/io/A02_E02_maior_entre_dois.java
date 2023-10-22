package algoritimo.io;

public class A02_E02_maior_entre_dois {

	public static void main(String[] args) {
	
		
		int n01 = 48, n02 =80, n03 = 66;
		int maior = ((n01 + n02 + n03) + Math.abs(n01 - n02 - n03))/3;
		System.out.println(maior);
		
		

	}

}
