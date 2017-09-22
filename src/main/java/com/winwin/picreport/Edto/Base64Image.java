package com.winwin.picreport.Edto;

public class Base64Image {
    String base64str="";
    String imageName="";

    public String getBase64str() {
        return base64str;
    }

    public void setBase64str(String base64str) {
        this.base64str = base64str;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.Base64Image{");
        sb.append("base64str='").append(base64str).append('\'');
        sb.append(", imageName='").append(imageName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
