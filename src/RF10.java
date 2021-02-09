import java.lang.reflect.Method;

public class RF10 {
	
	public static void main(String[] args) throws Exception {
		
		Simple h = new Simple();
		
		Method m = h.getClass().getDeclaredMethod("setA", float.class);
		
		m.setAccessible(true);
		
		m.invoke(h, 25);
		
		System.out.println(h);
	}


}
