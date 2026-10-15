package m15_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TarefaMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

		Class<?> clazz = Class.forName("m15_reflection.Tarefa");
		Object obj = clazz.getDeclaredConstructor().newInstance();
		
		for (Method method : clazz.getDeclaredMethods()) {
			
			if (method.isAnnotationPresent(Executar.class)) {
				method.invoke(obj);
			}
			
		}
		
	}

}
