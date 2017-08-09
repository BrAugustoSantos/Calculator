
public class Calculator {


private int n1;
private int n2;
private int soma;
private int multi;
private double div;
private int sub;

public Calculator() {
	
	System.out.println(" BEM VINDO A CALCULADORA");		
		
}

public int getSub() {
	return getN1()-getN2();
}
public void setSub(int sub) {
	
	this.sub = sub;
}
public int getMulti() {
	return getN1()*getN2();
}
public void setMulti(int multi) {
	this.multi = multi;
}
public int getDiv() {
	return getN1()/getN2();
}
public void setDiv(int div) {
	this.div = div;
}
public int getN1() {
	return n1;
}
public void setN1(int n1) {
	

	this.n1 = n1;
}
public int getN2() {
	return n2;
}
public void setN2(int n2) {
	this.n2 = n2;
}
public int getSoma() {
	
	return getN1()+getN2();
}
public void setSoma(int soma) {
	
	this.soma = soma;
}

}
