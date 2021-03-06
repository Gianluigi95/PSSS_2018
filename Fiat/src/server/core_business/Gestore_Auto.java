package server.core_business;

import java.util.ArrayList;

import server.entity.Auto;
import server.entity.Componente;
import server.entity.Configurabilita;
import server.entity.Configurazione;

public class Gestore_Auto {
	private static Gestore_Auto gestoreAuto_instance=null;
	
	private Gestore_Auto() {
		
	}
	public static synchronized Gestore_Auto getGestoreAuto() {
		if(gestoreAuto_instance==null) {
		//	System.out.println("Inizializzo il gestoreAuto");
			gestoreAuto_instance=new Gestore_Auto();
		}
		//System.out.println("Ritorna il gestoreAuto");
		return gestoreAuto_instance;
	}
		
	public ArrayList<Componente> getAllComp(Auto a) {
		ArrayList<Configurabilita> lista_configurab=new ArrayList<Configurabilita>(a.getListaConfigurabilita() );
		ArrayList<Componente> lista_comp=new ArrayList<Componente>();
		for(int i=0;i<lista_configurab.size();i++) {
			lista_comp.add(lista_configurab.get(i).getComponente());
			}
		return lista_comp;
	}
	
	public void configura_Auto(Auto a,Configurazione c) {
		a.configura_Auto(c);
	}

}
