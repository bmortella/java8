package capitulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3); //Outra forma de criar uma List
		
		
		for(Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		//Foreach com Java 8
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		//Foreach com Java 8 e classe anônima
		usuarios.forEach(new Consumer<Usuario>() {

			@Override
			public void accept(Usuario u) {
                System.out.println(u.getNome());
			}
			
		});
		
		/*
		 * O método forEach da List recebe objeto do tipo java.util.function.Consumer
		 * que tem o único método accept
		 */
	
		//Com lambda
		Consumer<Usuario> mostradorl = (Usuario u) -> {System.out.println(u.getNome());};
		usuarios.forEach(mostradorl);
		
		//Simplificando ainda mais com lambda
		Consumer<Usuario> mostradorls = u -> {System.out.println(u.getNome());};
		usuarios.forEach(mostradorls);
		
		/*
		 * O lambda é uma forma mais simples de implementar uma interface que
		 * só tem um método. O compilador percebe que você está atribuindo um
		 * Consumer<Usuario> e tenta jogar o código no único método da interface.
		 * Ele ainda consegue inferir o tipo, sem a necessidade de utilizar
		 * Usuario e nem parênteses. Ainda é possível remover as chaves caso
		 * contenha apenas uma instrução entre elas (como no caso acima).
		 * Podemos também se livrar da variável temporária mostrador e 
		 * passar diretamente para o foreach:
		 */
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		
	}
}