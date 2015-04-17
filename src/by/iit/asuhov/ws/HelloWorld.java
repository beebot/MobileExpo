/********************************************************************************
 * Copyright 2000 - 2015 Kyriba Corp. All Rights Reserved.                      *
 * The content of this file is copyrighted by Kyriba Corporation and can not be *
 * reproduced, distributed, altered or used in any form, in whole or in part.   *
 ********************************************************************************/
package by.iit.asuhov.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;


/**
 * @author M-ASO
 */
@WebService
public interface HelloWorld
{
  @WebMethod
  String getHelloWorldString(String name);
}
