import java.math.BigInteger;

public class PrimitiveDTBI {

	public static void main(String[] args) {
		BigInteger big_val = BigInteger.valueOf(Long.MAX_VALUE);
		long val_long = big_val.longValue();
		int val_int = big_val.intValue();
		short val_short = big_val.shortValue();
		byte val_byte = big_val.byteValue();
		long val_LongExact = big_val.longValueExact();
		System.out.println("Required output: "+val_long+", "+val_int+" ,"+val_short+", "+val_byte+" ,and "+val_LongExact);

	}

}
