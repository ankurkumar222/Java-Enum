// Switching one enum on another.
package Util;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
}
