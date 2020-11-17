
public class Aula_Class {
	
//	TIPOS DE VARIAVEIS
	public static void main (String[] args) {
		int numer=23;
		String frase= "Ola Mundo";
		boolean var=true;
		char var2= 'a';
		double var3=4.9;
		long longo=20000000;
		System.out.println(numer);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(longo);}
	//CONSTANTE
	public static void main (String[] args) {
	final int vida_maxima = 100;
	System.out.println(vida_maxima);

	
	String[] nome = new String[3];
	nome[0] = "Raul";
	nome[1] = "Davi";
	System.out.println(nome[0]);
	String[][] var_1 = new String[2];
	var_1[0][0] = "felipe";
	System.out.printl(var_1[0][0]);
		int vida = 150;
		if(vida == 100) {
		vida+=100;
			System.out.println("Eu tenho 100 de vida");
		}else if {
			System.out.println("Minha vida é menor que 100!");
		}else (vida >= 150) {
			System.out.println("Você está muito forte!");
	}
	
		
		int vida=100;
		switch(vida)
		{
		case 90:
		//executar ação
		System.out.println("Correr mais rapido");
		break;
		case 30:
		System.out.println("Minha vida é igual a 30!");
		break;
		default:
		System.out.println("Nenhuma condição bateu, eu tenho 100 de vida!");
		break;
		}
		
		int vida_1=100;
		int vida_2=100;
		int vida_3=400;
		int vida_final = vida_1 + vida_2 + vida_3;
		System.out.println(vida_final);
		
		int vida_final12 = ((vida_1 + vida_2) /2) *3;
		System.out.println(vida_final12);
		
		String nome_jogador = "Nicho";
		int skill = 100;
		if ((nome_jogador == "Nicho" && skill >= 100)&& skill <=90) {
			Podemos executar esse codigo
			System.out.println("Verdade");
		}else {
			System.out.println("Entramos no else");
		}
		
		
		int contador = 1;
		while(contador<=10) {
			System.out.println("Ola, agora o contador está em "+contador+"!");
			contador++;
			
		
		for(int i = 0;i<=10;i++) {
			System.out.println("Ola, agora o contador está em "+i+"!");
			
		contador=0;
		do{
			System.out.println(contador);
			contador++;
		}while(contador < 3);
		
		
		
		
		}
		}

		

