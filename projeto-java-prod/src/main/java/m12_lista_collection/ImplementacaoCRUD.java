package m12_lista_collection;

import java.util.HashMap;
import java.util.Map;

public class ImplementacaoCRUD<T, ID> implements InterfaceCRUD<T, ID> {
	
	private Map<ID, T> banco = new HashMap<ID, T>();

	@Override
	public T salve(T objeto, ID id) {
		banco.put(id, objeto);
		
		return banco.get(id);
	}


	@Override
	public void delete(ID id) {
		banco.remove(id);
	}


	@Override
	public T buscarPorId(ID id) {
		return banco.get(id);
	}


}
