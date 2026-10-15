package m15_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServicoEmailMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
		
		Class<?> clazz = Class.forName("m15_reflection.ServicoEmail");
		Object obj = clazz.getDeclaredConstructor().newInstance();
		
		Method method = clazz.getMethod("enviar");
		
		method.invoke(obj);

	}

}
