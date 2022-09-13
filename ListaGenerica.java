package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica {

	private List<ElementoGenerico> lista = new ArrayList<>();
	
	public boolean add(ElementoGenerico element) {
		if (findByKey(element.getKey()) != null) {
			return false;
		}
		lista.add(element);
		return true;
	}
	
	public ElementoGenerico findByKey(String key) {
		for (ElementoGenerico e : lista) {
			if (e.getKey() == key)
				return e;
		}
		return null;
	}
}
