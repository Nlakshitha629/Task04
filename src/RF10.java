import java.lang.reflect.Method;

public class RF10 {
	
	public static void main(String[] args) throws Exception {
		
		Simple h = new Simple();
		
		Method m = h.getClass().getDeclaredMethod("setA", double.class);
		
		m.setAccessible(true);
		
		m.invoke(h, 76);
		
		System.out.println(h);
	}


}
