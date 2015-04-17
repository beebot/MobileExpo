/********************************************************************************
 * Copyright 2000 - 2015 Kyriba Corp. All Rights Reserved.                      *
 * The content of this file is copyrighted by Kyriba Corporation and can not be *
 * reproduced, distributed, altered or used in any form, in whole or in part.   *
 ********************************************************************************/
package by.iit.asuhov.ws;

import javax.jws.WebService;


/**
 * @author M-ASO
 */
@WebService(endpointInterface = "by.iit.asuhov.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{
  @Override
  public String getHelloWorldString(String name)
  {
    return "Hello " + name + ", you fucking asshole!";
  }
}
