package cn.productai.api.pai.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.winwin.picreport.Bcontroller.PicSearchPic.dto.SimplePrdtSamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thinkpad on 2017/7/4.
 *
 */
public class SearchResult {
    @JsonProperty("simplePrdtSamp")
    private List<SimplePrdtSamp> simplePrdtSamp=new ArrayList<>();
    @JsonProperty("url")
    private String url;

    @JsonProperty("score")
    private double score;

    @JsonProperty("metadata")
    private String metadata;

    public List<SimplePrdtSamp> getSimplePrdtSamp() {
        return simplePrdtSamp;
    }

    public SearchResult setSimplePrdtSamp(List<SimplePrdtSamp> simplePrdtSamp) {
        this.simplePrdtSamp = simplePrdtSamp;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
