import java.lang.reflect.Field;

public class RF04 {
	public static void main(String[] args) throws Exception {
		Simple h = new Simple();
		
		
		Field [] fields = h.getClass().getFields();
		System.out.printf("There are %d _\n", fields.length);
		
		for(Field f : fields) {
			System.out.printf("field name=%s type=%s value=%.3f\n", f.getName(), f.getType(), f.getDouble(h));
		}
	}



}
