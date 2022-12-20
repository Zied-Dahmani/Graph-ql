package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entites.Logement;
import entites.Logement.Type;
import entites.RendezVous;
import repositories.LogementRepository;
import repositories.RendezVousRepository;


public class Mutation implements GraphQLRootResolver{
	
    private  RendezVousRepository rendezVousRepository;
    private  LogementRepository logementRepository;

    
	public Mutation(RendezVousRepository stdR) {
		// TODO Auto-generated constructor stub
		this.rendezVousRepository=stdR;
	}
	public RendezVous addRendezVous(int id, String date, String heure,Logement logement,String numTel) {
		RendezVous s= new RendezVous(id,date,heure,logement,numTel);
		this.rendezVousRepository.addRendezVous(s);
		return s;
	}
	
	
	public RendezVous updateRendezVous(int id, String date, String heure,Logement logement,String numTel) {
		RendezVous s= new RendezVous(id,date,heure,logement,numTel);
		this.rendezVousRepository.updateRendezVous(s);
		return s;
	}
	
	public Boolean deleteRendezVouz(int id) {
	  this.rendezVousRepository.deleteRendezVous(id);
	  return true;
	}
	
	
	public Logement saveLogement(int ref, String adresse, String delegation,String gouvernorat,Type type, String description,float prix) {
		Logement s= new Logement(ref,adresse,delegation,gouvernorat,type,description,prix);
		this.logementRepository.saveLogement(s);
		return s;
	}
	
}
