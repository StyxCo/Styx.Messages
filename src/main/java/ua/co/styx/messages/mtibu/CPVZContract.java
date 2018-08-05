package ua.co.styx.messages.mtibu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CPVZContract {
    @SerializedName("FContract.FContractID")
    @Expose
    private String fContractFContractID;
    @SerializedName("FContract.DInsurerID")
    @Expose
    private String fContractDInsurerID;
    @SerializedName("FContract.PolicySeries")
    @Expose
    private String fContractPolicySeries;
    @SerializedName("FContract.PolicyNo")
    @Expose
    private String fContractPolicyNo;
    @SerializedName("FContract.IsContractActiveOnDate")
    @Expose
    private String fContractIsContractActiveOnDate;
    @SerializedName("FContract.DInsurer.Name")
    @Expose
    private String fContractDInsurerName;
    @SerializedName("FContract.DInsurer.PhoneNo")
    @Expose
    private String fContractDInsurerPhoneNo;
    @SerializedName("FContract.DInsurer.Fax")
    @Expose
    private String fContractDInsurerFax;
    @SerializedName("FContract.DInsurer.EMail")
    @Expose
    private String fContractDInsurerEMail;
    @SerializedName("FContract.DInsurer.Address")
    @Expose
    private String fContractDInsurerAddress;
    @SerializedName("FContract.FVehicle.RegNo")
    @Expose
    private String fContractFVehicleRegNo;
    @SerializedName("FContract.FVehicle.VIN")
    @Expose
    private String fContractFVehicleVIN;
    @SerializedName("FContract.FVehicle.Descr")
    @Expose
    private String fContractFVehicleDescr;
    @SerializedName("FContract.LifeLimit")
    @Expose
    private String fContractLifeLimit;
    @SerializedName("FContract.PropertyLimit")
    @Expose
    private String fContractPropertyLimit;
    @SerializedName("FContract.Franchise")
    @Expose
    private String fContractFranchise;

    public String getFContractFContractID() {
        return fContractFContractID;
    }

    public void setFContractFContractID(String fContractFContractID) {
        this.fContractFContractID = fContractFContractID;
    }

    public String getFContractDInsurerID() {
        return fContractDInsurerID;
    }

    public void setFContractDInsurerID(String fContractDInsurerID) {
        this.fContractDInsurerID = fContractDInsurerID;
    }

    public String getFContractPolicySeries() {
        return fContractPolicySeries;
    }

    public void setFContractPolicySeries(String fContractPolicySeries) {
        this.fContractPolicySeries = fContractPolicySeries;
    }

    public String getFContractPolicyNo() {
        return fContractPolicyNo;
    }

    public void setFContractPolicyNo(String fContractPolicyNo) {
        this.fContractPolicyNo = fContractPolicyNo;
    }

    public String getFContractIsContractActiveOnDate() {
        return fContractIsContractActiveOnDate;
    }

    public void setFContractIsContractActiveOnDate(String fContractIsContractActiveOnDate) {
        this.fContractIsContractActiveOnDate = fContractIsContractActiveOnDate;
    }

    public String getFContractDInsurerName() {
        return fContractDInsurerName;
    }

    public void setFContractDInsurerName(String fContractDInsurerName) {
        this.fContractDInsurerName = fContractDInsurerName;
    }

    public String getFContractDInsurerPhoneNo() {
        return fContractDInsurerPhoneNo;
    }

    public void setFContractDInsurerPhoneNo(String fContractDInsurerPhoneNo) {
        this.fContractDInsurerPhoneNo = fContractDInsurerPhoneNo;
    }

    public String getFContractDInsurerFax() {
        return fContractDInsurerFax;
    }

    public void setFContractDInsurerFax(String fContractDInsurerFax) {
        this.fContractDInsurerFax = fContractDInsurerFax;
    }

    public String getFContractDInsurerEMail() {
        return fContractDInsurerEMail;
    }

    public void setFContractDInsurerEMail(String fContractDInsurerEMail) {
        this.fContractDInsurerEMail = fContractDInsurerEMail;
    }

    public String getFContractDInsurerAddress() {
        return fContractDInsurerAddress;
    }

    public void setFContractDInsurerAddress(String fContractDInsurerAddress) {
        this.fContractDInsurerAddress = fContractDInsurerAddress;
    }

    public String getFContractFVehicleRegNo() {
        return fContractFVehicleRegNo;
    }

    public void setFContractFVehicleRegNo(String fContractFVehicleRegNo) {
        this.fContractFVehicleRegNo = fContractFVehicleRegNo;
    }

    public String getFContractFVehicleVIN() {
        return fContractFVehicleVIN;
    }

    public void setFContractFVehicleVIN(String fContractFVehicleVIN) {
        this.fContractFVehicleVIN = fContractFVehicleVIN;
    }

    public String getFContractFVehicleDescr() {
        return fContractFVehicleDescr;
    }

    public void setFContractFVehicleDescr(String fContractFVehicleDescr) {
        this.fContractFVehicleDescr = fContractFVehicleDescr;
    }

    public String getFContractLifeLimit() {
        return fContractLifeLimit;
    }

    public void setFContractLifeLimit(String fContractLifeLimit) {
        this.fContractLifeLimit = fContractLifeLimit;
    }

    public String getFContractPropertyLimit() {
        return fContractPropertyLimit;
    }

    public void setFContractPropertyLimit(String fContractPropertyLimit) {
        this.fContractPropertyLimit = fContractPropertyLimit;
    }

    public String getFContractFranchise() {
        return fContractFranchise;
    }

    public void setFContractFranchise(String fContractFranchise) {
        this.fContractFranchise = fContractFranchise;
    }

}
