package de.pietsch.webservicetest;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

@Component
public class ApplicationConfiguration {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint(EmployeeEndpoint employeeEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, employeeEndpoint);
        endpoint.publish("/service/employee");
        return endpoint;
    }

}
