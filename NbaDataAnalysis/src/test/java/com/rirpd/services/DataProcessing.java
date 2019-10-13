package com.rirpd.services;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataProcessing {

  ProcessingService service = new ProcessingService();
  
  @Test
  public void test() {
    service.parse();
  }

}
