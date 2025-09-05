public class ternary{
	public static void main(String [] args){
		int a = 1;
		int b = 2;
		int result = a > b ? a++ : b--;
		System.out.println("result = " +result);
		System.out.println(" a= " +a);
		System.out.println(" b= " +b);
		/**
		 * 三元运算符还可以这样用，以后的开发下面这种用法也会很多
		 */
		int c = 80;
		int d = 56;
		/**
		 * 像这个就是，我只输出两者大的那个
		 * 后续还有很多其他的用处，主要取决于你零不灵活
		 * 后续学习了对象之后，还有其他妙用，我这里就不列举出来了学习技术要灵活一点
		 * 不要太死板
		 */
		System.out.println(c > d ? c : d);
	}
}