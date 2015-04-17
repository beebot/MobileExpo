/********************************************************************************
 * Copyright 2000 - 2015 Kyriba Corp. All Rights Reserved.                      *
 * The content of this file is copyrighted by Kyriba Corporation and can not be *
 * reproduced, distributed, altered or used in any form, in whole or in part.   *
 ********************************************************************************/
package by.iit.asuhov.controller;

import by.iit.asuhov.ws.HelloWorld;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.URL;


/**
 * @author M-ASO
 */
@WebServlet(urlPatterns = {"/insult"})
public class HelloWorldController extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    String name = req.getParameter("name");

    if (name != null && name.trim().length() > 0) {
      try {
        URL url = new URL("http://localhost:7070/ws?wsdl");
        QName qname = new QName("http://ws.asuhov.iit.by/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld helloWorldImpl = service.getPort(HelloWorld.class);
        req.setAttribute("insult", (helloWorldImpl.getHelloWorldString(name)));

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
      }
      catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      }

    }
  }
}
