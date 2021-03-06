package dk.alexandra.fresco.outsourcing.client;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.Future;

/**
 * The client side of an output procedure.
 *
 * <p>
 * Performs the protocol for receiving output from the servers and hands clear text outputs to the
 * client application.
 * </p>
 */
public interface OutputClient {

  /**
   * Gets output as a list of BigIntegers.
   *
   * @return a future eventually holding the output
   */
  Future<List<BigInteger>> getBigIntegerOutputs();

  /**
   * Gets output as a list of Longs.
   *
   * @return a future eventually holding the output
   */
  Future<List<Long>> getLongOutputs();


  /**
   * Gets output as a list of Integers.
   *
   * @return a future eventually holding the output
   */
  Future<List<Integer>> getIntOutputs();
}
