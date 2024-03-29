package graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;


import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import repositories.RendezVousRepository;

@WebServlet(urlPatterns = "/GraphQLV1")
public class GraphEndPoint extends SimpleGraphQLServlet {

	public GraphEndPoint() {
		super(buildSchema());
		// TODO Auto-generated constructor stub
	}
	
	 private static GraphQLSchema buildSchema()
	 {
		 
		 RendezVousRepository rendezVousRepository=new RendezVousRepository();
		 return SchemaParser.newParser().file("schema.graphql")
				 .resolvers(new Query(rendezVousRepository), 
						 new Mutation(rendezVousRepository))
				 .build()
				 .makeExecutableSchema();
		 	 
		 
	 }

	 
}

