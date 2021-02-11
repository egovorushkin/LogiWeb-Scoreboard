package com.egovorushkin.scoreborad.view;

import com.egovorushkin.scoreborad.dto.DriverStatsDto;
import com.egovorushkin.scoreborad.dto.OrderDto;
import com.egovorushkin.scoreborad.dto.TruckStatsDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ejb.Startup;
import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Named
@Startup
@Stateful
@ApplicationScoped
public class ScoreboardView {

    private static final  ObjectMapper objectMapper = new ObjectMapper();

    /**
     * gets list of latest orders from rest api
     * @return list of latest orders
     * @throws JsonProcessingException for errors parsing the rest api response
     */
    public List<OrderDto> getLatestOrders() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:1100/scoreboard/orders");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        return objectMapper.readValue(response, new TypeReference<List<OrderDto>>(){});
    }

    /**
     * gets truck statistics
     * @return object TruckStatsDto with statistics
     * @throws JsonProcessingException for errors parsing the rest api response
     */
    public TruckStatsDto getTruckStats() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:1100/scoreboard/trucks");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        return objectMapper.readValue(response, new TypeReference<TruckStatsDto>() {});
    }

    /**
     * gets driver statistics
     * @return object DriverStatsDto with statistics
     * @throws JsonProcessingException for errors parsing the rest api response
     */
    public DriverStatsDto getDriverStats() throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:1100/scoreboard/drivers");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        return objectMapper.readValue(response, new TypeReference<DriverStatsDto>() {});
    }

}
