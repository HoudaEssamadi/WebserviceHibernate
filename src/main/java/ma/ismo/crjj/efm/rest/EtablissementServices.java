package ma.ismo.crjj.efm.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ma.ismo.crjj.efm.idao.DAOEtablissement;
import ma.ismo.crjj.efm.idao.IDAO;
import ma.ismo.crjj.efm.model.Etablissement;

@Path("/etablissements")
public class EtablissementServices {
	private IDAO<Etablissement> daoEtablissement = new DAOEtablissement();

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Etablissement> getAllEtablissements() {
		return daoEtablissement.getAll();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etablissement getEtablissement(@PathParam("id") int id) {
		return daoEtablissement.getOne(id);
	}
}