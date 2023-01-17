package week3.Day7;



import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class FindNumberOfOccurances {
	public static void main(String[] args) {

	int[] nums =  {2,3,5,6,3,2,1,4,2,1,6,-1};
	
	Map<Integer,Integer> map=new TreeMap<Integer, Integer>();
	
	for (int i : nums) 
	{
	if(map.containsKey(i))	{
		map.put(i, map.get(i)+1);
	}
	
	else {
		map.put(i, 1);
	}
	 
	 
	}
	for (Entry<Integer,Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey()  +   " "  +  entry.getValue());
    }
}
}



		
	

