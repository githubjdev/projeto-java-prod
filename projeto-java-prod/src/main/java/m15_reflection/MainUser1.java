package m15_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainUser1 {
	
	public static void main(String[] args) {
		
		Class<Usuario> clazz = Usuario.class;
		
		System.out.println("Campos:");
		for (Field field : clazz.getDeclaredFields()) {
			System.out.println(field.getName());
		}
		
		System.out.println("\nMétodos:");
		for (Method method : clazz.getDeclaredMethods()) {
			System.out.println(method.getName());
		}
	}

}
