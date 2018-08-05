package ua.co.styx.messages.mtibu;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContractStatusResponse {

    @SerializedName("RequestUID")
    @Expose
    private String requestUID;
    @SerializedName("RequestExecTime")
    @Expose
    private String requestExecTime;
    @SerializedName("SearchResult")
    @Expose
    private List<CPVZContract> searchResult = null;

    public String getRequestUID() {
        return requestUID;
    }

    public void setRequestUID(String requestUID) {
        this.requestUID = requestUID;
    }

    public String getRequestExecTime() {
        return requestExecTime;
    }

    public void setRequestExecTime(String requestExecTime) {
        this.requestExecTime = requestExecTime;
    }

    public List<CPVZContract> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<CPVZContract> searchResult) {
        this.searchResult = searchResult;
    }

}