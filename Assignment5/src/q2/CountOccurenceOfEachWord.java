package q2;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachWord {

	public static void main(String[] args) {

		Map<String, Integer> mp = new HashMap<String, Integer>();

		String str = "Ganesh Kunal Kunal Ganesh Ganesh";

		String curr = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
			{
				int count = 0;
				{
					try {
						count = mp.get(curr);
					} catch (Exception e) {
					}
					mp.put(curr, count + 1);
				}
				curr="";
			}
			else
			{
				curr = curr + str.charAt(i);
			}
		}
		int count = 0;
		{
			try {
				count = mp.get(curr);
			} catch (Exception e) {
			}
			mp.put(curr, count + 1);
		}
		curr="";
		System.out.println(mp);

	}

}
