package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class ClassClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		
		//establecer la cadena de conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(cliente);
		//emitimos mensaje por consola
		System.out.print("Cliente Registrado en la BD");
		//configuramos
		em.getTransaction().commit();
		//cerramos
		em.close();
				
	}//fin del metodo registrar

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory farb=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		//gestionar las entidades
		EntityManager em=farb.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//actualizar
		em.merge(cliente);
		//emitimos el mensaje 
		System.out.print("Cliente Actualizado en BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}//fin del metodo actualizar

	@Override
	public void EliminarCliente(TblCliente cliente) {
		
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory farb=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		//gestionar las entidades
		EntityManager em=farb.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo eliminar
		TblCliente elim=em.merge(cliente);
		//procedemos a eliminar
		em.remove(elim);
		//emitimos el mensaje por consola
		System.out.print("Cliente Eliminado de la BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
				
	}//fin del metodo eliminar

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		
		//establecer la conexion con la unidad de persistencia
        EntityManagerFactory farb= Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
        //gestionar las entidades
        EntityManager em= farb.createEntityManager();
        //inicar la transaccion
        em.getTransaction().begin();
        //recuperamos en codigo a buscar
        TblCliente buscarcli=em.find(TblCliente.class, cliente.getIdcliente());
        //confirmamos
        em.getTransaction().begin();
        //cerramos
        em.close();
        //retornamos el cliente buscado a la BD
        return buscarcli;
		
	}//fin del metodo buscar

	@Override
	public List<TblCliente> ListadoCliente() {
		
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el listado de cliente de la BD
		//aplicamos consultas JPQL, el metodo createquery(), sirve para hacer consultas dinamicas
		List<TblCliente> listado=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//recuperamos el cliente buscado de la BD
		return listado;
				
	}//fin del metodo eliminar

	

}
