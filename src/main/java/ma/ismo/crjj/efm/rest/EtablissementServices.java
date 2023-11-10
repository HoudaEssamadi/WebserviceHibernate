package ma.ismo.crjj.efm.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	@Path("/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Etablissement getEtablissement(@PathParam("code") int code) {
		return daoEtablissement.getOne(code);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createEtablissement(Etablissement etablissement) {
		boolean success = daoEtablissement.save(etablissement);
		if (success) {
			return Response.status(Response.Status.CREATED).entity(etablissement).build();
		} else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Path("/{code}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateEtablissement(@PathParam("code") int code, Etablissement etablissement) {
		etablissement.setCode_etab(code);
		boolean success = daoEtablissement.update(etablissement);
		if (success) {
			return Response.status(Response.Status.OK).entity(etablissement).build();
		} else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteEtablissement(@PathParam("code") int code) {
		Etablissement existingEtablissement = daoEtablissement.getOne(code);
		if (existingEtablissement != null) {
			boolean success = daoEtablissement.delete(existingEtablissement);
			if (success) {
				return Response.status(Response.Status.NO_CONTENT).build();
			} else {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
			}
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
}