package com.rirpd.services;

import org.junit.Test;

public class DataProcessing {

  ProcessingService service = new ProcessingService();
  
  @Test
  public void test() {
    service.parse();
  }

}
