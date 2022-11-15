package org.hprtech;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;


@Path("/search")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
public interface TvSeriesPersonProxy {
    //https://api.tvmaze.com/search/people?q=lauren

    @GET
    @Path("/people")
    JsonArray getTvSeriesByPerson(@QueryParam("q") String personName);
}
