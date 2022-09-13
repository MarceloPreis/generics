package generics;

public class ClasseGenerica <T>{
	public T atributo;
	
	public ClasseGenerica(T atributo){
		this.atributo = atributo;
	}
	
	public T getAtributo(){
		return this.atributo;
	}

}
