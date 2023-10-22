package algoritimo.io;

public class A02_ClasseMath {

	public static void main(String[] args) {
		 //sempre retorna o número positivo	
		 //System.out.println(Math.abs(-20));
		 double numero = 3.3;	
		 //arredonda para baixo	
		 //System.out.println(Math.floor(numero));
		 //arredonda para cima
		 //System.out.println(Math.ceil(numero));
		 //arredonda para o mais próximo
		 //System.out.println(Math.round(numero));
		 
		 //constantes da classe Math
		 //System.out.println(Math.PI);
		 //System.out.println(Math.E);
		 //Eleva o número do primeiro termo para o expoente do segundo termo
		 //System.out.println(Math.pow(2, 10));
		 //Resolve a raíz quadrada de um número
		 //System.out.println(Math.sqrt(49));
		 //resolve a raíz cúbica de um número
		 //System.out.println(Math.cbrt(8));
		 //random não retornará 1.0, multiplicando o que Math. retornos aleatórios com 100 resultarão em um valor máximo de 99,999 .... 
		// e quando convertido para um int passa para 99. Como o número gerado
		 //aleatoriamente deve incluir 100, você terá que multiplicar por 101. Multiplicar por 100 resultará em um valor int máximo de 99
		 
		 // aparece o 60
		System.out.println(Math.round(Math.random()*59)+1); 
		System.out.println(Math.round(Math.random()*59)+1);
		System.out.println(Math.round(Math.random()*59)+1);
		System.out.println(Math.round(Math.random()*59)+1);
		System.out.println(Math.round(Math.random()*59)+1);
		
		 
		//nao aparece o 60
		System.out.println((int)(Math.random()*59)+1); 
		System.out.println((int)(Math.random()*59)+1); 
		System.out.println((int)(Math.random()*59)+1); 
		System.out.println((int)(Math.random()*59)+1); 
		System.out.println((int)(Math.random()*59)+1); 
		System.out.println((int)(Math.random()*59)+1); 
		
		//RETORNA UM NUMERO
		 
	}

}
