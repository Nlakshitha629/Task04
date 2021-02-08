import java.lang.reflect.Field;

public class RF08 {
	
	public static void main(String[] args) throws Exception {
		
		Simple h = new Simple();
		Field [] fields = h.getClass().getDeclaredFields();
		
		System.out.printf("There are %d fields\n", fields.length);
		
		for(Field f : fields) {
			f.setAccessible(true);
			
			float x = f.getFloat(h);
			x++;
			f.setFloat(h, x);
			System.out.printf("field name=%s type=%s value=%.2f\n", f.getName(), f.getType(), f.getFloat(h));
		}
	}


}
