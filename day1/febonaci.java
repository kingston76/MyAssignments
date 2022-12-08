package week1.day1;

public class febonaci {

	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
		int sum = 0;
		System.out.print(firstNum +" "+secondNum);
		for (int i=0; i<11;i++) {
			sum = firstNum +secondNum;
			System.out.print(" "+sum);
			firstNum=secondNum;
			secondNum=sum;
		}
	}

}
