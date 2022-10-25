import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Productos> listaProductos = new LinkedList<Productos>();
		
		Productos producto0 = new Productos (1,"Lata de Atun");
		Productos producto1 = new Productos (2,"Lata de Arbejas");
		Productos producto2 = new Productos (3,"Lata de Garbanzos");
		
		
		listaProductos.add(0,producto0);
		listaProductos.add(1,producto1);
		listaProductos.add(2,producto2);
		
		imprimir(listaProductos); 
		
		
		
	}
		
		
		public static void imprimir(LinkedList<Productos> list) {
			
			if (list.isEmpty()) {
				System.out.println("La lista esta vacia");
			} else {

				for (Productos item : list) {
					System.out.println(item.getNombre());
					
				
				}
		
			}
			
			
			
			
		}
		

}
