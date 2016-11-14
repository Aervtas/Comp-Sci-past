import java.util.ArrayList;

public class Smallest {

	public ArrayList<Integer> sremove(ArrayList<Integer> nums){
		
		int smallest = nums.get(nums.size()-1);
		
		for(int i=nums.size()-2; i>=0; i--){
			if(smallest > nums.get(i))
				smallest = nums.get(i);
		}
		
		int j = nums.size()-1;
		
		while(j>=0){
			if(smallest == nums.get(j))
				nums.remove(j);
			else
				j--;
		}
		
		return nums;
	}
}
