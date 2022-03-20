package trainig;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {

	public static void main(String[] args) {
		
		String des="aaabbbcccc";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<des.length();i++) {
			
			if(map.get(des.charAt(i))==null) {
				
				map.put(des.charAt(i), 1);
			}
			
			else {
				map.put(des.charAt(i), map.get(des.charAt(i))+1);	
			}	
		}
		StringBuilder s = new StringBuilder();
		for(Map.Entry<Character,Integer> m:map.entrySet()){  
			s.append(m.getKey());
			s.append(m.getValue());
			  }  
		System.out.println(s);
	}

}
