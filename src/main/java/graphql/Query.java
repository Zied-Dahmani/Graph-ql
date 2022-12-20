package graphql;

import java.util.ArrayList;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entites.Logement;
import entites.Logement.Type;
import entites.RendezVous;
import repositories.LogementRepository;
import repositories.RendezVousRepository;


public class Query implements GraphQLRootResolver{

	private RendezVousRepository rendezVousRepository;
	private LogementRepository logementRepository;

	
	public Query(RendezVousRepository rvR)
	{
		this.rendezVousRepository=rvR;
	}
	
	
	public List<RendezVous> getListeRendezVous()
	
	{return rendezVousRepository.getListeRendezVous();}
	
	
	  public List<RendezVous> getListeRendezVousByLogementRef(int reference) {
		  return rendezVousRepository.getListeRendezVousByLogementRef(reference);
		}
	
	
	 
	  public RendezVous getRendezVous(int id)
	  {
		  return rendezVousRepository.getRendezVous(id);
	  }
	  
	  public List<Logement> getListeLogement()
		
		{return logementRepository.getAllLogements();}
	  
	  
	  
	  
	  public Logement getLogement(int reference) 
	 {
		  return logementRepository.getLogementsByReference(reference);
	}
	  
	  public List<Logement> getLogementByType(Type type) 
		 {
			  return logementRepository.getLogementsByType(type);
		}
	
}
