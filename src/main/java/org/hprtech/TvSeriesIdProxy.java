package org.hprtech;

import io.vertx.core.json.JsonArray;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
public interface TvSeriesIdProxy {

    //https://api.tvmaze.com/shows/120
    @GET
    @Path("shows/{id}")
    TvSeries getTvSeriesById(@PathParam("id") int id);



    //https://api.tvmaze.com/search/people?q=lauren
    @GET
    @Path("search/people")
    JsonArray getTvSeriesByPersonNane(@QueryParam("q") String personName);
}
