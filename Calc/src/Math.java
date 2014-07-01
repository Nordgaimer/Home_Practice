
public class Math {

	static public int calc (int a,int b,char op) throws ArithmeticException {
		{
			int res =0;
			switch (op) {
			case '+' : res = a + b;
			break;
			case '-' : res = a - b;
			break;
			case '/' : res = a / b;
			break;
			case '*' : res = a * b;
			break;
			}
			return res;
		}
	}
}

