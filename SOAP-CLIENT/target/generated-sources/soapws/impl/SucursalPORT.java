
package soapws.impl;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import soapws.interf.ObjectFactory;
import soapws.interf.Sucursal;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "SucursalPORT", targetNamespace = "http://interf.soapws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SucursalPORT {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSucursal", targetNamespace = "http://interf.soapws/", className = "soapws.interf.DeleteSucursal")
    @ResponseWrapper(localName = "deleteSucursalResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.DeleteSucursalResponse")
    @Action(input = "http://interf.soapws/SucursalPORT/deleteSucursalRequest", output = "http://interf.soapws/SucursalPORT/deleteSucursalResponse")
    public Integer deleteSucursal(
        @WebParam(name = "arg0", targetNamespace = "")
        Sucursal arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createSucursal", targetNamespace = "http://interf.soapws/", className = "soapws.interf.CreateSucursal")
    @ResponseWrapper(localName = "createSucursalResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.CreateSucursalResponse")
    @Action(input = "http://interf.soapws/SucursalPORT/createSucursalRequest", output = "http://interf.soapws/SucursalPORT/createSucursalResponse")
    public Integer createSucursal(
        @WebParam(name = "arg0", targetNamespace = "")
        Sucursal arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateSucursal", targetNamespace = "http://interf.soapws/", className = "soapws.interf.UpdateSucursal")
    @ResponseWrapper(localName = "updateSucursalResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.UpdateSucursalResponse")
    @Action(input = "http://interf.soapws/SucursalPORT/updateSucursalRequest", output = "http://interf.soapws/SucursalPORT/updateSucursalResponse")
    public Integer updateSucursal(
        @WebParam(name = "arg0", targetNamespace = "")
        Sucursal arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns soapws.interf.Sucursal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readSucursalById", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadSucursalById")
    @ResponseWrapper(localName = "readSucursalByIdResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadSucursalByIdResponse")
    @Action(input = "http://interf.soapws/SucursalPORT/readSucursalByIdRequest", output = "http://interf.soapws/SucursalPORT/readSucursalByIdResponse")
    public Sucursal readSucursalById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<soapws.interf.Sucursal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllSucursal", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAllSucursal")
    @ResponseWrapper(localName = "readAllSucursalResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAllSucursalResponse")
    @Action(input = "http://interf.soapws/SucursalPORT/readAllSucursalRequest", output = "http://interf.soapws/SucursalPORT/readAllSucursalResponse")
    public List<Sucursal> readAllSucursal();

}