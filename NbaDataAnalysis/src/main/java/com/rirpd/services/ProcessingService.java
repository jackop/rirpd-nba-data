package com.rirpd.services;

import java.io.IOException;
import java.util.Scanner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProcessingService {
  
  public void parse() {
    try (Scanner scanner = new Scanner(loadData("nba_stats.csv").getFile());) {
      while (scanner.hasNextLine()) {
        scanner.nextLine();
        System.out.println(scanner.nextLine());
      }
    } catch (IOException e) {
      log.debug("parse | Exception: {}", e.getMessage());
    }
  }
  
  public Resource loadData(String fileName) {
    return new ClassPathResource(fileName);
  }
}
