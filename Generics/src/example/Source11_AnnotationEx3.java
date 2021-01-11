package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class NewClass11{
	int newField;
	
	int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {
		return oldField;
	}
}

public class Source11_AnnotationEx3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		NewClass11 nc = new NewClass11();
		
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		
		@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
		ArrayList<NewClass11> list = new ArrayList(); 
	}
}
