package de.pietsch.webservicetest;

import de.pietsch.generiert.*;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class EmployeeEndpoint implements EmployeeServicePortType {



    @Override
    public EmployeesResponse getEmployeesByName(EmployeeByNameRequest parameters) {

        // Erstelle Mock-Objekt als Response
        EmployeesResponse response = new EmployeesResponse();
        String firstname = parameters.getFirstname();
        String lastname = parameters.getLastname();
        Employee responseEmployee = new Employee();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date = null;
        try {
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        responseEmployee.setBirthdate(date);
        responseEmployee.setFirstname(firstname);
        responseEmployee.setLastname(lastname);
        responseEmployee.setGender("fool");
        responseEmployee.setId(1);
        response.getEmployee().add(responseEmployee);
        return response;
    }

    @Override
    public EmployeeResponse getEmployeeById(EmployeeByIdRequest parameters) {

        // Erstelle Mock-Objekt als Response
        EmployeeResponse response = new EmployeeResponse();
        Employee responseEmployee = new Employee();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar date = null;
        try {
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        responseEmployee.setBirthdate(date);
        responseEmployee.setFirstname("Hans");
        responseEmployee.setLastname("Wurst");
        responseEmployee.setGender("fool");
        responseEmployee.setId(parameters.getId());
        response.setEmployee(responseEmployee);
        return response;
    }
}
