package fizzbuzz;

//1から100までの数をプリントするプログラムを書け。
//ただし3の倍数のときは数の代わりに｢Fizz｣と、5の倍数のときは｢Buzz｣とプリントし、
//3と5両方の倍数の場合には｢FizzBuzz｣とプリントすること。

public class fizzbuzzTest {

	public static void main(String[] args) {
		System.out.println("Hello world");


		for (int count=1; count<=100; count++) {
			System.out.println(toFizzBuzz(count));
		}
	}

	//条件式を関数にわける
	public static String toFizzBuzz(int count) {
		if (count%3==0 && count%5==0) {
			return "fizzbuzz";
		}
		else if (count%3==0) {
			return "fizz";
		}
		else if(count%5==0) {
			return "buzz";
		} else {
			return ""+count;
		}
	}
}
