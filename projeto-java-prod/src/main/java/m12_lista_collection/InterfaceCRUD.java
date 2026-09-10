package m12_lista_collection;

public interface InterfaceCRUD<T, ID> {

	public T salve(T objeto, ID id);

	public void delete(ID id);
	
	public T buscarPorId(ID id);

}
