import java.lang.reflect.Field;

public class RF07 {
	
	public static void main(String[] args) throws Exception {
		
		Simple h = new Simple();
		
		Field [] fields = h.getClass().getDeclaredFields();
		
		System.out.printf("There are %d fields\n", fields.length);
		
		for(Field f : fields) {
			f.setAccessible(true);
			
			System.out.printf("field name=%s type=%s value=%.2f\n", f.getName(), f.getType(), f.getDouble(h));
		}
	}


}
