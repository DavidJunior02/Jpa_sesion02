package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import prueba.TbUsuario;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. fabrica el acceso a los datos
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_Clase2x");
				// 2. crea el manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				System.out.println("===JAVA LIST====");
				List<TbUsuario> listado = em.createQuery("Select a from TbUsuario a", TbUsuario.class).getResultList();
				System.out.println("=====================================");
				System.out.println("Numero de Usuarios: " + listado.size());
				System.out.println("=====================================");
		
				for (TbUsuario u : listado) {
					System.out.println("Usuario: " + u.getNomUsua() + u.getApeUsua() + " " + u.getClaUsua());

				}
				System.out.println("=====================================");
				System.out.println("Buscar Usuario por id=2");
				System.out.println("=====================================");
				TbUsuario usu = em.find(TbUsuario.class, 2);
				System.out.println(usu.getNomUsua() + " " + usu.getApeUsua());
				
				// insertar usuario
				/*em.getTransaction().begin();

				TbUsuario usua = new TbUsuario();

				Date date = new Date();
				TbTipo tipo = em.find(TbTipo.class, 2);// Tipo cliente

				usua.setCodUsua(6);
				usua.setNomUsua("Pepe");
				usua.setApeUsua("perez");
				usua.setUsrUsua("peperes64gmail.com");
				usua.setClaUsua("10005");
				usua.setFnaUsua(date);
				usua.setTbTipo(tipo);
				usua.setEstUsua(1);
				em.persist(usua);
				em.getTransaction().commit();
				System.out.println("=====================");
				*/
		        //actualizar usuario
			
				/*System.out.println("Actualizamos  Usuario por id=6");
				System.out.println("=====================");
				em.getTransaction().begin();
				
				TbUsuario tipoactua = em.find(TbUsuario.class, 6);
				tipoactua.setClaUsua("masterpro");
				em.persist(tipoactua);
				em.getTransaction().commit();
				System.out.println("=====================");
				
				*/
				
			/*	//eliminar usuario
				System.out.println("Eliminamos Usuario por id=6");
				System.out.println("=====================");
				em.getTransaction().begin();
				TbUsuario tipoactua = em.find(TbUsuario.class, 6);
				em.remove(tipoactua);
				em.getTransaction().commit();
				System.out.println("=====================");
			*/	
					}

		
	}


