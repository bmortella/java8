package capitulo3;


/*
 * A anotação FunctionalInterface é opcional, servindo mais
 * para que ninguém torne a interface não funcional acidentalmente.
 * Caso seja adicionado outro método, um erro será lançado ao 
 * compilar.
 */

@FunctionalInterface
public interface Validador<T> {

	boolean valida(T t);
	
}
