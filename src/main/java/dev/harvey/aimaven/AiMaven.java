package dev.harvey.aimaven;

/**
 * Entry point for the published library.
 */
public final class AiMaven {

  private AiMaven() {}

  /**
   * @return library name for consumers to verify the dependency is on the classpath
   */
  public static String name() {
    return "ai-maven";
  }
}
