package arbolbinarioB;

import javax.swing.JOptionPane;
public class Principla {
	public static void main(String[] args) {
	     byte opcion=0;
	     
		   do {
			   
			  opcion=Byte.parseByte(JOptionPane.showInputDialog(
					  "MENU PRINCIPAL\n"
			  +"1.Insertar Nodo\n"
			  +"2.Buscar elemento\n"
			  +"3.Eliminar un nodo\n"
			  +"4.Listar valores del nodo\n"
			  +"5.SALIR\n"
			  +"Eliga una opcion"
			  ));
			  
			  
			  
			   switch(opcion) {
			   case 1:
				   JOptionPane.showMessageDialog(null,"INGRESE EL VALOR");
				   break;
			   case 2:
				   JOptionPane.showMessageDialog(null,"Ingrese elemento a buscar");
				   break;
			   case 3:
				   JOptionPane.showMessageDialog(null,"Ingrese nodo a eliminar");
				   break;
			   case 4:
				  
				   break;
			   case 5:
				   opcion=5;
				   break;
			   default:
				 JOptionPane.showMessageDialog(null,"opcion invalida");	   
			     break;
					   }
			   
		   }while(opcion!=5);
		   System.exit(0);
		  
		   
		}
	}