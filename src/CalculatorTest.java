import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		

		Calculator firstNumber=new Calculator();
		
		System.out.println("INFORME O PRIMEIRO NUMERO");
		firstNumber.setN1(ler.nextInt());
		System.out.println("INFORME O SEGUNDO NUMERO");		
		firstNumber.setN2(ler.nextInt());
				firstNumber.getSoma();

System.out.println("SOMA "+	firstNumber.getSoma());
System.out.println("MULTIPLICAÇAO "+firstNumber.getMulti());
System.out.println("DIVISAO "+firstNumber.getDiv());
System.out.println("SUBTRAÇAO "+firstNumber.getSub());





	} 




















}

