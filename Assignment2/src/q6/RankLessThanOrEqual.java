package q6;

import java.util.Arrays;
import java.util.stream.Stream;

public class RankLessThanOrEqual {

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		Stream<Integer> stream = Arrays.stream(arr);

		int rank = 4;

		long count = stream.filter(ele -> ele <= rank).count();
		
		System.out.println("Rank of "+rank+" is: "+count);
	}

}
