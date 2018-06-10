package fizzbuzz;

//1から100までの数をプリントするプログラムを書け。
//ただし3の倍数のときは数の代わりに｢Fizz｣と、5の倍数のときは｢Buzz｣とプリントし、
//3と5両方の倍数の場合には｢FizzBuzz｣とプリントすること。

public class fizzbuzzTest {

	public static void main(String[] args) {
		System.out.println("Hello world");

		int count=0;

		for (int i=1; i<=100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			}
			else if (i%3==0) {
				System.out.println("fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
