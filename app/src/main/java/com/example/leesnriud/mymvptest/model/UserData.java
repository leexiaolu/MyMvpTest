package com.example.leesnriud.mymvptest.model;

/**
 * Created by lee.snriud on 2018/4/23.
 */

public class UserData {

    /**
     * status : found
     * id : 54585
     * url : http://www.v2ex.com/member/leegoogle
     * username : leegoogle
     * website :
     * twitter :
     * psn :
     * github :
     * btc :
     * location :
     * tagline :
     * bio :
     * avatar_mini : //cdn.v2ex.com/gravatar/51eb55488a9360e301a131aa2a30f312?s=24&d=retro
     * avatar_normal : //cdn.v2ex.com/gravatar/51eb55488a9360e301a131aa2a30f312?s=48&d=retro
     * avatar_large : //cdn.v2ex.com/gravatar/51eb55488a9360e301a131aa2a30f312?s=73&d=retro
     * created : 1390203244
     */

    private String status;
    private int id;
    private String url;
    private String username;
    private String website;
    private String twitter;
    private String psn;
    private String github;
    private String btc;
    private String location;
    private String tagline;
    private String bio;
    private String avatar_mini;
    private String avatar_normal;
    private String avatar_large;
    private int created;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getPsn() {
        return psn;
    }

    public void setPsn(String psn) {
        this.psn = psn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getBtc() {
        return btc;
    }

    public void setBtc(String btc) {
        this.btc = btc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAvatar_mini() {
        return avatar_mini;
    }

    public void setAvatar_mini(String avatar_mini) {
        this.avatar_mini = avatar_mini;
    }

    public String getAvatar_normal() {
        return avatar_normal;
    }

    public void setAvatar_normal(String avatar_normal) {
        this.avatar_normal = avatar_normal;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    public int getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "status='" + status + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", website='" + website + '\'' +
                ", twitter='" + twitter + '\'' +
                ", psn='" + psn + '\'' +
                ", github='" + github + '\'' +
                ", btc='" + btc + '\'' +
                ", location='" + location + '\'' +
                ", tagline='" + tagline + '\'' +
                ", bio='" + bio + '\'' +
                ", avatar_mini='" + avatar_mini + '\'' +
                ", avatar_normal='" + avatar_normal + '\'' +
                ", avatar_large='" + avatar_large + '\'' +
                ", created=" + created +
                '}';
    }

    public void setCreated(int created) {
        this.created = created;
    }
}
