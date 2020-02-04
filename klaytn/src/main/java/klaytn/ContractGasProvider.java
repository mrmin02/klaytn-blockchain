package klaytn;

import java.math.BigInteger;

import org.web3j.tx.gas.StaticGasProvider;

import com.klaytn.caver.tx.ManagedTransaction;

public class ContractGasProvider extends StaticGasProvider{
	public static final BigInteger GAS_LIMIT = BigInteger.valueOf(100_000_000);
	public static final BigInteger GAS_PRICE = ManagedTransaction.GAS_PRICE;
	
	public ContractGasProvider() {super(GAS_PRICE, GAS_LIMIT);}
}
