package myguava.guava;

import com.google.common.base.Optional;


public class MyOptional {

	public static void main(String[] args) {
//		Optional<Integer> possible = Optional.of(5);
//		Optional<Integer> possible = Optional.absent();
		Optional<Integer> possible = Optional.fromNullable(5);
//		System.out.println(possible.get());
		System.out.println(possible.or(10));
		System.out.println(possible.orNull());
		System.out.println(possible.isPresent());
	}

}
