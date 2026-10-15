package m15_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainProduto {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
		
		Class<?> clazz = Class.forName("m15_reflection.Produto");
		Object obj = clazz.getDeclaredConstructor().newInstance();
		
		Field field = clazz.getDeclaredField("nome");
		field.setAccessible(true);
		
		System.out.println("Valor do campo nome: " + field.get(obj));
		
		field.set(obj, "Placa de vídeo");
		
		System.out.println("Valor do campo nome 2 : " + field.get(obj));
		
	}

}
