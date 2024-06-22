package Test;

import java.util.List;

import Dao.ClassClienteImp;
import model.TblCliente;

public class TestEntidadCliente {

	public static void main(String[] args) {
		//hacemos la respectiva instancia
		TblCliente cliente= new TblCliente();
		ClassClienteImp crud=new ClassClienteImp();
		//asignamos valores
/*-------------------- U N O ---------- R E G I S T R O S --------------------*/
		
		/*		
		 		//--- I N S E R T A R --- D A T O S ---
				
				cliente.setNombre("samire ronaldo");
				cliente.setApellido("ramirez ramirez");
				cliente.setDni("1045789");
				cliente.setEmail("nilson@gmail.com");
				cliente.setTelf("3871459");
				cliente.setSexo("M");
				cliente.setNacionalidad("argentina");
				
				//--- I N V O C A M O S --- M E T O D O ---
				
				crud.RegistrarCliente(cliente);
		*/
		
/*-------------------- F I N ---------- R E G I S T R O S --------------------*/

		
		
		
		
		
		
/*-------------------- U N O ---------- L I S T A R --------------------*/
		
		
				//--- I N V O C A M O S --- M E T O D O --- L I S T A R ---
				
				List<TblCliente> listadocliente=crud.ListadoCliente();
				//--- A P L I C A M O S --- B U C L E --- F O R ---
				for(TblCliente listar:listadocliente){
					
					//--- I M P R I M I M O S --- L O S --- D A T O S ---
					
					System.out.print(
							"-----------------------------------------------" + "\n\n" +
							"-------------------- U N O --------------------" + "\n\n" +
							"Codigo" + "\t\t: "+listar.getIdcliente()+ "\n" +
							"Nombre" + "\t\t: "+listar.getNombre()+ "\n" +
							"Apellido" + "\t: "+listar.getApellido()+ "\n" +
							"DNI" + "\t\t: "+listar.getDni()+ "\n" +
							"Email" + "\t\t: "+listar.getEmail()+ "\n" +
							"Teléfono" + "\t: "+listar.getTelf()+ "\n" +
							"Sexo" + "\t\t: "+listar.getSexo()+ "\n" +
							"Nacionalidad" + "\t: "+listar.getNacionalidad()+ "\n\n" +
							"-------------------- F I N --------------------" + "\n\n");
				}
				
		
				
/*-------------------- F I N ---------- L I S T A R --------------------*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//fin del metodo

}//fin de la clase
