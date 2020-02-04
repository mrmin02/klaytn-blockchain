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
public class Test4 extends SmartContract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b031916331781556001556106a4806100356000396000f3fe6080604052600436106100705760003560e01c80633bc5de301161004e5780633bc5de30146100ea5780638da5cb5b1461010c578063a87d942c1461012e578063d0e30db01461014357610070565b806312065fe01461007257806312514bba1461009d57806320a9d963146100ca575b005b34801561007e57600080fd5b5061008761014b565b6040516100949190610598565b60405180910390f35b3480156100a957600080fd5b506100bd6100b8366004610424565b610151565b604051610094919061058a565b3480156100d657600080fd5b506100bd6100e536600461044a565b61019d565b3480156100f657600080fd5b506100ff61021f565b6040516100949190610579565b34801561011857600080fd5b506101216102f7565b604051610094919061056b565b34801561013a57600080fd5b50610087610306565b61007061030c565b30315b90565b60008161015c61014b565b101561016757600080fd5b604051339083156108fc029084906000818181858888f19350505050158015610194573d6000803e3d6000fd5b50600192915050565b6000826101a861014b565b10156101b357600080fd5b604051339084156108fc029085906000818181858888f193505050501580156101e0573d6000803e3d6000fd5b50816002600154815481106101f157fe5b90600052602060002001908051906020019061020e929190610325565b505060018054810181555b92915050565b60606002805480602002602001604051908101604052809291908181526020016000905b828210156102ee5760008481526020908190208301805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156102da5780601f106102af576101008083540402835291602001916102da565b820191906000526020600020905b8154815290600101906020018083116102bd57829003601f168201915b505050505081526020019060010190610243565b50505050905090565b6000546001600160a01b031681565b60015490565b6000546001600160a01b0316331461032357600080fd5b565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061036657805160ff1916838001178555610393565b82800160010185558215610393579182015b82811115610393578251825591602001919060010190610378565b5061039f9291506103a3565b5090565b61014e91905b8082111561039f57600081556001016103a9565b600082601f8301126103ce57600080fd5b81356103e16103dc826105cd565b6105a6565b915080825260208301602083018583830111156103fd57600080fd5b610408838284610624565b50505092915050565b600061041d823561014e565b9392505050565b60006020828403121561043657600080fd5b60006104428484610411565b949350505050565b6000806040838503121561045d57600080fd5b60006104698585610411565b925050602083013567ffffffffffffffff81111561048657600080fd5b610492858286016103bd565b9150509250929050565b600061041d838361052a565b6104b181610608565b82525050565b60006104c2826105fb565b6104cc81856105ff565b9350836020820285016104de856105f5565b60005b848110156105155783830388526104f983835161049c565b9250610504826105f5565b6020989098019791506001016104e1565b50909695505050505050565b6104b181610613565b6000610535826105fb565b61053f81856105ff565b935061054f818560208601610630565b61055881610660565b9093019392505050565b6104b18161014e565b6020810161021982846104a8565b6020808252810161041d81846104b7565b602081016102198284610521565b602081016102198284610562565b60405181810167ffffffffffffffff811182821017156105c557600080fd5b604052919050565b600067ffffffffffffffff8211156105e457600080fd5b506020601f91909101601f19160190565b60200190565b5190565b90815260200190565b600061021982610618565b151590565b6001600160a01b031690565b82818337506000910152565b60005b8381101561064b578181015183820152602001610633565b8381111561065a576000848401525b50505050565b601f01601f19169056fea265627a7a72305820ac2480f58f6dff3f6ac7bd96763de3604c0b97a6ae3aeb36087a64d8f26aebd26c6578706572696d656e74616cf50037";

    public static final String FUNC_GETBALANCE = "getBalance";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_TRANSFERWITHDATA = "transferWithData";

    public static final String FUNC_GETDATA = "getData";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_GETCOUNT = "getCount";

    public static final String FUNC_DEPOSIT = "deposit";

    protected Test4(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    protected Test4(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
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

    public RemoteCall<KlayTransactionReceipt.TransactionReceipt> transferWithData(BigInteger _value, String _data) {
        final Function function = new Function(
                FUNC_TRANSFERWITHDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_value), 
                new org.web3j.abi.datatypes.Utf8String(_data)), 
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

    public static Test4 load(String contractAddress, Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return new Test4(contractAddress, caver, credentials, chainId, contractGasProvider);
    }

    public static Test4 load(String contractAddress, Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Test4(contractAddress, caver, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Test4> deploy(Caver caver, KlayCredentials credentials, int chainId, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test4.class, caver, credentials, chainId, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Test4> deploy(Caver caver, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Test4.class, caver, transactionManager, contractGasProvider, BINARY, "");
    }
}
