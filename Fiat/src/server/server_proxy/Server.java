package server.server_proxy;

import java.util.ArrayList;

import server.core_business.Gestore_Auto;
import server.core_business.Gestore_Conf;
import server.core_business.Gestore_Utente;
import server.entity.Auto;
import server.entity.Componente;
import server.entity.Configurazione;
import server.entity.Utente;

public class Server {

	public static void main(String[] args) {
		Gestore_CPS ges_cps= Gestore_CPS.getGestoreCPS();
		/*
		 //Usato per provare il server senza il client
		 
		Gestore_Utente gu=Gestore_Utente.getGestoreUtente();
		Gestore_Auto ga=Gestore_Auto.getGestoreAuto();
		Gestore_Conf gc=Gestore_Conf.getGestoreConf();
		
		Componente c= new Componente("Sediolini",1234);
		Componente c2= new Componente("Sediolini",23);
		ArrayList<Componente> listaComponenti=new ArrayList<Componente>();		
		ArrayList<Componente> listaComponenti2=new ArrayList<Componente>();
		listaComponenti.add(c);
		listaComponenti2.add(c);
		listaComponenti2.add(c2);
		
		Auto a1= new Auto(1234,1);
		Auto a2= new Auto(4321,2);
		a1.aggiungiConfigurabilita(c);
		a2.aggiungiConfigurabilita(c);
		a2.aggiungiConfigurabilita(c2);
		
		Configurazione conf= new Configurazione(listaComponenti);
		Configurazione conf2= new Configurazione(listaComponenti2);
		
		Utente u=gu.registraUtente("dario", 1234);
		
		System.out.println(u.getName());
		u.aggiungi_Conf(conf);
		u.aggiungi_Proprieta(a1);
		u.aggiungi_Proprieta(a2);
		

		ArrayList<Configurazione> allconf_utente=gu.getListaConf(u);
		
		System.out.println(allconf_utente.size() );
		Configurazione confmia=allconf_utente.get(0);
		ArrayList<Auto> allAuto_utente=gu.getAllAuto(u);
		System.out.println(allAuto_utente.size() );
		Auto automia=allAuto_utente.get(1);
		System.out.println("Id mai auto"+automia.getId() );
		
		ges_cps.associaConfigurazione(u);
		*/
		ges_cps.runSkeleton();
			
	}

}
