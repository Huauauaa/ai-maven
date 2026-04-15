package io.github.huauauaa.aimaven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AiMavenTest {

  @Test
  void nameIsStable() {
    assertEquals("ai-maven", AiMaven.name());
  }
}
