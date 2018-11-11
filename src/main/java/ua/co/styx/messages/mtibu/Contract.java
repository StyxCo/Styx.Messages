package ua.co.styx.messages.mtibu;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contract {

    @SerializedName("MainCode")
    @Expose
    private String mainCode;
    @SerializedName("PolicyDirectLink")
    @Expose
    private String policyDirectLink;
    @SerializedName("address_e")
    @Expose
    private String addressE;
    @SerializedName("auto")
    @Expose
    private String auto;
    @SerializedName("b_m")
    @Expose
    private Integer bM;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("c_city")
    @Expose
    private Integer cCity;
    @SerializedName("c_discount")
    @Expose
    private Integer cDiscount;
    @SerializedName("c_exp")
    @Expose
    private Integer cExp;
    @SerializedName("c_mark")
    @Expose
    private Integer cMark;
    @SerializedName("c_model")
    @Expose
    private Integer cModel;
    @SerializedName("c_privileg")
    @Expose
    private Integer cPrivileg;
    @SerializedName("c_term")
    @Expose
    private Integer cTerm;
    @SerializedName("c_type")
    @Expose
    private Integer cType;
    @SerializedName("chng_nagr")
    @Expose
    private Integer chngNagr;
    @SerializedName("chng_sagr")
    @Expose
    private String chngSagr;
    @SerializedName("commission_av")
    @Expose
    private Double commissionAv;
    @SerializedName("commission_ikp")
    @Expose
    private Double commissionIkp;
    @SerializedName("compl")
    @Expose
    private Integer compl;
    @SerializedName("contr_id")
    @Expose
    private String contrId;
    @SerializedName("d_abort")
    @Expose
    private String dAbort;
    @SerializedName("d_beg")
    @Expose
    private String dBeg;
    @SerializedName("d_distr")
    @Expose
    private String dDistr;
    @SerializedName("d_end")
    @Expose
    private String dEnd;
    @SerializedName("date_next_to")
    @Expose
    private String dateNextTo;
    @SerializedName("doc_issue_date")
    @Expose
    private String docIssueDate;
    @SerializedName("doc_issued")
    @Expose
    private String docIssued;
    @SerializedName("doc_name")
    @Expose
    private String docName;
    @SerializedName("doc_no")
    @Expose
    private String docNo;
    @SerializedName("doc_series")
    @Expose
    private String docSeries;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("f_name")
    @Expose
    private String fName;
    @SerializedName("franchise")
    @Expose
    private Double franchise;
    @SerializedName("is_active1")
    @Expose
    private Boolean isActive1;
    @SerializedName("is_active10")
    @Expose
    private Boolean isActive10;
    @SerializedName("is_active11")
    @Expose
    private Boolean isActive11;
    @SerializedName("is_active12")
    @Expose
    private Boolean isActive12;
    @SerializedName("is_active2")
    @Expose
    private Boolean isActive2;
    @SerializedName("is_active3")
    @Expose
    private Boolean isActive3;
    @SerializedName("is_active4")
    @Expose
    private Boolean isActive4;
    @SerializedName("is_active5")
    @Expose
    private Boolean isActive5;
    @SerializedName("is_active6")
    @Expose
    private Boolean isActive6;
    @SerializedName("is_active7")
    @Expose
    private Boolean isActive7;
    @SerializedName("is_active8")
    @Expose
    private Boolean isActive8;
    @SerializedName("is_active9")
    @Expose
    private Boolean isActive9;
    @SerializedName("k1")
    @Expose
    private Double k1;
    @SerializedName("k2")
    @Expose
    private Double k2;
    @SerializedName("k3")
    @Expose
    private Double k3;
    @SerializedName("k4")
    @Expose
    private Double k4;
    @SerializedName("k5")
    @Expose
    private Double k5;
    @SerializedName("k6")
    @Expose
    private Double k6;
    @SerializedName("k7")
    @Expose
    private Double k7;
    @SerializedName("limit_life")
    @Expose
    private Double limitLife;
    @SerializedName("limit_prop")
    @Expose
    private Double limitProp;
    @SerializedName("mark_txt")
    @Expose
    private String markTxt;
    @SerializedName("model_txt")
    @Expose
    private String modelTxt;
    @SerializedName("nagr")
    @Expose
    private Integer nagr;
    @SerializedName("need_to")
    @Expose
    private Boolean needTo;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("numb_ins")
    @Expose
    private String numbIns;
    @SerializedName("p_name")
    @Expose
    private String pName;
    @SerializedName("paym_bal")
    @Expose
    private Double paymBal;
    @SerializedName("payment")
    @Expose
    private Double payment;
    @SerializedName("person_s")
    @Expose
    private String personS;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("post_code")
    @Expose
    private String postCode;
    @SerializedName("prod_year")
    @Expose
    private Integer prodYear;
    @SerializedName("reg_no")
    @Expose
    private String regNo;
    @SerializedName("resident")
    @Expose
    private Boolean resident;
    @SerializedName("retpayment")
    @Expose
    private Double retpayment;
    @SerializedName("s_name")
    @Expose
    private String sName;
    @SerializedName("sagr")
    @Expose
    private String sagr;
    @SerializedName("sphere_use")
    @Expose
    private Integer sphereUse;
    @SerializedName("status_prs")
    @Expose
    private String statusPrs;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("zone")
    @Expose
    private Integer zone;

    /**
     * No args constructor for use in serialization
     *
     */
    public Contract() {
    }

    /**
     *
     * @param cModel
     * @param isActive1
     * @param phone
     * @param isActive3
     * @param isActive2
     * @param isActive5
     * @param isActive4
     * @param dAbort
     * @param isActive7
     * @param isActive6
     * @param isActive9
     * @param isActive8
     * @param retpayment
     * @param resident
     * @param contrId
     * @param pName
     * @param limitProp
     * @param vin
     * @param birthDate
     * @param isActive11
     * @param modelTxt
     * @param policyDirectLink
     * @param isActive12
     * @param dBeg
     * @param chngSagr
     * @param chngNagr
     * @param dDistr
     * @param cCity
     * @param nagr
     * @param sphereUse
     * @param cPrivileg
     * @param email
     * @param auto
     * @param isActive10
     * @param cDiscount
     * @param docIssueDate
     * @param docIssued
     * @param limitLife
     * @param prodYear
     * @param dEnd
     * @param mainCode
     * @param docNo
     * @param markTxt
     * @param docSeries
     * @param needTo
     * @param dateNextTo
     * @param personS
     * @param fName
     * @param sagr
     * @param compl
     * @param commissionIkp
     * @param paymBal
     * @param numbIns
     * @param note
     * @param cTerm
     * @param k3
     * @param k4
     * @param k5
     * @param docName
     * @param k6
     * @param addressE
     * @param franchise
     * @param payment
     * @param k7
     * @param postCode
     * @param cMark
     * @param k1
     * @param cType
     * @param k2
     * @param bM
     * @param statusPrs
     * @param sName
     * @param regNo
     * @param cExp
     * @param zone
     * @param commissionAv
     */
    public Contract(String mainCode, String policyDirectLink, String addressE, String auto, Integer bM, String birthDate, Integer cCity, Integer cDiscount, Integer cExp, Integer cMark, Integer cModel, Integer cPrivileg, Integer cTerm, Integer cType, Integer chngNagr, String chngSagr, Double commissionAv, Double commissionIkp, Integer compl, String contrId, String dAbort, String dBeg, String dDistr, String dEnd, String dateNextTo, String docIssueDate, String docIssued, String docName, String docNo, String docSeries, String email, String fName, Double franchise, Boolean isActive1, Boolean isActive10, Boolean isActive11, Boolean isActive12, Boolean isActive2, Boolean isActive3, Boolean isActive4, Boolean isActive5, Boolean isActive6, Boolean isActive7, Boolean isActive8, Boolean isActive9, Double k1, Double k2, Double k3, Double k4, Double k5, Double k6, Double k7, Double limitLife, Double limitProp, String markTxt, String modelTxt, Integer nagr, Boolean needTo, String note, String numbIns, String pName, Double paymBal, Double payment, String personS, String phone, String postCode, Integer prodYear, String regNo, Boolean resident, Double retpayment, String sName, String sagr, Integer sphereUse, String statusPrs, String vin, Integer zone) {
        super();
        this.mainCode = mainCode;
        this.policyDirectLink = policyDirectLink;
        this.addressE = addressE;
        this.auto = auto;
        this.bM = bM;
        this.birthDate = birthDate;
        this.cCity = cCity;
        this.cDiscount = cDiscount;
        this.cExp = cExp;
        this.cMark = cMark;
        this.cModel = cModel;
        this.cPrivileg = cPrivileg;
        this.cTerm = cTerm;
        this.cType = cType;
        this.chngNagr = chngNagr;
        this.chngSagr = chngSagr;
        this.commissionAv = commissionAv;
        this.commissionIkp = commissionIkp;
        this.compl = compl;
        this.contrId = contrId;
        this.dAbort = dAbort;
        this.dBeg = dBeg;
        this.dDistr = dDistr;
        this.dEnd = dEnd;
        this.dateNextTo = dateNextTo;
        this.docIssueDate = docIssueDate;
        this.docIssued = docIssued;
        this.docName = docName;
        this.docNo = docNo;
        this.docSeries = docSeries;
        this.email = email;
        this.fName = fName;
        this.franchise = franchise;
        this.isActive1 = isActive1;
        this.isActive10 = isActive10;
        this.isActive11 = isActive11;
        this.isActive12 = isActive12;
        this.isActive2 = isActive2;
        this.isActive3 = isActive3;
        this.isActive4 = isActive4;
        this.isActive5 = isActive5;
        this.isActive6 = isActive6;
        this.isActive7 = isActive7;
        this.isActive8 = isActive8;
        this.isActive9 = isActive9;
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
        this.k4 = k4;
        this.k5 = k5;
        this.k6 = k6;
        this.k7 = k7;
        this.limitLife = limitLife;
        this.limitProp = limitProp;
        this.markTxt = markTxt;
        this.modelTxt = modelTxt;
        this.nagr = nagr;
        this.needTo = needTo;
        this.note = note;
        this.numbIns = numbIns;
        this.pName = pName;
        this.paymBal = paymBal;
        this.payment = payment;
        this.personS = personS;
        this.phone = phone;
        this.postCode = postCode;
        this.prodYear = prodYear;
        this.regNo = regNo;
        this.resident = resident;
        this.retpayment = retpayment;
        this.sName = sName;
        this.sagr = sagr;
        this.sphereUse = sphereUse;
        this.statusPrs = statusPrs;
        this.vin = vin;
        this.zone = zone;
    }

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode;
    }

    public String getPolicyDirectLink() {
        return policyDirectLink;
    }

    public void setPolicyDirectLink(String policyDirectLink) {
        this.policyDirectLink = policyDirectLink;
    }

    public String getAddressE() {
        return addressE;
    }

    public void setAddressE(String addressE) {
        this.addressE = addressE;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public Integer getBM() {
        return bM;
    }

    public void setBM(Integer bM) {
        this.bM = bM;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getCCity() {
        return cCity;
    }

    public void setCCity(Integer cCity) {
        this.cCity = cCity;
    }

    public Integer getCDiscount() {
        return cDiscount;
    }

    public void setCDiscount(Integer cDiscount) {
        this.cDiscount = cDiscount;
    }

    public Integer getCExp() {
        return cExp;
    }

    public void setCExp(Integer cExp) {
        this.cExp = cExp;
    }

    public Integer getCMark() {
        return cMark;
    }

    public void setCMark(Integer cMark) {
        this.cMark = cMark;
    }

    public Integer getCModel() {
        return cModel;
    }

    public void setCModel(Integer cModel) {
        this.cModel = cModel;
    }

    public Integer getCPrivileg() {
        return cPrivileg;
    }

    public void setCPrivileg(Integer cPrivileg) {
        this.cPrivileg = cPrivileg;
    }

    public Integer getCTerm() {
        return cTerm;
    }

    public void setCTerm(Integer cTerm) {
        this.cTerm = cTerm;
    }

    public Integer getCType() {
        return cType;
    }

    public void setCType(Integer cType) {
        this.cType = cType;
    }

    public Integer getChngNagr() {
        return chngNagr;
    }

    public void setChngNagr(Integer chngNagr) {
        this.chngNagr = chngNagr;
    }

    public String getChngSagr() {
        return chngSagr;
    }

    public void setChngSagr(String chngSagr) {
        this.chngSagr = chngSagr;
    }

    public Double getCommissionAv() {
        return commissionAv;
    }

    public void setCommissionAv(Double commissionAv) {
        this.commissionAv = commissionAv;
    }

    public Double getCommissionIkp() {
        return commissionIkp;
    }

    public void setCommissionIkp(Double commissionIkp) {
        this.commissionIkp = commissionIkp;
    }

    public Integer getCompl() {
        return compl;
    }

    public void setCompl(Integer compl) {
        this.compl = compl;
    }

    public String getContrId() {
        return contrId;
    }

    public void setContrId(String contrId) {
        this.contrId = contrId;
    }

    public String getDAbort() {
        return dAbort;
    }

    public void setDAbort(String dAbort) {
        this.dAbort = dAbort;
    }

    public String getDBeg() {
        return dBeg;
    }

    public void setDBeg(String dBeg) {
        this.dBeg = dBeg;
    }

    public String getDDistr() {
        return dDistr;
    }

    public void setDDistr(String dDistr) {
        this.dDistr = dDistr;
    }

    public String getDEnd() {
        return dEnd;
    }

    public void setDEnd(String dEnd) {
        this.dEnd = dEnd;
    }

    public String getDateNextTo() {
        return dateNextTo;
    }

    public void setDateNextTo(String dateNextTo) {
        this.dateNextTo = dateNextTo;
    }

    public String getDocIssueDate() {
        return docIssueDate;
    }

    public void setDocIssueDate(String docIssueDate) {
        this.docIssueDate = docIssueDate;
    }

    public String getDocIssued() {
        return docIssued;
    }

    public void setDocIssued(String docIssued) {
        this.docIssued = docIssued;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public Double getFranchise() {
        return franchise;
    }

    public void setFranchise(Double franchise) {
        this.franchise = franchise;
    }

    public Boolean getIsActive1() {
        return isActive1;
    }

    public void setIsActive1(Boolean isActive1) {
        this.isActive1 = isActive1;
    }

    public Boolean getIsActive10() {
        return isActive10;
    }

    public void setIsActive10(Boolean isActive10) {
        this.isActive10 = isActive10;
    }

    public Boolean getIsActive11() {
        return isActive11;
    }

    public void setIsActive11(Boolean isActive11) {
        this.isActive11 = isActive11;
    }

    public Boolean getIsActive12() {
        return isActive12;
    }

    public void setIsActive12(Boolean isActive12) {
        this.isActive12 = isActive12;
    }

    public Boolean getIsActive2() {
        return isActive2;
    }

    public void setIsActive2(Boolean isActive2) {
        this.isActive2 = isActive2;
    }

    public Boolean getIsActive3() {
        return isActive3;
    }

    public void setIsActive3(Boolean isActive3) {
        this.isActive3 = isActive3;
    }

    public Boolean getIsActive4() {
        return isActive4;
    }

    public void setIsActive4(Boolean isActive4) {
        this.isActive4 = isActive4;
    }

    public Boolean getIsActive5() {
        return isActive5;
    }

    public void setIsActive5(Boolean isActive5) {
        this.isActive5 = isActive5;
    }

    public Boolean getIsActive6() {
        return isActive6;
    }

    public void setIsActive6(Boolean isActive6) {
        this.isActive6 = isActive6;
    }

    public Boolean getIsActive7() {
        return isActive7;
    }

    public void setIsActive7(Boolean isActive7) {
        this.isActive7 = isActive7;
    }

    public Boolean getIsActive8() {
        return isActive8;
    }

    public void setIsActive8(Boolean isActive8) {
        this.isActive8 = isActive8;
    }

    public Boolean getIsActive9() {
        return isActive9;
    }

    public void setIsActive9(Boolean isActive9) {
        this.isActive9 = isActive9;
    }

    public Double getK1() {
        return k1;
    }

    public void setK1(Double k1) {
        this.k1 = k1;
    }

    public Double getK2() {
        return k2;
    }

    public void setK2(Double k2) {
        this.k2 = k2;
    }

    public Double getK3() {
        return k3;
    }

    public void setK3(Double k3) {
        this.k3 = k3;
    }

    public Double getK4() {
        return k4;
    }

    public void setK4(Double k4) {
        this.k4 = k4;
    }

    public Double getK5() {
        return k5;
    }

    public void setK5(Double k5) {
        this.k5 = k5;
    }

    public Double getK6() {
        return k6;
    }

    public void setK6(Double k6) {
        this.k6 = k6;
    }

    public Double getK7() {
        return k7;
    }

    public void setK7(Double k7) {
        this.k7 = k7;
    }

    public Double getLimitLife() {
        return limitLife;
    }

    public void setLimitLife(Double limitLife) {
        this.limitLife = limitLife;
    }

    public Double getLimitProp() {
        return limitProp;
    }

    public void setLimitProp(Double limitProp) {
        this.limitProp = limitProp;
    }

    public String getMarkTxt() {
        return markTxt;
    }

    public void setMarkTxt(String markTxt) {
        this.markTxt = markTxt;
    }

    public String getModelTxt() {
        return modelTxt;
    }

    public void setModelTxt(String modelTxt) {
        this.modelTxt = modelTxt;
    }

    public Integer getNagr() {
        return nagr;
    }

    public void setNagr(Integer nagr) {
        this.nagr = nagr;
    }

    public Boolean getNeedTo() {
        return needTo;
    }

    public void setNeedTo(Boolean needTo) {
        this.needTo = needTo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNumbIns() {
        return numbIns;
    }

    public void setNumbIns(String numbIns) {
        this.numbIns = numbIns;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public Double getPaymBal() {
        return paymBal;
    }

    public void setPaymBal(Double paymBal) {
        this.paymBal = paymBal;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getPersonS() {
        return personS;
    }

    public void setPersonS(String personS) {
        this.personS = personS;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getProdYear() {
        return prodYear;
    }

    public void setProdYear(Integer prodYear) {
        this.prodYear = prodYear;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Boolean getResident() {
        return resident;
    }

    public void setResident(Boolean resident) {
        this.resident = resident;
    }

    public Double getRetpayment() {
        return retpayment;
    }

    public void setRetpayment(Double retpayment) {
        this.retpayment = retpayment;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSagr() {
        return sagr;
    }

    public void setSagr(String sagr) {
        this.sagr = sagr;
    }

    public Integer getSphereUse() {
        return sphereUse;
    }

    public void setSphereUse(Integer sphereUse) {
        this.sphereUse = sphereUse;
    }

    public String getStatusPrs() {
        return statusPrs;
    }

    public void setStatusPrs(String statusPrs) {
        this.statusPrs = statusPrs;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

}