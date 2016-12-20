package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Fixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Fixed80x80 extends Fixed {
  public Fixed80x80(BigInteger value) {
    super(80, 80, value);
  }

  public Fixed80x80(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
    super(80, 80, m, n);
  }
}