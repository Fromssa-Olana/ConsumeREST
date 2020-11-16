package com.consumingREST.consumeREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewYork {
    String section;
    String subsection;
    String title;
    String url;
    String uri;
    String byline;
    String item_type;
    String update_date;
    String published_date;
    String material_type_facet;
    String kicker;
    List<String> des_facet = new ArrayList();
    List org_facet = new ArrayList();
    List per_facet = new ArrayList();
    List geo_facet = new ArrayList();
    List<Media> multimedia = new ArrayList();


    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public List<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(List<String> des_facet) {
        this.des_facet = des_facet;
    }

    public List getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(List org_facet) {
        this.org_facet = org_facet;
    }

    public List getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(List per_facet) {
        this.per_facet = per_facet;
    }

    public List getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(List geo_facet) {
        this.geo_facet = geo_facet;
    }

    public List<Media> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Media> multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "NewYork{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", update_date='" + update_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + des_facet +
                ", org_facet=" + org_facet +
                ", per_facet=" + per_facet +
                ", geo_facet=" + geo_facet +
                ", multimedia=" + multimedia +
                '}';
    }


    private class Media {
        String url;
        String format;
        int height;
        int width;
        String type;
        String subtype;
        String caption;
        String copyright;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }
    }
}
