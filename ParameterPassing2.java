class ParameterPassing2{
	public int  s(int n){
	System.out.println("Passing the parameter The Value");
	System.out.println("Passing the parameter The Value "+n);
 	int b=10;
	return b;}
	public static void main(String args[]){
	ParameterPassing2 Add=new ParameterPassing2();
	System.out.println("Pass The parameteric value");
	int d=Add.s(5);	
	System.out.println(d);}

}