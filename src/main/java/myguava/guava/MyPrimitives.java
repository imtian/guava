package myguava.guava;

import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

public class MyPrimitives {

	public static void main(String[] args) {
		System.out.println(Ints.compare(5, 6));
		System.out.println(Ints.BYTES);
		int[] array = {1,2,3,4,6};
		int[] arr = Ints.ensureCapacity(array, 11, 3);
//		for (int a : arr) {
//			System.out.println(a);
//		}
		for (int a : Ints.asList(array)) {
			System.out.println(a);
		}
		Ints.checkedCast(10);
		System.out.println(Ints.hashCode(100));
		int result = Ints.lexicographicalComparator().compare(array, arr);
		System.out.println(result);
		System.out.println(Ints.tryParse("-123"));
		byte[] br = Ints.toByteArray(5);
		System.out.println(br);
		System.out.println(Ints.saturatedCast(Long.MAX_VALUE));
	}

}
