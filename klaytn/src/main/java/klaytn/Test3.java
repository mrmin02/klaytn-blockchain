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
public class Test3 extends SmartContract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b03191633178155600255610330806100356000396000f3fe6080604052600436106100705760003560e01c80638da5cb5b1161004e5780638da5cb5b1461013c578063a87d942c1461016d578063d0e30db014610182578063de7a52511461018a57610070565b806312065fe01461007257806312514bba146100995780633bc5de30146100d7575b005b34801561007e57600080fd5b506100876101ba565b60408051918252519081900360200190f35b3480156100a557600080fd5b506100c3600480360360208110156100bc57600080fd5b50356101bf565b604080519115158252519081900360200190f35b3480156100e357600080fd5b506100ec61020b565b60408051602080825283518183015283519192839290830191858101910280838360005b83811015610128578181015183820152602001610110565b505050509050019250505060405180910390f35b34801561014857600080fd5b50610151610263565b604080516001600160a01b039092168252519081900360200190f35b34801561017957600080fd5b50610087610272565b610070610278565b34801561019657600080fd5b506100c3600480360360408110156101ad57600080fd5b5080359060200135610291565b303190565b6000816101ca6101ba565b10156101d557600080fd5b604051339083156108fc029084906000818181858888f19350505050158015610202573d6000803e3d6000fd5b50600192915050565b6060600180548060200260200160405190810160405280929190818152602001828054801561025957602002820191906000526020600020905b815481526020019060010190808311610245575b5050505050905090565b6000546001600160a01b031681565b60025490565b6000546001600160a01b0316331461028f57600080fd5b565b60008261029c6101ba565b10156102a757600080fd5b604051339084156108fc029085906000818181858888f193505050501580156102d4573d6000803e3d6000fd5b50816001600254815481106102e557fe5b600091825260209091200155506002805460019081019091559291505056fea165627a7a72305820967d620c1b0f3627604c3b041715fdc5346ad1993d053b090db96b0fc24b2cc90029";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_GETDATA = "getData";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_DEPOSIT = "deposit";

    public static final String FUNC_TRANSFERWITHDATA = "transferWithData";

    protected Test3(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    protected Test3(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getBalance() {
        final Function function = new Function(FUNC_GETBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> transfer(BigInteger _value) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> getData() {
        final Function function = new Function(
                FUNC_GETDATA, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> getCount() {
        final Function function = new Function(
                FUNC_GETCOUNT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> deposit(BigInteger pebValue) {
        final Function function = new Function(
                FUNC_DEPOSIT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, pebValue);
    }

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> transferWithData(BigInteger _value, byte[] _data) {
        final Function function = new Function(
                FUNC_TRANSFERWITHDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value), 
                new org.web3j.abi.datatypes.generated.Bytes32(_data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static Test3 load(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return new Test3(contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    public static Test3 load(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Test3(contractAddress, caver, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Test3> deploy(Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test3.class, caver, credentials, chainId, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Test3> deploy(Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test3.class, caver, transactionManager, contractGasProvider, BINARY, "");
    }
}
