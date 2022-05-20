package de.pietsch.generiert;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2022-05-19T14:33:18.916+02:00
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://www.jpworks.com/employee", name = "EmployeeServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeeServicePortType {

    @WebMethod(operationName = "GetEmployeesByName", action = "http://www.jpworks.com/employee/GetEmployeesByName")
    @WebResult(name = "EmployeesResponse", targetNamespace = "http://www.jpworks.com/employee", partName = "parameters")
    public EmployeesResponse getEmployeesByName(

        @WebParam(partName = "parameters", name = "EmployeeByNameRequest", targetNamespace = "http://www.jpworks.com/employee")
        EmployeeByNameRequest parameters
    );

    @WebMethod(operationName = "GetEmployeeById", action = "http://www.jpworks.com/employee/GetEmployeeById")
    @WebResult(name = "EmployeeResponse", targetNamespace = "http://www.jpworks.com/employee", partName = "parameters")
    public EmployeeResponse getEmployeeById(

        @WebParam(partName = "parameters", name = "EmployeeByIdRequest", targetNamespace = "http://www.jpworks.com/employee")
        EmployeeByIdRequest parameters
    );
}