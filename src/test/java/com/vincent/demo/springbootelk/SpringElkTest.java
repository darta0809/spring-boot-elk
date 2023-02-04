package com.vincent.demo.springbootelk;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SpringElkTest {

  @Test
  void logBack() {
    log.info("info test");
    log.error("error test");
  }
}
