package klaytn;

import com.klaytn.caver.Caver;
import com.klaytn.caver.crpyto.KlayCredentials;
import com.klaytn.caver.methods.response.KlayTransactionReceipt;
import com.klaytn.caver.tx.SmartContract;
import com.klaytn.caver.tx.manager.TransactionManager;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated smart contract code.
 * <p><strong>Do not modify!</strong>
 */
public class Vote extends SmartContract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b031916331790556101b6806100326000396000f3fe60806040526004361061003f5760003560e01c806312065fe01461004457806312514bba1461006b5780638da5cb5b146100a9578063d0e30db0146100da575b600080fd5b34801561005057600080fd5b506100596100e4565b60408051918252519081900360200190f35b34801561007757600080fd5b506100956004803603602081101561008e57600080fd5b50356100e8565b604080519115158252519081900360200190f35b3480156100b557600080fd5b506100be610134565b604080516001600160a01b039092168252519081900360200190f35b6100e2610143565b005b4790565b6000816100f36100e4565b10156100fe57600080fd5b604051339083156108fc029084906000818181858888f1935050505015801561012b573d6000803e3d6000fd5b50600192915050565b6000546001600160a01b031681565b6000546001600160a01b0316331461015a57600080fd5b56fea265627a7a7231582079b63c6953dfdee2ebb837f84f81b79b49d3f62c6974ecaa382ffcfc7e7a571b64736f6c637827302e352e31362d6e696768746c792e323032302e312e322b636f6d6d69742e39633332323663650057";

    public static final String FUNC_DEPOSIT = "deposit";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_TRANSFER = "transfer";

    protected Vote(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    protected Vote(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, transactionManager, contractGasProvider);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> deposit(BigInteger pebValue) {
        final Function function = new Function(
                FUNC_DEPOSIT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, pebValue);
    }

    public RemoteCall<BigInteger> getBalance() {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> transfer(BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function); 
    }

    public static Vote load(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return new Vote(contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    public static Vote load(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Vote(contractAddress, caver, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Vote> deploy(Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Vote.class, caver, credentials, chainId, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Vote> deploy(Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Vote.class, caver, transactionManager, contractGasProvider, BINARY, "");
    }
}
