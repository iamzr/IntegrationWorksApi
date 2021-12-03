package com.example.demo;


import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.security.DrbgParameters.Reseed;
import java.util.Arrays;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import com.ctc.wstx.shaded.msv.org_isorelax.verifier.Schema;

import org.apache.catalina.connector.Response;
import org.apache.naming.StringManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.oxm.Marshaller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.xml.sax.SAXException;
import org.yaml.snakeyaml.reader.StreamReader;

import generated.*;
import generated.PurchaseOrder.PurchaseOrderLines;
import generated.PurchaseOrder.PurchaseOrderLines.PurchaseOrderLine;

@RestController
public class Controller {

	@CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/order", consumes = MediaType.APPLICATION_XML_VALUE
	,produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<PurchaseOrder> order(@RequestBody(required=true) String order) {

		File schemaFile = new File("src/main/resources/schema/schema.xsd"); // etc.
		Source xmlFile = new StreamSource(order);

		SchemaFactory schemaFactory = SchemaFactory
    		.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
  		javax.xml.validation.Schema schema = schemaFactory.newSchema(schemaFile);
  		Validator validator = schema.newValidator();
  		validator.validate(xmlFile);
  		System.out.println(xmlFile.getSystemId() + " is valid");
		} catch (SAXException e) {
  		System.out.println(xmlFile.getSystemId() + " is NOT valid reason:" + e);
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foo Not Found", e);
		} catch (IOException e) {
			// return ResponseEntity.status(400);
			// System.out.print(e);
		// throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Invalid XML"));
		}


		 JAXBContext jaxbContext;
		try
		{
    		jaxbContext = JAXBContext.newInstance(PurchaseOrder.class);              
 
    		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
 
    		PurchaseOrder employee = (PurchaseOrder) jaxbUnmarshaller.unmarshal(new StringReader(order));
				
			PurchaseOrderLines lines = employee.getPurchaseOrderLines();
			List<PurchaseOrderLine> lineList = lines.getPurchaseOrderLine();

			for (int i=0; i< lineList.size(); i++) {
				byte cost = lineList.get(i).getCost();
				byte newCost = (byte)(cost * 1.23);
				lineList.get(i).setCost(newCost);
			}

			

			return ResponseEntity.status(HttpStatus.CREATED).body(employee);
    		// System.out.println(employee);
		}
		catch (JAXBException e) 
		{
			System.out.print(e);
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Invalid XML"));
		} 

	}



	@CrossOrigin(origins = "http://localhost:8080")
    // @RequestMapping(value = "/remote/search", method = RequestMethod.GET, produces = { "application/xml", "text/xml" }, consumes = MediaType.ALL_VALUE )
    @PostMapping(value = "/", consumes = MediaType.APPLICATION_XML_VALUE)
	// ,produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public PurchaseOrder updateOrder(@RequestBody(required=true) PurchaseOrder order) {
		// PurchaseOrder.PurchaseOrderLines orderLines = order.getPurchaseOrderLines();
		
		// System.out.println(order.getCustomerLast());
		return order;
	}

    
}