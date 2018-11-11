package ua.co.styx.messages.mtibu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImportContractRequest {

    @SerializedName("Agent")
    @Expose
    private String agent;
    @SerializedName("Agent_Id")
    @Expose
    private String agentId;
    @SerializedName("BranchCode")
    @Expose
    private String branchCode;
    @SerializedName("Cart_Id")
    @Expose
    private String cartId;
    @SerializedName("Contract")
    @Expose
    private Contract contract;
    @SerializedName("Deal_Id")
    @Expose
    private String dealId;
    @SerializedName("Errors")
    @Expose
    private String errors;
    @SerializedName("IsDuplicate")
    @Expose
    private Boolean isDuplicate;
    @SerializedName("IsLoaded")
    @Expose
    private Boolean isLoaded;

    /**
     * No args constructor for use in serialization
     *
     */
    public ImportContractRequest() {
    }

    /**
     *
     * @param isDuplicate
     * @param errors
     * @param contract
     * @param agentId
     * @param cartId
     * @param dealId
     * @param branchCode
     * @param agent
     * @param isLoaded
     */
    public ImportContractRequest(String agent, String agentId, String branchCode, String cartId, Contract contract, String dealId, String errors, Boolean isDuplicate, Boolean isLoaded) {
        super();
        this.agent = agent;
        this.agentId = agentId;
        this.branchCode = branchCode;
        this.cartId = cartId;
        this.contract = contract;
        this.dealId = dealId;
        this.errors = errors;
        this.isDuplicate = isDuplicate;
        this.isLoaded = isLoaded;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public Boolean getIsDuplicate() {
        return isDuplicate;
    }

    public void setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    public Boolean getIsLoaded() {
        return isLoaded;
    }

    public void setIsLoaded(Boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

}